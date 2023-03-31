// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

public interface ExecutedActionMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.ExecutedActionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the worker which ran the execution.
   * </pre>
   *
   * <code>string worker = 1;</code>
   */
  java.lang.String getWorker();
  /**
   * <pre>
   * The name of the worker which ran the execution.
   * </pre>
   *
   * <code>string worker = 1;</code>
   */
  com.google.protobuf.ByteString
      getWorkerBytes();

  /**
   * <pre>
   * When was the action added to the queue.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp queued_timestamp = 2;</code>
   */
  boolean hasQueuedTimestamp();
  /**
   * <pre>
   * When was the action added to the queue.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp queued_timestamp = 2;</code>
   */
  com.google.protobuf.Timestamp getQueuedTimestamp();
  /**
   * <pre>
   * When was the action added to the queue.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp queued_timestamp = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getQueuedTimestampOrBuilder();

  /**
   * <pre>
   * When the worker received the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_start_timestamp = 3;</code>
   */
  boolean hasWorkerStartTimestamp();
  /**
   * <pre>
   * When the worker received the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_start_timestamp = 3;</code>
   */
  com.google.protobuf.Timestamp getWorkerStartTimestamp();
  /**
   * <pre>
   * When the worker received the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_start_timestamp = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWorkerStartTimestampOrBuilder();

  /**
   * <pre>
   * When the worker completed the action, including all stages.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_completed_timestamp = 4;</code>
   */
  boolean hasWorkerCompletedTimestamp();
  /**
   * <pre>
   * When the worker completed the action, including all stages.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_completed_timestamp = 4;</code>
   */
  com.google.protobuf.Timestamp getWorkerCompletedTimestamp();
  /**
   * <pre>
   * When the worker completed the action, including all stages.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp worker_completed_timestamp = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWorkerCompletedTimestampOrBuilder();

  /**
   * <pre>
   * When the worker started fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_start_timestamp = 5;</code>
   */
  boolean hasInputFetchStartTimestamp();
  /**
   * <pre>
   * When the worker started fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_start_timestamp = 5;</code>
   */
  com.google.protobuf.Timestamp getInputFetchStartTimestamp();
  /**
   * <pre>
   * When the worker started fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_start_timestamp = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInputFetchStartTimestampOrBuilder();

  /**
   * <pre>
   * When the worker finished fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_completed_timestamp = 6;</code>
   */
  boolean hasInputFetchCompletedTimestamp();
  /**
   * <pre>
   * When the worker finished fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_completed_timestamp = 6;</code>
   */
  com.google.protobuf.Timestamp getInputFetchCompletedTimestamp();
  /**
   * <pre>
   * When the worker finished fetching action inputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp input_fetch_completed_timestamp = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInputFetchCompletedTimestampOrBuilder();

  /**
   * <pre>
   * When the worker started executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_start_timestamp = 7;</code>
   */
  boolean hasExecutionStartTimestamp();
  /**
   * <pre>
   * When the worker started executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_start_timestamp = 7;</code>
   */
  com.google.protobuf.Timestamp getExecutionStartTimestamp();
  /**
   * <pre>
   * When the worker started executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_start_timestamp = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExecutionStartTimestampOrBuilder();

  /**
   * <pre>
   * When the worker completed executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_completed_timestamp = 8;</code>
   */
  boolean hasExecutionCompletedTimestamp();
  /**
   * <pre>
   * When the worker completed executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_completed_timestamp = 8;</code>
   */
  com.google.protobuf.Timestamp getExecutionCompletedTimestamp();
  /**
   * <pre>
   * When the worker completed executing the action command.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_completed_timestamp = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExecutionCompletedTimestampOrBuilder();

  /**
   * <pre>
   * When the worker started uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_start_timestamp = 9;</code>
   */
  boolean hasOutputUploadStartTimestamp();
  /**
   * <pre>
   * When the worker started uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_start_timestamp = 9;</code>
   */
  com.google.protobuf.Timestamp getOutputUploadStartTimestamp();
  /**
   * <pre>
   * When the worker started uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_start_timestamp = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getOutputUploadStartTimestampOrBuilder();

  /**
   * <pre>
   * When the worker finished uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_completed_timestamp = 10;</code>
   */
  boolean hasOutputUploadCompletedTimestamp();
  /**
   * <pre>
   * When the worker finished uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_completed_timestamp = 10;</code>
   */
  com.google.protobuf.Timestamp getOutputUploadCompletedTimestamp();
  /**
   * <pre>
   * When the worker finished uploading action outputs.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp output_upload_completed_timestamp = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getOutputUploadCompletedTimestampOrBuilder();
}
