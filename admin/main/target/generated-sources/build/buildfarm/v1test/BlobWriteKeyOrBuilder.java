// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface BlobWriteKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.BlobWriteKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  boolean hasDigest();
  /**
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  build.bazel.remote.execution.v2.Digest getDigest();
  /**
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder();

  /**
   * <code>string identifier = 2;</code>
   */
  java.lang.String getIdentifier();
  /**
   * <code>string identifier = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();
}
