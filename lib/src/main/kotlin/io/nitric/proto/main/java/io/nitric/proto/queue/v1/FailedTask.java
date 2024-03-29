// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

/**
 * Protobuf type {@code nitric.queue.v1.FailedTask}
 */
public final class FailedTask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.queue.v1.FailedTask)
    FailedTaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FailedTask.newBuilder() to construct.
  private FailedTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FailedTask() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FailedTask();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_FailedTask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_FailedTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.queue.v1.FailedTask.class, io.nitric.proto.queue.v1.FailedTask.Builder.class);
  }

  public static final int TASK_FIELD_NUMBER = 1;
  private io.nitric.proto.queue.v1.NitricTask task_;
  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   * @return Whether the task field is set.
   */
  @java.lang.Override
  public boolean hasTask() {
    return task_ != null;
  }
  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   * @return The task.
   */
  @java.lang.Override
  public io.nitric.proto.queue.v1.NitricTask getTask() {
    return task_ == null ? io.nitric.proto.queue.v1.NitricTask.getDefaultInstance() : task_;
  }
  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.queue.v1.NitricTaskOrBuilder getTaskOrBuilder() {
    return getTask();
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * A message describing the failure
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A message describing the failure
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (task_ != null) {
      output.writeMessage(1, getTask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (task_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.nitric.proto.queue.v1.FailedTask)) {
      return super.equals(obj);
    }
    io.nitric.proto.queue.v1.FailedTask other = (io.nitric.proto.queue.v1.FailedTask) obj;

    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
    }
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.queue.v1.FailedTask parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.queue.v1.FailedTask prototype) {
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
   * Protobuf type {@code nitric.queue.v1.FailedTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.queue.v1.FailedTask)
      io.nitric.proto.queue.v1.FailedTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_FailedTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_FailedTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.queue.v1.FailedTask.class, io.nitric.proto.queue.v1.FailedTask.Builder.class);
    }

    // Construct using io.nitric.proto.queue.v1.FailedTask.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (taskBuilder_ == null) {
        task_ = null;
      } else {
        task_ = null;
        taskBuilder_ = null;
      }
      message_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.queue.v1.Queues.internal_static_nitric_queue_v1_FailedTask_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.FailedTask getDefaultInstanceForType() {
      return io.nitric.proto.queue.v1.FailedTask.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.FailedTask build() {
      io.nitric.proto.queue.v1.FailedTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.queue.v1.FailedTask buildPartial() {
      io.nitric.proto.queue.v1.FailedTask result = new io.nitric.proto.queue.v1.FailedTask(this);
      if (taskBuilder_ == null) {
        result.task_ = task_;
      } else {
        result.task_ = taskBuilder_.build();
      }
      result.message_ = message_;
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
      if (other instanceof io.nitric.proto.queue.v1.FailedTask) {
        return mergeFrom((io.nitric.proto.queue.v1.FailedTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.queue.v1.FailedTask other) {
      if (other == io.nitric.proto.queue.v1.FailedTask.getDefaultInstance()) return this;
      if (other.hasTask()) {
        mergeTask(other.getTask());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getTaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private io.nitric.proto.queue.v1.NitricTask task_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.queue.v1.NitricTask, io.nitric.proto.queue.v1.NitricTask.Builder, io.nitric.proto.queue.v1.NitricTaskOrBuilder> taskBuilder_;
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     * @return Whether the task field is set.
     */
    public boolean hasTask() {
      return taskBuilder_ != null || task_ != null;
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     * @return The task.
     */
    public io.nitric.proto.queue.v1.NitricTask getTask() {
      if (taskBuilder_ == null) {
        return task_ == null ? io.nitric.proto.queue.v1.NitricTask.getDefaultInstance() : task_;
      } else {
        return taskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public Builder setTask(io.nitric.proto.queue.v1.NitricTask value) {
      if (taskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        task_ = value;
        onChanged();
      } else {
        taskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public Builder setTask(
        io.nitric.proto.queue.v1.NitricTask.Builder builderForValue) {
      if (taskBuilder_ == null) {
        task_ = builderForValue.build();
        onChanged();
      } else {
        taskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public Builder mergeTask(io.nitric.proto.queue.v1.NitricTask value) {
      if (taskBuilder_ == null) {
        if (task_ != null) {
          task_ =
            io.nitric.proto.queue.v1.NitricTask.newBuilder(task_).mergeFrom(value).buildPartial();
        } else {
          task_ = value;
        }
        onChanged();
      } else {
        taskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public Builder clearTask() {
      if (taskBuilder_ == null) {
        task_ = null;
        onChanged();
      } else {
        task_ = null;
        taskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public io.nitric.proto.queue.v1.NitricTask.Builder getTaskBuilder() {
      
      onChanged();
      return getTaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    public io.nitric.proto.queue.v1.NitricTaskOrBuilder getTaskOrBuilder() {
      if (taskBuilder_ != null) {
        return taskBuilder_.getMessageOrBuilder();
      } else {
        return task_ == null ?
            io.nitric.proto.queue.v1.NitricTask.getDefaultInstance() : task_;
      }
    }
    /**
     * <pre>
     * The task that failed to be pushed
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.queue.v1.NitricTask, io.nitric.proto.queue.v1.NitricTask.Builder, io.nitric.proto.queue.v1.NitricTaskOrBuilder> 
        getTaskFieldBuilder() {
      if (taskBuilder_ == null) {
        taskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.queue.v1.NitricTask, io.nitric.proto.queue.v1.NitricTask.Builder, io.nitric.proto.queue.v1.NitricTaskOrBuilder>(
                getTask(),
                getParentForChildren(),
                isClean());
        task_ = null;
      }
      return taskBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * A message describing the failure
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A message describing the failure
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A message describing the failure
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A message describing the failure
     * </pre>
     *
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A message describing the failure
     * </pre>
     *
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:nitric.queue.v1.FailedTask)
  }

  // @@protoc_insertion_point(class_scope:nitric.queue.v1.FailedTask)
  private static final io.nitric.proto.queue.v1.FailedTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.queue.v1.FailedTask();
  }

  public static io.nitric.proto.queue.v1.FailedTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FailedTask>
      PARSER = new com.google.protobuf.AbstractParser<FailedTask>() {
    @java.lang.Override
    public FailedTask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FailedTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FailedTask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.queue.v1.FailedTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

