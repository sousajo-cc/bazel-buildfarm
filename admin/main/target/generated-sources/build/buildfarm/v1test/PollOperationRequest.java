// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.PollOperationRequest}
 */
public  final class PollOperationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.PollOperationRequest)
    PollOperationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollOperationRequest.newBuilder() to construct.
  private PollOperationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollOperationRequest() {
    operationName_ = "";
    stage_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PollOperationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PollOperationRequest(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            operationName_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            stage_ = rawValue;
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
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_PollOperationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_PollOperationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.PollOperationRequest.class, build.buildfarm.v1test.PollOperationRequest.Builder.class);
  }

  public static final int OPERATION_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object operationName_;
  /**
   * <pre>
   * The operation name in question
   * </pre>
   *
   * <code>string operation_name = 2;</code>
   */
  public java.lang.String getOperationName() {
    java.lang.Object ref = operationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The operation name in question
   * </pre>
   *
   * <code>string operation_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOperationNameBytes() {
    java.lang.Object ref = operationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAGE_FIELD_NUMBER = 3;
  private int stage_;
  /**
   * <pre>
   * The current state of the worker
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
   */
  public int getStageValue() {
    return stage_;
  }
  /**
   * <pre>
   * The current state of the worker
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
   */
  public build.bazel.remote.execution.v2.ExecutionStage.Value getStage() {
    @SuppressWarnings("deprecation")
    build.bazel.remote.execution.v2.ExecutionStage.Value result = build.bazel.remote.execution.v2.ExecutionStage.Value.valueOf(stage_);
    return result == null ? build.bazel.remote.execution.v2.ExecutionStage.Value.UNRECOGNIZED : result;
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
    if (!getOperationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationName_);
    }
    if (stage_ != build.bazel.remote.execution.v2.ExecutionStage.Value.UNKNOWN.getNumber()) {
      output.writeEnum(3, stage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOperationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationName_);
    }
    if (stage_ != build.bazel.remote.execution.v2.ExecutionStage.Value.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, stage_);
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
    if (!(obj instanceof build.buildfarm.v1test.PollOperationRequest)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.PollOperationRequest other = (build.buildfarm.v1test.PollOperationRequest) obj;

    if (!getOperationName()
        .equals(other.getOperationName())) return false;
    if (stage_ != other.stage_) return false;
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
    hash = (37 * hash) + OPERATION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getOperationName().hashCode();
    hash = (37 * hash) + STAGE_FIELD_NUMBER;
    hash = (53 * hash) + stage_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.PollOperationRequest parseFrom(
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
  public static Builder newBuilder(build.buildfarm.v1test.PollOperationRequest prototype) {
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
   * Protobuf type {@code build.buildfarm.v1test.PollOperationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.PollOperationRequest)
      build.buildfarm.v1test.PollOperationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_PollOperationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_PollOperationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.PollOperationRequest.class, build.buildfarm.v1test.PollOperationRequest.Builder.class);
    }

    // Construct using build.buildfarm.v1test.PollOperationRequest.newBuilder()
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
      operationName_ = "";

      stage_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_PollOperationRequest_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.PollOperationRequest getDefaultInstanceForType() {
      return build.buildfarm.v1test.PollOperationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.PollOperationRequest build() {
      build.buildfarm.v1test.PollOperationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.PollOperationRequest buildPartial() {
      build.buildfarm.v1test.PollOperationRequest result = new build.buildfarm.v1test.PollOperationRequest(this);
      result.operationName_ = operationName_;
      result.stage_ = stage_;
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
      if (other instanceof build.buildfarm.v1test.PollOperationRequest) {
        return mergeFrom((build.buildfarm.v1test.PollOperationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.PollOperationRequest other) {
      if (other == build.buildfarm.v1test.PollOperationRequest.getDefaultInstance()) return this;
      if (!other.getOperationName().isEmpty()) {
        operationName_ = other.operationName_;
        onChanged();
      }
      if (other.stage_ != 0) {
        setStageValue(other.getStageValue());
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
      build.buildfarm.v1test.PollOperationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.PollOperationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object operationName_ = "";
    /**
     * <pre>
     * The operation name in question
     * </pre>
     *
     * <code>string operation_name = 2;</code>
     */
    public java.lang.String getOperationName() {
      java.lang.Object ref = operationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The operation name in question
     * </pre>
     *
     * <code>string operation_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOperationNameBytes() {
      java.lang.Object ref = operationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The operation name in question
     * </pre>
     *
     * <code>string operation_name = 2;</code>
     */
    public Builder setOperationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operation name in question
     * </pre>
     *
     * <code>string operation_name = 2;</code>
     */
    public Builder clearOperationName() {
      
      operationName_ = getDefaultInstance().getOperationName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operation name in question
     * </pre>
     *
     * <code>string operation_name = 2;</code>
     */
    public Builder setOperationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationName_ = value;
      onChanged();
      return this;
    }

    private int stage_ = 0;
    /**
     * <pre>
     * The current state of the worker
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
     */
    public int getStageValue() {
      return stage_;
    }
    /**
     * <pre>
     * The current state of the worker
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
     */
    public Builder setStageValue(int value) {
      stage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The current state of the worker
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
     */
    public build.bazel.remote.execution.v2.ExecutionStage.Value getStage() {
      @SuppressWarnings("deprecation")
      build.bazel.remote.execution.v2.ExecutionStage.Value result = build.bazel.remote.execution.v2.ExecutionStage.Value.valueOf(stage_);
      return result == null ? build.bazel.remote.execution.v2.ExecutionStage.Value.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The current state of the worker
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
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
     * The current state of the worker
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.ExecutionStage.Value stage = 3;</code>
     */
    public Builder clearStage() {
      
      stage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.PollOperationRequest)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.PollOperationRequest)
  private static final build.buildfarm.v1test.PollOperationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.PollOperationRequest();
  }

  public static build.buildfarm.v1test.PollOperationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollOperationRequest>
      PARSER = new com.google.protobuf.AbstractParser<PollOperationRequest>() {
    @java.lang.Override
    public PollOperationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PollOperationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PollOperationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollOperationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.PollOperationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

