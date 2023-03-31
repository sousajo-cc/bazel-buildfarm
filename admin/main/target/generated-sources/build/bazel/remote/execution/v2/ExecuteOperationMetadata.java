// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * Metadata about an ongoing
 * [execution][build.bazel.remote.execution.v2.Execution.Execute], which
 * will be contained in the [metadata
 * field][google.longrunning.Operation.response] of the
 * [Operation][google.longrunning.Operation].
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.ExecuteOperationMetadata}
 */
public  final class ExecuteOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.ExecuteOperationMetadata)
    ExecuteOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteOperationMetadata.newBuilder() to construct.
  private ExecuteOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteOperationMetadata() {
    stage_ = 0;
    stdoutStreamName_ = "";
    stderrStreamName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecuteOperationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            stage_ = rawValue;
            break;
          }
          case 18: {
            build.bazel.remote.execution.v2.Digest.Builder subBuilder = null;
            if (actionDigest_ != null) {
              subBuilder = actionDigest_.toBuilder();
            }
            actionDigest_ = input.readMessage(build.bazel.remote.execution.v2.Digest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(actionDigest_);
              actionDigest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            stdoutStreamName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            stderrStreamName_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecuteOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecuteOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.ExecuteOperationMetadata.class, build.bazel.remote.execution.v2.ExecuteOperationMetadata.Builder.class);
  }

  public static final int STAGE_FIELD_NUMBER = 1;
  private int stage_;
  /**
   * <pre>
   * The current stage of execution.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
   */
  public int getStageValue() {
    return stage_;
  }
  /**
   * <pre>
   * The current stage of execution.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
   */
  public build.bazel.remote.execution.v2.ExecutionStage.Value getStage() {
    @SuppressWarnings("deprecation")
    build.bazel.remote.execution.v2.ExecutionStage.Value result = build.bazel.remote.execution.v2.ExecutionStage.Value.valueOf(stage_);
    return result == null ? build.bazel.remote.execution.v2.ExecutionStage.Value.UNRECOGNIZED : result;
  }

  public static final int ACTION_DIGEST_FIELD_NUMBER = 2;
  private build.bazel.remote.execution.v2.Digest actionDigest_;
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * being executed.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public boolean hasActionDigest() {
    return actionDigest_ != null;
  }
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * being executed.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.Digest getActionDigest() {
    return actionDigest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
  }
  /**
   * <pre>
   * The digest of the [Action][build.bazel.remote.execution.v2.Action]
   * being executed.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
   */
  public build.bazel.remote.execution.v2.DigestOrBuilder getActionDigestOrBuilder() {
    return getActionDigest();
  }

  public static final int STDOUT_STREAM_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object stdoutStreamName_;
  /**
   * <pre>
   * If set, the client can use this name with
   * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
   * standard output.
   * </pre>
   *
   * <code>string stdout_stream_name = 3;</code>
   */
  public java.lang.String getStdoutStreamName() {
    java.lang.Object ref = stdoutStreamName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stdoutStreamName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If set, the client can use this name with
   * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
   * standard output.
   * </pre>
   *
   * <code>string stdout_stream_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStdoutStreamNameBytes() {
    java.lang.Object ref = stdoutStreamName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stdoutStreamName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STDERR_STREAM_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object stderrStreamName_;
  /**
   * <pre>
   * If set, the client can use this name with
   * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
   * standard error.
   * </pre>
   *
   * <code>string stderr_stream_name = 4;</code>
   */
  public java.lang.String getStderrStreamName() {
    java.lang.Object ref = stderrStreamName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stderrStreamName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If set, the client can use this name with
   * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
   * standard error.
   * </pre>
   *
   * <code>string stderr_stream_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getStderrStreamNameBytes() {
    java.lang.Object ref = stderrStreamName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stderrStreamName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stage_ != build.bazel.remote.execution.v2.ExecutionStage.Value.UNKNOWN.getNumber()) {
      output.writeEnum(1, stage_);
    }
    if (actionDigest_ != null) {
      output.writeMessage(2, getActionDigest());
    }
    if (!getStdoutStreamNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, stdoutStreamName_);
    }
    if (!getStderrStreamNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, stderrStreamName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stage_ != build.bazel.remote.execution.v2.ExecutionStage.Value.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, stage_);
    }
    if (actionDigest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getActionDigest());
    }
    if (!getStdoutStreamNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, stdoutStreamName_);
    }
    if (!getStderrStreamNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, stderrStreamName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.bazel.remote.execution.v2.ExecuteOperationMetadata)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.ExecuteOperationMetadata other = (build.bazel.remote.execution.v2.ExecuteOperationMetadata) obj;

    if (stage_ != other.stage_) return false;
    if (hasActionDigest() != other.hasActionDigest()) return false;
    if (hasActionDigest()) {
      if (!getActionDigest()
          .equals(other.getActionDigest())) return false;
    }
    if (!getStdoutStreamName()
        .equals(other.getStdoutStreamName())) return false;
    if (!getStderrStreamName()
        .equals(other.getStderrStreamName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STAGE_FIELD_NUMBER;
    hash = (53 * hash) + stage_;
    if (hasActionDigest()) {
      hash = (37 * hash) + ACTION_DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getActionDigest().hashCode();
    }
    hash = (37 * hash) + STDOUT_STREAM_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getStdoutStreamName().hashCode();
    hash = (37 * hash) + STDERR_STREAM_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getStderrStreamName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.bazel.remote.execution.v2.ExecuteOperationMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Metadata about an ongoing
   * [execution][build.bazel.remote.execution.v2.Execution.Execute], which
   * will be contained in the [metadata
   * field][google.longrunning.Operation.response] of the
   * [Operation][google.longrunning.Operation].
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.ExecuteOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.ExecuteOperationMetadata)
      build.bazel.remote.execution.v2.ExecuteOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecuteOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecuteOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.ExecuteOperationMetadata.class, build.bazel.remote.execution.v2.ExecuteOperationMetadata.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.ExecuteOperationMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stage_ = 0;

      if (actionDigestBuilder_ == null) {
        actionDigest_ = null;
      } else {
        actionDigest_ = null;
        actionDigestBuilder_ = null;
      }
      stdoutStreamName_ = "";

      stderrStreamName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_ExecuteOperationMetadata_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecuteOperationMetadata getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.ExecuteOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecuteOperationMetadata build() {
      build.bazel.remote.execution.v2.ExecuteOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.ExecuteOperationMetadata buildPartial() {
      build.bazel.remote.execution.v2.ExecuteOperationMetadata result = new build.bazel.remote.execution.v2.ExecuteOperationMetadata(this);
      result.stage_ = stage_;
      if (actionDigestBuilder_ == null) {
        result.actionDigest_ = actionDigest_;
      } else {
        result.actionDigest_ = actionDigestBuilder_.build();
      }
      result.stdoutStreamName_ = stdoutStreamName_;
      result.stderrStreamName_ = stderrStreamName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.ExecuteOperationMetadata) {
        return mergeFrom((build.bazel.remote.execution.v2.ExecuteOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.ExecuteOperationMetadata other) {
      if (other == build.bazel.remote.execution.v2.ExecuteOperationMetadata.getDefaultInstance()) return this;
      if (other.stage_ != 0) {
        setStageValue(other.getStageValue());
      }
      if (other.hasActionDigest()) {
        mergeActionDigest(other.getActionDigest());
      }
      if (!other.getStdoutStreamName().isEmpty()) {
        stdoutStreamName_ = other.stdoutStreamName_;
        onChanged();
      }
      if (!other.getStderrStreamName().isEmpty()) {
        stderrStreamName_ = other.stderrStreamName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      build.bazel.remote.execution.v2.ExecuteOperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.ExecuteOperationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int stage_ = 0;
    /**
     * <pre>
     * The current stage of execution.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
     */
    public int getStageValue() {
      return stage_;
    }
    /**
     * <pre>
     * The current stage of execution.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
     */
    public Builder setStageValue(int value) {
      stage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current stage of execution.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
     */
    public build.bazel.remote.execution.v2.ExecutionStage.Value getStage() {
      @SuppressWarnings("deprecation")
      build.bazel.remote.execution.v2.ExecutionStage.Value result = build.bazel.remote.execution.v2.ExecutionStage.Value.valueOf(stage_);
      return result == null ? build.bazel.remote.execution.v2.ExecutionStage.Value.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The current stage of execution.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
     */
    public Builder setStage(build.bazel.remote.execution.v2.ExecutionStage.Value value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      stage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current stage of execution.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 1;</code>
     */
    public Builder clearStage() {
      
      stage_ = 0;
      onChanged();
      return this;
    }

    private build.bazel.remote.execution.v2.Digest actionDigest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> actionDigestBuilder_;
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public boolean hasActionDigest() {
      return actionDigestBuilder_ != null || actionDigest_ != null;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest getActionDigest() {
      if (actionDigestBuilder_ == null) {
        return actionDigest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
      } else {
        return actionDigestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder setActionDigest(build.bazel.remote.execution.v2.Digest value) {
      if (actionDigestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        actionDigest_ = value;
        onChanged();
      } else {
        actionDigestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder setActionDigest(
        build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (actionDigestBuilder_ == null) {
        actionDigest_ = builderForValue.build();
        onChanged();
      } else {
        actionDigestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder mergeActionDigest(build.bazel.remote.execution.v2.Digest value) {
      if (actionDigestBuilder_ == null) {
        if (actionDigest_ != null) {
          actionDigest_ =
            build.bazel.remote.execution.v2.Digest.newBuilder(actionDigest_).mergeFrom(value).buildPartial();
        } else {
          actionDigest_ = value;
        }
        onChanged();
      } else {
        actionDigestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public Builder clearActionDigest() {
      if (actionDigestBuilder_ == null) {
        actionDigest_ = null;
        onChanged();
      } else {
        actionDigest_ = null;
        actionDigestBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder getActionDigestBuilder() {
      
      onChanged();
      return getActionDigestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    public build.bazel.remote.execution.v2.DigestOrBuilder getActionDigestOrBuilder() {
      if (actionDigestBuilder_ != null) {
        return actionDigestBuilder_.getMessageOrBuilder();
      } else {
        return actionDigest_ == null ?
            build.bazel.remote.execution.v2.Digest.getDefaultInstance() : actionDigest_;
      }
    }
    /**
     * <pre>
     * The digest of the [Action][build.bazel.remote.execution.v2.Action]
     * being executed.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest action_digest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> 
        getActionDigestFieldBuilder() {
      if (actionDigestBuilder_ == null) {
        actionDigestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder>(
                getActionDigest(),
                getParentForChildren(),
                isClean());
        actionDigest_ = null;
      }
      return actionDigestBuilder_;
    }

    private java.lang.Object stdoutStreamName_ = "";
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard output.
     * </pre>
     *
     * <code>string stdout_stream_name = 3;</code>
     */
    public java.lang.String getStdoutStreamName() {
      java.lang.Object ref = stdoutStreamName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stdoutStreamName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard output.
     * </pre>
     *
     * <code>string stdout_stream_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStdoutStreamNameBytes() {
      java.lang.Object ref = stdoutStreamName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stdoutStreamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard output.
     * </pre>
     *
     * <code>string stdout_stream_name = 3;</code>
     */
    public Builder setStdoutStreamName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stdoutStreamName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard output.
     * </pre>
     *
     * <code>string stdout_stream_name = 3;</code>
     */
    public Builder clearStdoutStreamName() {
      
      stdoutStreamName_ = getDefaultInstance().getStdoutStreamName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard output.
     * </pre>
     *
     * <code>string stdout_stream_name = 3;</code>
     */
    public Builder setStdoutStreamNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stdoutStreamName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object stderrStreamName_ = "";
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard error.
     * </pre>
     *
     * <code>string stderr_stream_name = 4;</code>
     */
    public java.lang.String getStderrStreamName() {
      java.lang.Object ref = stderrStreamName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stderrStreamName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard error.
     * </pre>
     *
     * <code>string stderr_stream_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getStderrStreamNameBytes() {
      java.lang.Object ref = stderrStreamName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stderrStreamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard error.
     * </pre>
     *
     * <code>string stderr_stream_name = 4;</code>
     */
    public Builder setStderrStreamName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stderrStreamName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard error.
     * </pre>
     *
     * <code>string stderr_stream_name = 4;</code>
     */
    public Builder clearStderrStreamName() {
      
      stderrStreamName_ = getDefaultInstance().getStderrStreamName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the client can use this name with
     * [ByteStream.Read][google.bytestream.ByteStream.Read] to stream the
     * standard error.
     * </pre>
     *
     * <code>string stderr_stream_name = 4;</code>
     */
    public Builder setStderrStreamNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stderrStreamName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.ExecuteOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.ExecuteOperationMetadata)
  private static final build.bazel.remote.execution.v2.ExecuteOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.ExecuteOperationMetadata();
  }

  public static build.bazel.remote.execution.v2.ExecuteOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteOperationMetadata>() {
    @java.lang.Override
    public ExecuteOperationMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecuteOperationMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecuteOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.ExecuteOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

