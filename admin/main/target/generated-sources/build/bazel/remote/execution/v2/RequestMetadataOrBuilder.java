// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

public interface RequestMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.RequestMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The details for the tool invoking the requests.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ToolDetails tool_details = 1;</code>
   */
  boolean hasToolDetails();
  /**
   * <pre>
   * The details for the tool invoking the requests.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ToolDetails tool_details = 1;</code>
   */
  build.bazel.remote.execution.v2.ToolDetails getToolDetails();
  /**
   * <pre>
   * The details for the tool invoking the requests.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ToolDetails tool_details = 1;</code>
   */
  build.bazel.remote.execution.v2.ToolDetailsOrBuilder getToolDetailsOrBuilder();

  /**
   * <pre>
   * An identifier that ties multiple requests to the same action.
   * For example, multiple requests to the CAS, Action Cache, and Execution
   * API are used in order to compile foo.cc.
   * </pre>
   *
   * <code>string action_id = 2;</code>
   */
  java.lang.String getActionId();
  /**
   * <pre>
   * An identifier that ties multiple requests to the same action.
   * For example, multiple requests to the CAS, Action Cache, and Execution
   * API are used in order to compile foo.cc.
   * </pre>
   *
   * <code>string action_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getActionIdBytes();

  /**
   * <pre>
   * An identifier that ties multiple actions together to a final result.
   * For example, multiple actions are required to build and run foo_test.
   * </pre>
   *
   * <code>string tool_invocation_id = 3;</code>
   */
  java.lang.String getToolInvocationId();
  /**
   * <pre>
   * An identifier that ties multiple actions together to a final result.
   * For example, multiple actions are required to build and run foo_test.
   * </pre>
   *
   * <code>string tool_invocation_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getToolInvocationIdBytes();

  /**
   * <pre>
   * An identifier to tie multiple tool invocations together. For example,
   * runs of foo_test, bar_test and baz_test on a post-submit of a given patch.
   * </pre>
   *
   * <code>string correlated_invocations_id = 4;</code>
   */
  java.lang.String getCorrelatedInvocationsId();
  /**
   * <pre>
   * An identifier to tie multiple tool invocations together. For example,
   * runs of foo_test, bar_test and baz_test on a post-submit of a given patch.
   * </pre>
   *
   * <code>string correlated_invocations_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getCorrelatedInvocationsIdBytes();
}
