// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface QueuedOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.QueuedOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.build.bazel.remote.execution.v2.ExecuteOperationMetadata execute_operation_metadata = 1;</code>
   */
  boolean hasExecuteOperationMetadata();
  /**
   * <code>.build.bazel.remote.execution.v2.ExecuteOperationMetadata execute_operation_metadata = 1;</code>
   */
  build.bazel.remote.execution.v2.ExecuteOperationMetadata getExecuteOperationMetadata();
  /**
   * <code>.build.bazel.remote.execution.v2.ExecuteOperationMetadata execute_operation_metadata = 1;</code>
   */
  build.bazel.remote.execution.v2.ExecuteOperationMetadataOrBuilder getExecuteOperationMetadataOrBuilder();

  /**
   * <code>.build.bazel.remote.execution.v2.Digest queued_operation_digest = 2;</code>
   */
  boolean hasQueuedOperationDigest();
  /**
   * <code>.build.bazel.remote.execution.v2.Digest queued_operation_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.Digest getQueuedOperationDigest();
  /**
   * <code>.build.bazel.remote.execution.v2.Digest queued_operation_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getQueuedOperationDigestOrBuilder();

  /**
   * <code>.build.bazel.remote.execution.v2.RequestMetadata request_metadata = 3;</code>
   */
  boolean hasRequestMetadata();
  /**
   * <code>.build.bazel.remote.execution.v2.RequestMetadata request_metadata = 3;</code>
   */
  build.bazel.remote.execution.v2.RequestMetadata getRequestMetadata();
  /**
   * <code>.build.bazel.remote.execution.v2.RequestMetadata request_metadata = 3;</code>
   */
  build.bazel.remote.execution.v2.RequestMetadataOrBuilder getRequestMetadataOrBuilder();
}
