// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.ShutDownWorkerGracefullyRequest}
 */
public  final class ShutDownWorkerGracefullyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)
    ShutDownWorkerGracefullyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShutDownWorkerGracefullyRequest.newBuilder() to construct.
  private ShutDownWorkerGracefullyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShutDownWorkerGracefullyRequest() {
    instanceName_ = "";
    workerName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShutDownWorkerGracefullyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShutDownWorkerGracefullyRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            workerName_ = s;
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
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_ShutDownWorkerGracefullyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_ShutDownWorkerGracefullyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.class, build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.Builder.class);
  }

  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceName_;
  /**
   * <code>string instance_name = 1;</code>
   */
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   * <code>string instance_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object workerName_;
  /**
   * <code>string worker_name = 2;</code>
   */
  public java.lang.String getWorkerName() {
    java.lang.Object ref = workerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workerName_ = s;
      return s;
    }
  }
  /**
   * <code>string worker_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getWorkerNameBytes() {
    java.lang.Object ref = workerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workerName_ = b;
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
    if (!getInstanceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    if (!getWorkerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workerName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    if (!getWorkerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workerName_);
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
    if (!(obj instanceof build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.ShutDownWorkerGracefullyRequest other = (build.buildfarm.v1test.ShutDownWorkerGracefullyRequest) obj;

    if (!getInstanceName()
        .equals(other.getInstanceName())) return false;
    if (!getWorkerName()
        .equals(other.getWorkerName())) return false;
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
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    hash = (37 * hash) + WORKER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getWorkerName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parseFrom(
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
  public static Builder newBuilder(build.buildfarm.v1test.ShutDownWorkerGracefullyRequest prototype) {
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
   * Protobuf type {@code build.buildfarm.v1test.ShutDownWorkerGracefullyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)
      build.buildfarm.v1test.ShutDownWorkerGracefullyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_ShutDownWorkerGracefullyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_ShutDownWorkerGracefullyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.class, build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.Builder.class);
    }

    // Construct using build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.newBuilder()
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
      instanceName_ = "";

      workerName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_ShutDownWorkerGracefullyRequest_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.ShutDownWorkerGracefullyRequest getDefaultInstanceForType() {
      return build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.ShutDownWorkerGracefullyRequest build() {
      build.buildfarm.v1test.ShutDownWorkerGracefullyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.ShutDownWorkerGracefullyRequest buildPartial() {
      build.buildfarm.v1test.ShutDownWorkerGracefullyRequest result = new build.buildfarm.v1test.ShutDownWorkerGracefullyRequest(this);
      result.instanceName_ = instanceName_;
      result.workerName_ = workerName_;
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
      if (other instanceof build.buildfarm.v1test.ShutDownWorkerGracefullyRequest) {
        return mergeFrom((build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.ShutDownWorkerGracefullyRequest other) {
      if (other == build.buildfarm.v1test.ShutDownWorkerGracefullyRequest.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (!other.getWorkerName().isEmpty()) {
        workerName_ = other.workerName_;
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
      build.buildfarm.v1test.ShutDownWorkerGracefullyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.ShutDownWorkerGracefullyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instanceName_ = "";
    /**
     * <code>string instance_name = 1;</code>
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder clearInstanceName() {
      
      instanceName_ = getDefaultInstance().getInstanceName();
      onChanged();
      return this;
    }
    /**
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object workerName_ = "";
    /**
     * <code>string worker_name = 2;</code>
     */
    public java.lang.String getWorkerName() {
      java.lang.Object ref = workerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string worker_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWorkerNameBytes() {
      java.lang.Object ref = workerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string worker_name = 2;</code>
     */
    public Builder setWorkerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string worker_name = 2;</code>
     */
    public Builder clearWorkerName() {
      
      workerName_ = getDefaultInstance().getWorkerName();
      onChanged();
      return this;
    }
    /**
     * <code>string worker_name = 2;</code>
     */
    public Builder setWorkerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workerName_ = value;
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


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.ShutDownWorkerGracefullyRequest)
  private static final build.buildfarm.v1test.ShutDownWorkerGracefullyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.ShutDownWorkerGracefullyRequest();
  }

  public static build.buildfarm.v1test.ShutDownWorkerGracefullyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShutDownWorkerGracefullyRequest>
      PARSER = new com.google.protobuf.AbstractParser<ShutDownWorkerGracefullyRequest>() {
    @java.lang.Override
    public ShutDownWorkerGracefullyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShutDownWorkerGracefullyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShutDownWorkerGracefullyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShutDownWorkerGracefullyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.ShutDownWorkerGracefullyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

