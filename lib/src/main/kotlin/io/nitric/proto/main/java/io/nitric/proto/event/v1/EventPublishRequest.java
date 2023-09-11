// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

/**
 * <pre>
 * Request to publish an event to a topic
 * </pre>
 *
 * Protobuf type {@code nitric.event.v1.EventPublishRequest}
 */
public final class EventPublishRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.event.v1.EventPublishRequest)
    EventPublishRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventPublishRequest.newBuilder() to construct.
  private EventPublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventPublishRequest() {
    topic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventPublishRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_EventPublishRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_EventPublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.event.v1.EventPublishRequest.class, io.nitric.proto.event.v1.EventPublishRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object topic_;
  /**
   * <pre>
   * The name of the topic to publish the event to
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the topic to publish the event to
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_FIELD_NUMBER = 2;
  private io.nitric.proto.event.v1.NitricEvent event_;
  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return event_ != null;
  }
  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
   * @return The event.
   */
  @java.lang.Override
  public io.nitric.proto.event.v1.NitricEvent getEvent() {
    return event_ == null ? io.nitric.proto.event.v1.NitricEvent.getDefaultInstance() : event_;
  }
  /**
   * <pre>
   * The event to be published
   * </pre>
   *
   * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.nitric.proto.event.v1.NitricEventOrBuilder getEventOrBuilder() {
    return getEvent();
  }

  public static final int DELAY_FIELD_NUMBER = 3;
  private int delay_;
  /**
   * <pre>
   * An optional delay specified in seconds (minimum 10 seconds)
   * </pre>
   *
   * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
   * @return The delay.
   */
  @java.lang.Override
  public int getDelay() {
    return delay_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (event_ != null) {
      output.writeMessage(2, getEvent());
    }
    if (delay_ != 0) {
      output.writeUInt32(3, delay_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (event_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEvent());
    }
    if (delay_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, delay_);
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
    if (!(obj instanceof io.nitric.proto.event.v1.EventPublishRequest)) {
      return super.equals(obj);
    }
    io.nitric.proto.event.v1.EventPublishRequest other = (io.nitric.proto.event.v1.EventPublishRequest) obj;

    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
    if (getDelay()
        != other.getDelay()) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (37 * hash) + DELAY_FIELD_NUMBER;
    hash = (53 * hash) + getDelay();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.EventPublishRequest parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.event.v1.EventPublishRequest prototype) {
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
   * Request to publish an event to a topic
   * </pre>
   *
   * Protobuf type {@code nitric.event.v1.EventPublishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.event.v1.EventPublishRequest)
      io.nitric.proto.event.v1.EventPublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_EventPublishRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_EventPublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.event.v1.EventPublishRequest.class, io.nitric.proto.event.v1.EventPublishRequest.Builder.class);
    }

    // Construct using io.nitric.proto.event.v1.EventPublishRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      topic_ = "";

      if (eventBuilder_ == null) {
        event_ = null;
      } else {
        event_ = null;
        eventBuilder_ = null;
      }
      delay_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_EventPublishRequest_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.EventPublishRequest getDefaultInstanceForType() {
      return io.nitric.proto.event.v1.EventPublishRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.EventPublishRequest build() {
      io.nitric.proto.event.v1.EventPublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.EventPublishRequest buildPartial() {
      io.nitric.proto.event.v1.EventPublishRequest result = new io.nitric.proto.event.v1.EventPublishRequest(this);
      result.topic_ = topic_;
      if (eventBuilder_ == null) {
        result.event_ = event_;
      } else {
        result.event_ = eventBuilder_.build();
      }
      result.delay_ = delay_;
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
      if (other instanceof io.nitric.proto.event.v1.EventPublishRequest) {
        return mergeFrom((io.nitric.proto.event.v1.EventPublishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.event.v1.EventPublishRequest other) {
      if (other == io.nitric.proto.event.v1.EventPublishRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
      }
      if (other.getDelay() != 0) {
        setDelay(other.getDelay());
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
              topic_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEventFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              delay_ = input.readUInt32();

              break;
            } // case 24
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

    private java.lang.Object topic_ = "";
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1;</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private io.nitric.proto.event.v1.NitricEvent event_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.event.v1.NitricEvent, io.nitric.proto.event.v1.NitricEvent.Builder, io.nitric.proto.event.v1.NitricEventOrBuilder> eventBuilder_;
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return eventBuilder_ != null || event_ != null;
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     * @return The event.
     */
    public io.nitric.proto.event.v1.NitricEvent getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? io.nitric.proto.event.v1.NitricEvent.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setEvent(io.nitric.proto.event.v1.NitricEvent value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        eventBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setEvent(
        io.nitric.proto.event.v1.NitricEvent.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeEvent(io.nitric.proto.event.v1.NitricEvent value) {
      if (eventBuilder_ == null) {
        if (event_ != null) {
          event_ =
            io.nitric.proto.event.v1.NitricEvent.newBuilder(event_).mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        eventBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        event_ = null;
        onChanged();
      } else {
        event_ = null;
        eventBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.event.v1.NitricEvent.Builder getEventBuilder() {
      
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.event.v1.NitricEventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            io.nitric.proto.event.v1.NitricEvent.getDefaultInstance() : event_;
      }
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.event.v1.NitricEvent, io.nitric.proto.event.v1.NitricEvent.Builder, io.nitric.proto.event.v1.NitricEventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.event.v1.NitricEvent, io.nitric.proto.event.v1.NitricEvent.Builder, io.nitric.proto.event.v1.NitricEventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
    }

    private int delay_ ;
    /**
     * <pre>
     * An optional delay specified in seconds (minimum 10 seconds)
     * </pre>
     *
     * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
     * @return The delay.
     */
    @java.lang.Override
    public int getDelay() {
      return delay_;
    }
    /**
     * <pre>
     * An optional delay specified in seconds (minimum 10 seconds)
     * </pre>
     *
     * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
     * @param value The delay to set.
     * @return This builder for chaining.
     */
    public Builder setDelay(int value) {
      
      delay_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional delay specified in seconds (minimum 10 seconds)
     * </pre>
     *
     * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDelay() {
      
      delay_ = 0;
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


    // @@protoc_insertion_point(builder_scope:nitric.event.v1.EventPublishRequest)
  }

  // @@protoc_insertion_point(class_scope:nitric.event.v1.EventPublishRequest)
  private static final io.nitric.proto.event.v1.EventPublishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.event.v1.EventPublishRequest();
  }

  public static io.nitric.proto.event.v1.EventPublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventPublishRequest>
      PARSER = new com.google.protobuf.AbstractParser<EventPublishRequest>() {
    @java.lang.Override
    public EventPublishRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventPublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventPublishRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.event.v1.EventPublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
