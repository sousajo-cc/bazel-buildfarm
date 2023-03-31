// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

public interface BatchUpdateBlobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.BatchUpdateBlobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * The individual upload requests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request requests = 2;</code>
   */
  java.util.List<build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request> 
      getRequestsList();
  /**
   * <pre>
   * The individual upload requests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request requests = 2;</code>
   */
  build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request getRequests(int index);
  /**
   * <pre>
   * The individual upload requests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * The individual upload requests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request requests = 2;</code>
   */
  java.util.List<? extends build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.RequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * The individual upload requests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.Request requests = 2;</code>
   */
  build.bazel.remote.execution.v2.BatchUpdateBlobsRequest.RequestOrBuilder getRequestsOrBuilder(
      int index);
}
