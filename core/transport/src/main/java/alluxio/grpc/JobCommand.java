// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.job.JobCommand}
 */
public  final class JobCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.job.JobCommand)
    JobCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobCommand.newBuilder() to construct.
  private JobCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobCommand() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobCommand(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            alluxio.grpc.RunTaskCommand.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = runTaskCommand_.toBuilder();
            }
            runTaskCommand_ = input.readMessage(alluxio.grpc.RunTaskCommand.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(runTaskCommand_);
              runTaskCommand_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            alluxio.grpc.CancelTaskCommand.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = cancelTaskCommand_.toBuilder();
            }
            cancelTaskCommand_ = input.readMessage(alluxio.grpc.CancelTaskCommand.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cancelTaskCommand_);
              cancelTaskCommand_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            alluxio.grpc.RegisterCommand.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = registerCommand_.toBuilder();
            }
            registerCommand_ = input.readMessage(alluxio.grpc.RegisterCommand.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(registerCommand_);
              registerCommand_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobCommand_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.JobCommand.class, alluxio.grpc.JobCommand.Builder.class);
  }

  private int bitField0_;
  public static final int RUNTASKCOMMAND_FIELD_NUMBER = 1;
  private alluxio.grpc.RunTaskCommand runTaskCommand_;
  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  public boolean hasRunTaskCommand() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  public alluxio.grpc.RunTaskCommand getRunTaskCommand() {
    return runTaskCommand_ == null ? alluxio.grpc.RunTaskCommand.getDefaultInstance() : runTaskCommand_;
  }
  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  public alluxio.grpc.RunTaskCommandOrBuilder getRunTaskCommandOrBuilder() {
    return runTaskCommand_ == null ? alluxio.grpc.RunTaskCommand.getDefaultInstance() : runTaskCommand_;
  }

  public static final int CANCELTASKCOMMAND_FIELD_NUMBER = 2;
  private alluxio.grpc.CancelTaskCommand cancelTaskCommand_;
  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  public boolean hasCancelTaskCommand() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  public alluxio.grpc.CancelTaskCommand getCancelTaskCommand() {
    return cancelTaskCommand_ == null ? alluxio.grpc.CancelTaskCommand.getDefaultInstance() : cancelTaskCommand_;
  }
  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  public alluxio.grpc.CancelTaskCommandOrBuilder getCancelTaskCommandOrBuilder() {
    return cancelTaskCommand_ == null ? alluxio.grpc.CancelTaskCommand.getDefaultInstance() : cancelTaskCommand_;
  }

  public static final int REGISTERCOMMAND_FIELD_NUMBER = 3;
  private alluxio.grpc.RegisterCommand registerCommand_;
  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  public boolean hasRegisterCommand() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  public alluxio.grpc.RegisterCommand getRegisterCommand() {
    return registerCommand_ == null ? alluxio.grpc.RegisterCommand.getDefaultInstance() : registerCommand_;
  }
  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  public alluxio.grpc.RegisterCommandOrBuilder getRegisterCommandOrBuilder() {
    return registerCommand_ == null ? alluxio.grpc.RegisterCommand.getDefaultInstance() : registerCommand_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getRunTaskCommand());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getCancelTaskCommand());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getRegisterCommand());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRunTaskCommand());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCancelTaskCommand());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRegisterCommand());
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
    if (!(obj instanceof alluxio.grpc.JobCommand)) {
      return super.equals(obj);
    }
    alluxio.grpc.JobCommand other = (alluxio.grpc.JobCommand) obj;

    boolean result = true;
    result = result && (hasRunTaskCommand() == other.hasRunTaskCommand());
    if (hasRunTaskCommand()) {
      result = result && getRunTaskCommand()
          .equals(other.getRunTaskCommand());
    }
    result = result && (hasCancelTaskCommand() == other.hasCancelTaskCommand());
    if (hasCancelTaskCommand()) {
      result = result && getCancelTaskCommand()
          .equals(other.getCancelTaskCommand());
    }
    result = result && (hasRegisterCommand() == other.hasRegisterCommand());
    if (hasRegisterCommand()) {
      result = result && getRegisterCommand()
          .equals(other.getRegisterCommand());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRunTaskCommand()) {
      hash = (37 * hash) + RUNTASKCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getRunTaskCommand().hashCode();
    }
    if (hasCancelTaskCommand()) {
      hash = (37 * hash) + CANCELTASKCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getCancelTaskCommand().hashCode();
    }
    if (hasRegisterCommand()) {
      hash = (37 * hash) + REGISTERCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getRegisterCommand().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.JobCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.JobCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.JobCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code alluxio.grpc.job.JobCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.job.JobCommand)
      alluxio.grpc.JobCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobCommand_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.JobCommand.class, alluxio.grpc.JobCommand.Builder.class);
    }

    // Construct using alluxio.grpc.JobCommand.newBuilder()
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
        getRunTaskCommandFieldBuilder();
        getCancelTaskCommandFieldBuilder();
        getRegisterCommandFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (runTaskCommandBuilder_ == null) {
        runTaskCommand_ = null;
      } else {
        runTaskCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (cancelTaskCommandBuilder_ == null) {
        cancelTaskCommand_ = null;
      } else {
        cancelTaskCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (registerCommandBuilder_ == null) {
        registerCommand_ = null;
      } else {
        registerCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobCommand_descriptor;
    }

    public alluxio.grpc.JobCommand getDefaultInstanceForType() {
      return alluxio.grpc.JobCommand.getDefaultInstance();
    }

    public alluxio.grpc.JobCommand build() {
      alluxio.grpc.JobCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.JobCommand buildPartial() {
      alluxio.grpc.JobCommand result = new alluxio.grpc.JobCommand(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (runTaskCommandBuilder_ == null) {
        result.runTaskCommand_ = runTaskCommand_;
      } else {
        result.runTaskCommand_ = runTaskCommandBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (cancelTaskCommandBuilder_ == null) {
        result.cancelTaskCommand_ = cancelTaskCommand_;
      } else {
        result.cancelTaskCommand_ = cancelTaskCommandBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (registerCommandBuilder_ == null) {
        result.registerCommand_ = registerCommand_;
      } else {
        result.registerCommand_ = registerCommandBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.JobCommand) {
        return mergeFrom((alluxio.grpc.JobCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.JobCommand other) {
      if (other == alluxio.grpc.JobCommand.getDefaultInstance()) return this;
      if (other.hasRunTaskCommand()) {
        mergeRunTaskCommand(other.getRunTaskCommand());
      }
      if (other.hasCancelTaskCommand()) {
        mergeCancelTaskCommand(other.getCancelTaskCommand());
      }
      if (other.hasRegisterCommand()) {
        mergeRegisterCommand(other.getRegisterCommand());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.JobCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.JobCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.RunTaskCommand runTaskCommand_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RunTaskCommand, alluxio.grpc.RunTaskCommand.Builder, alluxio.grpc.RunTaskCommandOrBuilder> runTaskCommandBuilder_;
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public boolean hasRunTaskCommand() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public alluxio.grpc.RunTaskCommand getRunTaskCommand() {
      if (runTaskCommandBuilder_ == null) {
        return runTaskCommand_ == null ? alluxio.grpc.RunTaskCommand.getDefaultInstance() : runTaskCommand_;
      } else {
        return runTaskCommandBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public Builder setRunTaskCommand(alluxio.grpc.RunTaskCommand value) {
      if (runTaskCommandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runTaskCommand_ = value;
        onChanged();
      } else {
        runTaskCommandBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public Builder setRunTaskCommand(
        alluxio.grpc.RunTaskCommand.Builder builderForValue) {
      if (runTaskCommandBuilder_ == null) {
        runTaskCommand_ = builderForValue.build();
        onChanged();
      } else {
        runTaskCommandBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public Builder mergeRunTaskCommand(alluxio.grpc.RunTaskCommand value) {
      if (runTaskCommandBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            runTaskCommand_ != null &&
            runTaskCommand_ != alluxio.grpc.RunTaskCommand.getDefaultInstance()) {
          runTaskCommand_ =
            alluxio.grpc.RunTaskCommand.newBuilder(runTaskCommand_).mergeFrom(value).buildPartial();
        } else {
          runTaskCommand_ = value;
        }
        onChanged();
      } else {
        runTaskCommandBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public Builder clearRunTaskCommand() {
      if (runTaskCommandBuilder_ == null) {
        runTaskCommand_ = null;
        onChanged();
      } else {
        runTaskCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public alluxio.grpc.RunTaskCommand.Builder getRunTaskCommandBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRunTaskCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    public alluxio.grpc.RunTaskCommandOrBuilder getRunTaskCommandOrBuilder() {
      if (runTaskCommandBuilder_ != null) {
        return runTaskCommandBuilder_.getMessageOrBuilder();
      } else {
        return runTaskCommand_ == null ?
            alluxio.grpc.RunTaskCommand.getDefaultInstance() : runTaskCommand_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RunTaskCommand, alluxio.grpc.RunTaskCommand.Builder, alluxio.grpc.RunTaskCommandOrBuilder> 
        getRunTaskCommandFieldBuilder() {
      if (runTaskCommandBuilder_ == null) {
        runTaskCommandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.RunTaskCommand, alluxio.grpc.RunTaskCommand.Builder, alluxio.grpc.RunTaskCommandOrBuilder>(
                getRunTaskCommand(),
                getParentForChildren(),
                isClean());
        runTaskCommand_ = null;
      }
      return runTaskCommandBuilder_;
    }

    private alluxio.grpc.CancelTaskCommand cancelTaskCommand_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.CancelTaskCommand, alluxio.grpc.CancelTaskCommand.Builder, alluxio.grpc.CancelTaskCommandOrBuilder> cancelTaskCommandBuilder_;
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public boolean hasCancelTaskCommand() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public alluxio.grpc.CancelTaskCommand getCancelTaskCommand() {
      if (cancelTaskCommandBuilder_ == null) {
        return cancelTaskCommand_ == null ? alluxio.grpc.CancelTaskCommand.getDefaultInstance() : cancelTaskCommand_;
      } else {
        return cancelTaskCommandBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public Builder setCancelTaskCommand(alluxio.grpc.CancelTaskCommand value) {
      if (cancelTaskCommandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cancelTaskCommand_ = value;
        onChanged();
      } else {
        cancelTaskCommandBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public Builder setCancelTaskCommand(
        alluxio.grpc.CancelTaskCommand.Builder builderForValue) {
      if (cancelTaskCommandBuilder_ == null) {
        cancelTaskCommand_ = builderForValue.build();
        onChanged();
      } else {
        cancelTaskCommandBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public Builder mergeCancelTaskCommand(alluxio.grpc.CancelTaskCommand value) {
      if (cancelTaskCommandBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            cancelTaskCommand_ != null &&
            cancelTaskCommand_ != alluxio.grpc.CancelTaskCommand.getDefaultInstance()) {
          cancelTaskCommand_ =
            alluxio.grpc.CancelTaskCommand.newBuilder(cancelTaskCommand_).mergeFrom(value).buildPartial();
        } else {
          cancelTaskCommand_ = value;
        }
        onChanged();
      } else {
        cancelTaskCommandBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public Builder clearCancelTaskCommand() {
      if (cancelTaskCommandBuilder_ == null) {
        cancelTaskCommand_ = null;
        onChanged();
      } else {
        cancelTaskCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public alluxio.grpc.CancelTaskCommand.Builder getCancelTaskCommandBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCancelTaskCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    public alluxio.grpc.CancelTaskCommandOrBuilder getCancelTaskCommandOrBuilder() {
      if (cancelTaskCommandBuilder_ != null) {
        return cancelTaskCommandBuilder_.getMessageOrBuilder();
      } else {
        return cancelTaskCommand_ == null ?
            alluxio.grpc.CancelTaskCommand.getDefaultInstance() : cancelTaskCommand_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.CancelTaskCommand, alluxio.grpc.CancelTaskCommand.Builder, alluxio.grpc.CancelTaskCommandOrBuilder> 
        getCancelTaskCommandFieldBuilder() {
      if (cancelTaskCommandBuilder_ == null) {
        cancelTaskCommandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.CancelTaskCommand, alluxio.grpc.CancelTaskCommand.Builder, alluxio.grpc.CancelTaskCommandOrBuilder>(
                getCancelTaskCommand(),
                getParentForChildren(),
                isClean());
        cancelTaskCommand_ = null;
      }
      return cancelTaskCommandBuilder_;
    }

    private alluxio.grpc.RegisterCommand registerCommand_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RegisterCommand, alluxio.grpc.RegisterCommand.Builder, alluxio.grpc.RegisterCommandOrBuilder> registerCommandBuilder_;
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public boolean hasRegisterCommand() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public alluxio.grpc.RegisterCommand getRegisterCommand() {
      if (registerCommandBuilder_ == null) {
        return registerCommand_ == null ? alluxio.grpc.RegisterCommand.getDefaultInstance() : registerCommand_;
      } else {
        return registerCommandBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public Builder setRegisterCommand(alluxio.grpc.RegisterCommand value) {
      if (registerCommandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registerCommand_ = value;
        onChanged();
      } else {
        registerCommandBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public Builder setRegisterCommand(
        alluxio.grpc.RegisterCommand.Builder builderForValue) {
      if (registerCommandBuilder_ == null) {
        registerCommand_ = builderForValue.build();
        onChanged();
      } else {
        registerCommandBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public Builder mergeRegisterCommand(alluxio.grpc.RegisterCommand value) {
      if (registerCommandBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            registerCommand_ != null &&
            registerCommand_ != alluxio.grpc.RegisterCommand.getDefaultInstance()) {
          registerCommand_ =
            alluxio.grpc.RegisterCommand.newBuilder(registerCommand_).mergeFrom(value).buildPartial();
        } else {
          registerCommand_ = value;
        }
        onChanged();
      } else {
        registerCommandBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public Builder clearRegisterCommand() {
      if (registerCommandBuilder_ == null) {
        registerCommand_ = null;
        onChanged();
      } else {
        registerCommandBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public alluxio.grpc.RegisterCommand.Builder getRegisterCommandBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRegisterCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    public alluxio.grpc.RegisterCommandOrBuilder getRegisterCommandOrBuilder() {
      if (registerCommandBuilder_ != null) {
        return registerCommandBuilder_.getMessageOrBuilder();
      } else {
        return registerCommand_ == null ?
            alluxio.grpc.RegisterCommand.getDefaultInstance() : registerCommand_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RegisterCommand, alluxio.grpc.RegisterCommand.Builder, alluxio.grpc.RegisterCommandOrBuilder> 
        getRegisterCommandFieldBuilder() {
      if (registerCommandBuilder_ == null) {
        registerCommandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.RegisterCommand, alluxio.grpc.RegisterCommand.Builder, alluxio.grpc.RegisterCommandOrBuilder>(
                getRegisterCommand(),
                getParentForChildren(),
                isClean());
        registerCommand_ = null;
      }
      return registerCommandBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.job.JobCommand)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.job.JobCommand)
  private static final alluxio.grpc.JobCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.JobCommand();
  }

  public static alluxio.grpc.JobCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<JobCommand>
      PARSER = new com.google.protobuf.AbstractParser<JobCommand>() {
    public JobCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobCommand> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.JobCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

