// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface PollOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.PollOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operation name in question
   * </pre>
   *
   * <code>string operation_name = 2;</code>
   */
  java.lang.String getOperationName();
  /**
   * <pre>
   * The operation name in question
   * </pre>
   *
   * <code>string operation_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getOperationNameBytes();

  /**
   * <pre>
   * The current state of the worker
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
   */
  int getStageValue();
  /**
   * <pre>
   * The current state of the worker
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
   */
  build.bazel.remote.execution.v2.ExecutionStage.Value getStage();
}
