// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface ProfiledQueuedOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.ProfiledQueuedOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.build.buildfarm.v1test.QueuedOperation queued_operation = 1;</code>
   */
  boolean hasQueuedOperation();
  /**
   * <code>.build.buildfarm.v1test.QueuedOperation queued_operation = 1;</code>
   */
  build.buildfarm.v1test.QueuedOperation getQueuedOperation();
  /**
   * <code>.build.buildfarm.v1test.QueuedOperation queued_operation = 1;</code>
   */
  build.buildfarm.v1test.QueuedOperationOrBuilder getQueuedOperationOrBuilder();

  /**
   * <code>.build.buildfarm.v1test.QueuedOperationMetadata queued_operation_metadata = 2;</code>
   */
  boolean hasQueuedOperationMetadata();
  /**
   * <code>.build.buildfarm.v1test.QueuedOperationMetadata queued_operation_metadata = 2;</code>
   */
  build.buildfarm.v1test.QueuedOperationMetadata getQueuedOperationMetadata();
  /**
   * <code>.build.buildfarm.v1test.QueuedOperationMetadata queued_operation_metadata = 2;</code>
   */
  build.buildfarm.v1test.QueuedOperationMetadataOrBuilder getQueuedOperationMetadataOrBuilder();

  /**
   * <code>.google.protobuf.Duration transformed_in = 3;</code>
   */
  boolean hasTransformedIn();
  /**
   * <code>.google.protobuf.Duration transformed_in = 3;</code>
   */
  com.google.protobuf.Duration getTransformedIn();
  /**
   * <code>.google.protobuf.Duration transformed_in = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTransformedInOrBuilder();

  /**
   * <code>.google.protobuf.Duration validated_in = 4;</code>
   */
  boolean hasValidatedIn();
  /**
   * <code>.google.protobuf.Duration validated_in = 4;</code>
   */
  com.google.protobuf.Duration getValidatedIn();
  /**
   * <code>.google.protobuf.Duration validated_in = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getValidatedInOrBuilder();

  /**
   * <code>.google.protobuf.Duration uploaded_in = 5;</code>
   */
  boolean hasUploadedIn();
  /**
   * <code>.google.protobuf.Duration uploaded_in = 5;</code>
   */
  com.google.protobuf.Duration getUploadedIn();
  /**
   * <code>.google.protobuf.Duration uploaded_in = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getUploadedInOrBuilder();
}
