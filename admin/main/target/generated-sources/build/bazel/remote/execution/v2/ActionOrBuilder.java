// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The digest of the [Command][build.bazel.remote.execution.v2.Command]
   * to run, which MUST be present in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest command_digest = 1;</code>
   */
  boolean hasCommandDigest();
  /**
   * <pre>
   * The digest of the [Command][build.bazel.remote.execution.v2.Command]
   * to run, which MUST be present in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest command_digest = 1;</code>
   */
  build.bazel.remote.execution.v2.Digest getCommandDigest();
  /**
   * <pre>
   * The digest of the [Command][build.bazel.remote.execution.v2.Command]
   * to run, which MUST be present in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest command_digest = 1;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getCommandDigestOrBuilder();

  /**
   * <pre>
   * The digest of the root
   * [Directory][build.bazel.remote.execution.v2.Directory] for the input
   * files. The files in the directory tree are available in the correct
   * location on the build machine before the command is executed. The root
   * directory, as well as every subdirectory and content blob referred to, MUST
   * be in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest input_root_digest = 2;</code>
   */
  boolean hasInputRootDigest();
  /**
   * <pre>
   * The digest of the root
   * [Directory][build.bazel.remote.execution.v2.Directory] for the input
   * files. The files in the directory tree are available in the correct
   * location on the build machine before the command is executed. The root
   * directory, as well as every subdirectory and content blob referred to, MUST
   * be in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest input_root_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.Digest getInputRootDigest();
  /**
   * <pre>
   * The digest of the root
   * [Directory][build.bazel.remote.execution.v2.Directory] for the input
   * files. The files in the directory tree are available in the correct
   * location on the build machine before the command is executed. The root
   * directory, as well as every subdirectory and content blob referred to, MUST
   * be in the
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest input_root_digest = 2;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getInputRootDigestOrBuilder();

  /**
   * <pre>
   * A timeout after which the execution should be killed. If the timeout is
   * absent, then the client is specifying that the execution should continue
   * as long as the server will let it. The server SHOULD impose a timeout if
   * the client does not specify one, however, if the client does specify a
   * timeout that is longer than the server's maximum timeout, the server MUST
   * reject the request.
   * The timeout is a part of the
   * [Action][build.bazel.remote.execution.v2.Action] message, and
   * therefore two `Actions` with different timeouts are different, even if they
   * are otherwise identical. This is because, if they were not, running an
   * `Action` with a lower timeout than is required might result in a cache hit
   * from an execution run with a longer timeout, hiding the fact that the
   * timeout is too short. By encoding it directly in the `Action`, a lower
   * timeout will result in a cache miss and the execution timeout will fail
   * immediately, rather than whenever the cache entry gets evicted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   */
  boolean hasTimeout();
  /**
   * <pre>
   * A timeout after which the execution should be killed. If the timeout is
   * absent, then the client is specifying that the execution should continue
   * as long as the server will let it. The server SHOULD impose a timeout if
   * the client does not specify one, however, if the client does specify a
   * timeout that is longer than the server's maximum timeout, the server MUST
   * reject the request.
   * The timeout is a part of the
   * [Action][build.bazel.remote.execution.v2.Action] message, and
   * therefore two `Actions` with different timeouts are different, even if they
   * are otherwise identical. This is because, if they were not, running an
   * `Action` with a lower timeout than is required might result in a cache hit
   * from an execution run with a longer timeout, hiding the fact that the
   * timeout is too short. By encoding it directly in the `Action`, a lower
   * timeout will result in a cache miss and the execution timeout will fail
   * immediately, rather than whenever the cache entry gets evicted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * A timeout after which the execution should be killed. If the timeout is
   * absent, then the client is specifying that the execution should continue
   * as long as the server will let it. The server SHOULD impose a timeout if
   * the client does not specify one, however, if the client does specify a
   * timeout that is longer than the server's maximum timeout, the server MUST
   * reject the request.
   * The timeout is a part of the
   * [Action][build.bazel.remote.execution.v2.Action] message, and
   * therefore two `Actions` with different timeouts are different, even if they
   * are otherwise identical. This is because, if they were not, running an
   * `Action` with a lower timeout than is required might result in a cache hit
   * from an execution run with a longer timeout, hiding the fact that the
   * timeout is too short. By encoding it directly in the `Action`, a lower
   * timeout will result in a cache miss and the execution timeout will fail
   * immediately, rather than whenever the cache entry gets evicted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * If true, then the `Action`'s result cannot be cached, and in-flight
   * requests for the same `Action` may not be merged.
   * </pre>
   *
   * <code>bool do_not_cache = 7;</code>
   */
  boolean getDoNotCache();
}
