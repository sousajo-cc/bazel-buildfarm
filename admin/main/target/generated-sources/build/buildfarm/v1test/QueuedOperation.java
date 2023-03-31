// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

/**
 * Protobuf type {@code build.buildfarm.v1test.QueuedOperation}
 */
public  final class QueuedOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.buildfarm.v1test.QueuedOperation)
    QueuedOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueuedOperation.newBuilder() to construct.
  private QueuedOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueuedOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueuedOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueuedOperation(
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
            build.bazel.remote.execution.v2.Action.Builder subBuilder = null;
            if (action_ != null) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(build.bazel.remote.execution.v2.Action.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            build.bazel.remote.execution.v2.Command.Builder subBuilder = null;
            if (command_ != null) {
              subBuilder = command_.toBuilder();
            }
            command_ = input.readMessage(build.bazel.remote.execution.v2.Command.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(command_);
              command_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            build.bazel.remote.execution.v2.Tree.Builder subBuilder = null;
            if (legacyTree_ != null) {
              subBuilder = legacyTree_.toBuilder();
            }
            legacyTree_ = input.readMessage(build.bazel.remote.execution.v2.Tree.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(legacyTree_);
              legacyTree_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            build.buildfarm.v1test.Tree.Builder subBuilder = null;
            if (tree_ != null) {
              subBuilder = tree_.toBuilder();
            }
            tree_ = input.readMessage(build.buildfarm.v1test.Tree.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tree_);
              tree_ = subBuilder.buildPartial();
            }

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
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_QueuedOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_QueuedOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buildfarm.v1test.QueuedOperation.class, build.buildfarm.v1test.QueuedOperation.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private build.bazel.remote.execution.v2.Action action_;
  /**
   * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
   */
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
   */
  public build.bazel.remote.execution.v2.Action getAction() {
    return action_ == null ? build.bazel.remote.execution.v2.Action.getDefaultInstance() : action_;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
   */
  public build.bazel.remote.execution.v2.ActionOrBuilder getActionOrBuilder() {
    return getAction();
  }

  public static final int COMMAND_FIELD_NUMBER = 2;
  private build.bazel.remote.execution.v2.Command command_;
  /**
   * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
   */
  public boolean hasCommand() {
    return command_ != null;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
   */
  public build.bazel.remote.execution.v2.Command getCommand() {
    return command_ == null ? build.bazel.remote.execution.v2.Command.getDefaultInstance() : command_;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
   */
  public build.bazel.remote.execution.v2.CommandOrBuilder getCommandOrBuilder() {
    return getCommand();
  }

  public static final int LEGACY_TREE_FIELD_NUMBER = 4;
  private build.bazel.remote.execution.v2.Tree legacyTree_;
  /**
   * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
   */
  public boolean hasLegacyTree() {
    return legacyTree_ != null;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
   */
  public build.bazel.remote.execution.v2.Tree getLegacyTree() {
    return legacyTree_ == null ? build.bazel.remote.execution.v2.Tree.getDefaultInstance() : legacyTree_;
  }
  /**
   * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
   */
  public build.bazel.remote.execution.v2.TreeOrBuilder getLegacyTreeOrBuilder() {
    return getLegacyTree();
  }

  public static final int TREE_FIELD_NUMBER = 5;
  private build.buildfarm.v1test.Tree tree_;
  /**
   * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
   */
  public boolean hasTree() {
    return tree_ != null;
  }
  /**
   * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
   */
  public build.buildfarm.v1test.Tree getTree() {
    return tree_ == null ? build.buildfarm.v1test.Tree.getDefaultInstance() : tree_;
  }
  /**
   * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
   */
  public build.buildfarm.v1test.TreeOrBuilder getTreeOrBuilder() {
    return getTree();
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
    if (action_ != null) {
      output.writeMessage(1, getAction());
    }
    if (command_ != null) {
      output.writeMessage(2, getCommand());
    }
    if (legacyTree_ != null) {
      output.writeMessage(4, getLegacyTree());
    }
    if (tree_ != null) {
      output.writeMessage(5, getTree());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAction());
    }
    if (command_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCommand());
    }
    if (legacyTree_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLegacyTree());
    }
    if (tree_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTree());
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
    if (!(obj instanceof build.buildfarm.v1test.QueuedOperation)) {
      return super.equals(obj);
    }
    build.buildfarm.v1test.QueuedOperation other = (build.buildfarm.v1test.QueuedOperation) obj;

    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
    if (hasCommand() != other.hasCommand()) return false;
    if (hasCommand()) {
      if (!getCommand()
          .equals(other.getCommand())) return false;
    }
    if (hasLegacyTree() != other.hasLegacyTree()) return false;
    if (hasLegacyTree()) {
      if (!getLegacyTree()
          .equals(other.getLegacyTree())) return false;
    }
    if (hasTree() != other.hasTree()) return false;
    if (hasTree()) {
      if (!getTree()
          .equals(other.getTree())) return false;
    }
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
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    if (hasCommand()) {
      hash = (37 * hash) + COMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getCommand().hashCode();
    }
    if (hasLegacyTree()) {
      hash = (37 * hash) + LEGACY_TREE_FIELD_NUMBER;
      hash = (53 * hash) + getLegacyTree().hashCode();
    }
    if (hasTree()) {
      hash = (37 * hash) + TREE_FIELD_NUMBER;
      hash = (53 * hash) + getTree().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.QueuedOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.QueuedOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buildfarm.v1test.QueuedOperation parseFrom(
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
  public static Builder newBuilder(build.buildfarm.v1test.QueuedOperation prototype) {
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
   * Protobuf type {@code build.buildfarm.v1test.QueuedOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.buildfarm.v1test.QueuedOperation)
      build.buildfarm.v1test.QueuedOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_QueuedOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_QueuedOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buildfarm.v1test.QueuedOperation.class, build.buildfarm.v1test.QueuedOperation.Builder.class);
    }

    // Construct using build.buildfarm.v1test.QueuedOperation.newBuilder()
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
      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        action_ = null;
        actionBuilder_ = null;
      }
      if (commandBuilder_ == null) {
        command_ = null;
      } else {
        command_ = null;
        commandBuilder_ = null;
      }
      if (legacyTreeBuilder_ == null) {
        legacyTree_ = null;
      } else {
        legacyTree_ = null;
        legacyTreeBuilder_ = null;
      }
      if (treeBuilder_ == null) {
        tree_ = null;
      } else {
        tree_ = null;
        treeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buildfarm.v1test.OperationQueueProto.internal_static_build_buildfarm_v1test_QueuedOperation_descriptor;
    }

    @java.lang.Override
    public build.buildfarm.v1test.QueuedOperation getDefaultInstanceForType() {
      return build.buildfarm.v1test.QueuedOperation.getDefaultInstance();
    }

    @java.lang.Override
    public build.buildfarm.v1test.QueuedOperation build() {
      build.buildfarm.v1test.QueuedOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buildfarm.v1test.QueuedOperation buildPartial() {
      build.buildfarm.v1test.QueuedOperation result = new build.buildfarm.v1test.QueuedOperation(this);
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
      }
      if (commandBuilder_ == null) {
        result.command_ = command_;
      } else {
        result.command_ = commandBuilder_.build();
      }
      if (legacyTreeBuilder_ == null) {
        result.legacyTree_ = legacyTree_;
      } else {
        result.legacyTree_ = legacyTreeBuilder_.build();
      }
      if (treeBuilder_ == null) {
        result.tree_ = tree_;
      } else {
        result.tree_ = treeBuilder_.build();
      }
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
      if (other instanceof build.buildfarm.v1test.QueuedOperation) {
        return mergeFrom((build.buildfarm.v1test.QueuedOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buildfarm.v1test.QueuedOperation other) {
      if (other == build.buildfarm.v1test.QueuedOperation.getDefaultInstance()) return this;
      if (other.hasAction()) {
        mergeAction(other.getAction());
      }
      if (other.hasCommand()) {
        mergeCommand(other.getCommand());
      }
      if (other.hasLegacyTree()) {
        mergeLegacyTree(other.getLegacyTree());
      }
      if (other.hasTree()) {
        mergeTree(other.getTree());
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
      build.buildfarm.v1test.QueuedOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.buildfarm.v1test.QueuedOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private build.bazel.remote.execution.v2.Action action_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Action, build.bazel.remote.execution.v2.Action.Builder, build.bazel.remote.execution.v2.ActionOrBuilder> actionBuilder_;
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public boolean hasAction() {
      return actionBuilder_ != null || action_ != null;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public build.bazel.remote.execution.v2.Action getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? build.bazel.remote.execution.v2.Action.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public Builder setAction(build.bazel.remote.execution.v2.Action value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public Builder setAction(
        build.bazel.remote.execution.v2.Action.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public Builder mergeAction(build.bazel.remote.execution.v2.Action value) {
      if (actionBuilder_ == null) {
        if (action_ != null) {
          action_ =
            build.bazel.remote.execution.v2.Action.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        action_ = null;
        actionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public build.bazel.remote.execution.v2.Action.Builder getActionBuilder() {
      
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    public build.bazel.remote.execution.v2.ActionOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            build.bazel.remote.execution.v2.Action.getDefaultInstance() : action_;
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Action action = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Action, build.bazel.remote.execution.v2.Action.Builder, build.bazel.remote.execution.v2.ActionOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Action, build.bazel.remote.execution.v2.Action.Builder, build.bazel.remote.execution.v2.ActionOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }

    private build.bazel.remote.execution.v2.Command command_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Command, build.bazel.remote.execution.v2.Command.Builder, build.bazel.remote.execution.v2.CommandOrBuilder> commandBuilder_;
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public boolean hasCommand() {
      return commandBuilder_ != null || command_ != null;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public build.bazel.remote.execution.v2.Command getCommand() {
      if (commandBuilder_ == null) {
        return command_ == null ? build.bazel.remote.execution.v2.Command.getDefaultInstance() : command_;
      } else {
        return commandBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public Builder setCommand(build.bazel.remote.execution.v2.Command value) {
      if (commandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        command_ = value;
        onChanged();
      } else {
        commandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public Builder setCommand(
        build.bazel.remote.execution.v2.Command.Builder builderForValue) {
      if (commandBuilder_ == null) {
        command_ = builderForValue.build();
        onChanged();
      } else {
        commandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public Builder mergeCommand(build.bazel.remote.execution.v2.Command value) {
      if (commandBuilder_ == null) {
        if (command_ != null) {
          command_ =
            build.bazel.remote.execution.v2.Command.newBuilder(command_).mergeFrom(value).buildPartial();
        } else {
          command_ = value;
        }
        onChanged();
      } else {
        commandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public Builder clearCommand() {
      if (commandBuilder_ == null) {
        command_ = null;
        onChanged();
      } else {
        command_ = null;
        commandBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public build.bazel.remote.execution.v2.Command.Builder getCommandBuilder() {
      
      onChanged();
      return getCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    public build.bazel.remote.execution.v2.CommandOrBuilder getCommandOrBuilder() {
      if (commandBuilder_ != null) {
        return commandBuilder_.getMessageOrBuilder();
      } else {
        return command_ == null ?
            build.bazel.remote.execution.v2.Command.getDefaultInstance() : command_;
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Command command = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Command, build.bazel.remote.execution.v2.Command.Builder, build.bazel.remote.execution.v2.CommandOrBuilder> 
        getCommandFieldBuilder() {
      if (commandBuilder_ == null) {
        commandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Command, build.bazel.remote.execution.v2.Command.Builder, build.bazel.remote.execution.v2.CommandOrBuilder>(
                getCommand(),
                getParentForChildren(),
                isClean());
        command_ = null;
      }
      return commandBuilder_;
    }

    private build.bazel.remote.execution.v2.Tree legacyTree_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Tree, build.bazel.remote.execution.v2.Tree.Builder, build.bazel.remote.execution.v2.TreeOrBuilder> legacyTreeBuilder_;
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public boolean hasLegacyTree() {
      return legacyTreeBuilder_ != null || legacyTree_ != null;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public build.bazel.remote.execution.v2.Tree getLegacyTree() {
      if (legacyTreeBuilder_ == null) {
        return legacyTree_ == null ? build.bazel.remote.execution.v2.Tree.getDefaultInstance() : legacyTree_;
      } else {
        return legacyTreeBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public Builder setLegacyTree(build.bazel.remote.execution.v2.Tree value) {
      if (legacyTreeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        legacyTree_ = value;
        onChanged();
      } else {
        legacyTreeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public Builder setLegacyTree(
        build.bazel.remote.execution.v2.Tree.Builder builderForValue) {
      if (legacyTreeBuilder_ == null) {
        legacyTree_ = builderForValue.build();
        onChanged();
      } else {
        legacyTreeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public Builder mergeLegacyTree(build.bazel.remote.execution.v2.Tree value) {
      if (legacyTreeBuilder_ == null) {
        if (legacyTree_ != null) {
          legacyTree_ =
            build.bazel.remote.execution.v2.Tree.newBuilder(legacyTree_).mergeFrom(value).buildPartial();
        } else {
          legacyTree_ = value;
        }
        onChanged();
      } else {
        legacyTreeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public Builder clearLegacyTree() {
      if (legacyTreeBuilder_ == null) {
        legacyTree_ = null;
        onChanged();
      } else {
        legacyTree_ = null;
        legacyTreeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public build.bazel.remote.execution.v2.Tree.Builder getLegacyTreeBuilder() {
      
      onChanged();
      return getLegacyTreeFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    public build.bazel.remote.execution.v2.TreeOrBuilder getLegacyTreeOrBuilder() {
      if (legacyTreeBuilder_ != null) {
        return legacyTreeBuilder_.getMessageOrBuilder();
      } else {
        return legacyTree_ == null ?
            build.bazel.remote.execution.v2.Tree.getDefaultInstance() : legacyTree_;
      }
    }
    /**
     * <code>.build.bazel.remote.execution.v2.Tree legacy_tree = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Tree, build.bazel.remote.execution.v2.Tree.Builder, build.bazel.remote.execution.v2.TreeOrBuilder> 
        getLegacyTreeFieldBuilder() {
      if (legacyTreeBuilder_ == null) {
        legacyTreeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Tree, build.bazel.remote.execution.v2.Tree.Builder, build.bazel.remote.execution.v2.TreeOrBuilder>(
                getLegacyTree(),
                getParentForChildren(),
                isClean());
        legacyTree_ = null;
      }
      return legacyTreeBuilder_;
    }

    private build.buildfarm.v1test.Tree tree_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.Tree, build.buildfarm.v1test.Tree.Builder, build.buildfarm.v1test.TreeOrBuilder> treeBuilder_;
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public boolean hasTree() {
      return treeBuilder_ != null || tree_ != null;
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public build.buildfarm.v1test.Tree getTree() {
      if (treeBuilder_ == null) {
        return tree_ == null ? build.buildfarm.v1test.Tree.getDefaultInstance() : tree_;
      } else {
        return treeBuilder_.getMessage();
      }
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public Builder setTree(build.buildfarm.v1test.Tree value) {
      if (treeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tree_ = value;
        onChanged();
      } else {
        treeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public Builder setTree(
        build.buildfarm.v1test.Tree.Builder builderForValue) {
      if (treeBuilder_ == null) {
        tree_ = builderForValue.build();
        onChanged();
      } else {
        treeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public Builder mergeTree(build.buildfarm.v1test.Tree value) {
      if (treeBuilder_ == null) {
        if (tree_ != null) {
          tree_ =
            build.buildfarm.v1test.Tree.newBuilder(tree_).mergeFrom(value).buildPartial();
        } else {
          tree_ = value;
        }
        onChanged();
      } else {
        treeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public Builder clearTree() {
      if (treeBuilder_ == null) {
        tree_ = null;
        onChanged();
      } else {
        tree_ = null;
        treeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public build.buildfarm.v1test.Tree.Builder getTreeBuilder() {
      
      onChanged();
      return getTreeFieldBuilder().getBuilder();
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    public build.buildfarm.v1test.TreeOrBuilder getTreeOrBuilder() {
      if (treeBuilder_ != null) {
        return treeBuilder_.getMessageOrBuilder();
      } else {
        return tree_ == null ?
            build.buildfarm.v1test.Tree.getDefaultInstance() : tree_;
      }
    }
    /**
     * <code>.build.buildfarm.v1test.Tree tree = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buildfarm.v1test.Tree, build.buildfarm.v1test.Tree.Builder, build.buildfarm.v1test.TreeOrBuilder> 
        getTreeFieldBuilder() {
      if (treeBuilder_ == null) {
        treeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.buildfarm.v1test.Tree, build.buildfarm.v1test.Tree.Builder, build.buildfarm.v1test.TreeOrBuilder>(
                getTree(),
                getParentForChildren(),
                isClean());
        tree_ = null;
      }
      return treeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:build.buildfarm.v1test.QueuedOperation)
  }

  // @@protoc_insertion_point(class_scope:build.buildfarm.v1test.QueuedOperation)
  private static final build.buildfarm.v1test.QueuedOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buildfarm.v1test.QueuedOperation();
  }

  public static build.buildfarm.v1test.QueuedOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueuedOperation>
      PARSER = new com.google.protobuf.AbstractParser<QueuedOperation>() {
    @java.lang.Override
    public QueuedOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueuedOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueuedOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueuedOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buildfarm.v1test.QueuedOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

