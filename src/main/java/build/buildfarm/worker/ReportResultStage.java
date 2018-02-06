// Copyright 2017 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.worker;

import build.buildfarm.common.DigestUtil;
import build.buildfarm.v1test.CompletedOperationMetadata;
import com.google.common.collect.Iterables;
import com.google.devtools.remoteexecution.v1test.ActionResult;
import com.google.devtools.remoteexecution.v1test.ExecuteOperationMetadata;
import com.google.devtools.remoteexecution.v1test.ExecuteResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Duration;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.StatusRuntimeException;
import com.google.protobuf.util.Durations;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class ReportResultStage extends PipelineStage {
  private final BlockingQueue<OperationContext> queue;

  public static class NullStage extends PipelineStage {
    public NullStage() {
      super(null, null, null, null);
    }

    @Override
    public boolean claim() { return true; }
    @Override
    public void release() { }
    @Override
    public OperationContext take() { throw new UnsupportedOperationException(); }
    @Override
    public void put(OperationContext operation) { }
    @Override
    public void setInput(PipelineStage input) { }
    @Override
    public void run() { }
    @Override
    public void close() { }
    @Override
    public boolean isClosed() { return false; }
  }

  public ReportResultStage(WorkerContext workerContext, PipelineStage error) {
    super("ReportResultStage", workerContext, new NullStage(), error);
    queue = new ArrayBlockingQueue<>(1);
  }

  @Override
  public OperationContext take() throws InterruptedException {
    return queue.take();
  }

  @Override
  public void put(OperationContext operationContext) throws InterruptedException {
    queue.put(operationContext);
  }

  private DigestUtil getDigestUtil() {
    return workerContext.getDigestUtil();
  }

  @Override
  protected OperationContext tick(OperationContext operationContext) throws InterruptedException {
    ActionResult.Builder resultBuilder;
    try {
      resultBuilder = operationContext
          .operation.getResponse().unpack(ExecuteResponse.class).getResult().toBuilder();
    } catch (InvalidProtocolBufferException e) {
      e.printStackTrace();
      return null;
    }

    Poller poller = workerContext.createPoller(
        "ReportResultStage",
        operationContext.operation.getName(),
        ExecuteOperationMetadata.Stage.EXECUTING,
        () -> {});

    long reportStartAt = System.nanoTime();

    try {
      workerContext.uploadOutputs(
          resultBuilder,
          operationContext.execDir,
          operationContext.action.getOutputFilesList(),
          operationContext.action.getOutputDirectoriesList());
    } catch (IOException ex) {
      throw new IllegalStateException(ex);
    } catch (StatusRuntimeException e) {
      poller.stop();
      return null;
    }

    ActionResult result = resultBuilder.build();
    if (!operationContext.action.getDoNotCache() && resultBuilder.getExitCode() == 0) {
      workerContext.putActionResult(DigestUtil.asActionKey(operationContext.metadata.getActionDigest()), result);
    }

    Duration reportedIn = Durations.fromNanos(System.nanoTime() - reportStartAt);

    long completedAt = System.currentTimeMillis();

    CompletedOperationMetadata metadata = CompletedOperationMetadata.newBuilder()
        .setCompletedAt(completedAt)
        .setExecutedOn(workerContext.getName())
        .setFetchedIn(operationContext.fetchedIn)
        .setExecutedIn(operationContext.executedIn)
        .setReportedIn(reportedIn)
        .setExecuteOperationMetadata(operationContext.metadata.toBuilder()
            .setStage(ExecuteOperationMetadata.Stage.COMPLETED)
            .build())
        .build();

    Operation operation = operationContext.operation.toBuilder()
        .setDone(true)
        .setMetadata(Any.pack(metadata))
        .setResponse(Any.pack(ExecuteResponse.newBuilder()
            .setResult(result)
            .setCachedResult(false)
            .build()))
        .build();

    poller.stop();

    try {
      if (!workerContext.putOperation(operation, operationContext.action)) {
        return null;
      }
    } catch (IOException e) {
      return null;
    }

    return operationContext.toBuilder()
        .setMetadata(metadata.getExecuteOperationMetadata())
        .build();
  }

  @Override
  protected void after(OperationContext operationContext) {
    try {
      workerContext.destroyActionRoot(operationContext.execDir);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } catch (IOException e) {
      // move to logging
      // workerContext.logInfo("Failed to remove action root " + operationContext.execDir);
    }
  }
}
