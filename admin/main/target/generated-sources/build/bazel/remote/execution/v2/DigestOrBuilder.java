// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

public interface DigestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.Digest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   */
  java.lang.String getHash();
  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <pre>
   * The size of the blob, in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 2;</code>
   */
  long getSizeBytes();
}
