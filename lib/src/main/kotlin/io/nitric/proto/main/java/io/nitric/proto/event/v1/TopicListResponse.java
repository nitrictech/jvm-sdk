// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

/**
 * <pre>
 * Topic List Response
 * </pre>
 *
 * Protobuf type {@code nitric.event.v1.TopicListResponse}
 */
public final class TopicListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.event.v1.TopicListResponse)
    TopicListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicListResponse.newBuilder() to construct.
  private TopicListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicListResponse() {
    topics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_TopicListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_TopicListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.event.v1.TopicListResponse.class, io.nitric.proto.event.v1.TopicListResponse.Builder.class);
  }

  public static final int TOPICS_FIELD_NUMBER = 1;
  private java.util.List<io.nitric.proto.event.v1.NitricTopic> topics_;
  /**
   * <pre>
   * The list of found topics
   * </pre>
   *
   * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.nitric.proto.event.v1.NitricTopic> getTopicsList() {
    return topics_;
  }
  /**
   * <pre>
   * The list of found topics
   * </pre>
   *
   * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.nitric.proto.event.v1.NitricTopicOrBuilder> 
      getTopicsOrBuilderList() {
    return topics_;
  }
  /**
   * <pre>
   * The list of found topics
   * </pre>
   *
   * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
   */
  @java.lang.Override
  public int getTopicsCount() {
    return topics_.size();
  }
  /**
   * <pre>
   * The list of found topics
   * </pre>
   *
   * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.event.v1.NitricTopic getTopics(int index) {
    return topics_.get(index);
  }
  /**
   * <pre>
   * The list of found topics
   * </pre>
   *
   * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.event.v1.NitricTopicOrBuilder getTopicsOrBuilder(
      int index) {
    return topics_.get(index);
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
    for (int i = 0; i < topics_.size(); i++) {
      output.writeMessage(1, topics_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < topics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, topics_.get(i));
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
    if (!(obj instanceof io.nitric.proto.event.v1.TopicListResponse)) {
      return super.equals(obj);
    }
    io.nitric.proto.event.v1.TopicListResponse other = (io.nitric.proto.event.v1.TopicListResponse) obj;

    if (!getTopicsList()
        .equals(other.getTopicsList())) return false;
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
    if (getTopicsCount() > 0) {
      hash = (37 * hash) + TOPICS_FIELD_NUMBER;
      hash = (53 * hash) + getTopicsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.TopicListResponse parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.event.v1.TopicListResponse prototype) {
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
   * Topic List Response
   * </pre>
   *
   * Protobuf type {@code nitric.event.v1.TopicListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.event.v1.TopicListResponse)
      io.nitric.proto.event.v1.TopicListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_TopicListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_TopicListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.event.v1.TopicListResponse.class, io.nitric.proto.event.v1.TopicListResponse.Builder.class);
    }

    // Construct using io.nitric.proto.event.v1.TopicListResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
      } else {
        topics_ = null;
        topicsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_TopicListResponse_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.TopicListResponse getDefaultInstanceForType() {
      return io.nitric.proto.event.v1.TopicListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.TopicListResponse build() {
      io.nitric.proto.event.v1.TopicListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.TopicListResponse buildPartial() {
      io.nitric.proto.event.v1.TopicListResponse result = new io.nitric.proto.event.v1.TopicListResponse(this);
      int from_bitField0_ = bitField0_;
      if (topicsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          topics_ = java.util.Collections.unmodifiableList(topics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.topics_ = topics_;
      } else {
        result.topics_ = topicsBuilder_.build();
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
      if (other instanceof io.nitric.proto.event.v1.TopicListResponse) {
        return mergeFrom((io.nitric.proto.event.v1.TopicListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.event.v1.TopicListResponse other) {
      if (other == io.nitric.proto.event.v1.TopicListResponse.getDefaultInstance()) return this;
      if (topicsBuilder_ == null) {
        if (!other.topics_.isEmpty()) {
          if (topics_.isEmpty()) {
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTopicsIsMutable();
            topics_.addAll(other.topics_);
          }
          onChanged();
        }
      } else {
        if (!other.topics_.isEmpty()) {
          if (topicsBuilder_.isEmpty()) {
            topicsBuilder_.dispose();
            topicsBuilder_ = null;
            topics_ = other.topics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            topicsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTopicsFieldBuilder() : null;
          } else {
            topicsBuilder_.addAllMessages(other.topics_);
          }
        }
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
              io.nitric.proto.event.v1.NitricTopic m =
                  input.readMessage(
                      io.nitric.proto.event.v1.NitricTopic.parser(),
                      extensionRegistry);
              if (topicsBuilder_ == null) {
                ensureTopicsIsMutable();
                topics_.add(m);
              } else {
                topicsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<io.nitric.proto.event.v1.NitricTopic> topics_ =
      java.util.Collections.emptyList();
    private void ensureTopicsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        topics_ = new java.util.ArrayList<io.nitric.proto.event.v1.NitricTopic>(topics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.nitric.proto.event.v1.NitricTopic, io.nitric.proto.event.v1.NitricTopic.Builder, io.nitric.proto.event.v1.NitricTopicOrBuilder> topicsBuilder_;

    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public java.util.List<io.nitric.proto.event.v1.NitricTopic> getTopicsList() {
      if (topicsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(topics_);
      } else {
        return topicsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public int getTopicsCount() {
      if (topicsBuilder_ == null) {
        return topics_.size();
      } else {
        return topicsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public io.nitric.proto.event.v1.NitricTopic getTopics(int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);
      } else {
        return topicsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder setTopics(
        int index, io.nitric.proto.event.v1.NitricTopic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.set(index, value);
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder setTopics(
        int index, io.nitric.proto.event.v1.NitricTopic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.set(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder addTopics(io.nitric.proto.event.v1.NitricTopic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder addTopics(
        int index, io.nitric.proto.event.v1.NitricTopic value) {
      if (topicsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicsIsMutable();
        topics_.add(index, value);
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder addTopics(
        io.nitric.proto.event.v1.NitricTopic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder addTopics(
        int index, io.nitric.proto.event.v1.NitricTopic.Builder builderForValue) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.add(index, builderForValue.build());
        onChanged();
      } else {
        topicsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder addAllTopics(
        java.lang.Iterable<? extends io.nitric.proto.event.v1.NitricTopic> values) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, topics_);
        onChanged();
      } else {
        topicsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder clearTopics() {
      if (topicsBuilder_ == null) {
        topics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        topicsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public Builder removeTopics(int index) {
      if (topicsBuilder_ == null) {
        ensureTopicsIsMutable();
        topics_.remove(index);
        onChanged();
      } else {
        topicsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public io.nitric.proto.event.v1.NitricTopic.Builder getTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public io.nitric.proto.event.v1.NitricTopicOrBuilder getTopicsOrBuilder(
        int index) {
      if (topicsBuilder_ == null) {
        return topics_.get(index);  } else {
        return topicsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public java.util.List<? extends io.nitric.proto.event.v1.NitricTopicOrBuilder> 
         getTopicsOrBuilderList() {
      if (topicsBuilder_ != null) {
        return topicsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(topics_);
      }
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public io.nitric.proto.event.v1.NitricTopic.Builder addTopicsBuilder() {
      return getTopicsFieldBuilder().addBuilder(
          io.nitric.proto.event.v1.NitricTopic.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public io.nitric.proto.event.v1.NitricTopic.Builder addTopicsBuilder(
        int index) {
      return getTopicsFieldBuilder().addBuilder(
          index, io.nitric.proto.event.v1.NitricTopic.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of found topics
     * </pre>
     *
     * <code>repeated .nitric.event.v1.NitricTopic topics = 1;</code>
     */
    public java.util.List<io.nitric.proto.event.v1.NitricTopic.Builder> 
         getTopicsBuilderList() {
      return getTopicsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.nitric.proto.event.v1.NitricTopic, io.nitric.proto.event.v1.NitricTopic.Builder, io.nitric.proto.event.v1.NitricTopicOrBuilder> 
        getTopicsFieldBuilder() {
      if (topicsBuilder_ == null) {
        topicsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.nitric.proto.event.v1.NitricTopic, io.nitric.proto.event.v1.NitricTopic.Builder, io.nitric.proto.event.v1.NitricTopicOrBuilder>(
                topics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        topics_ = null;
      }
      return topicsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.event.v1.TopicListResponse)
  }

  // @@protoc_insertion_point(class_scope:nitric.event.v1.TopicListResponse)
  private static final io.nitric.proto.event.v1.TopicListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.event.v1.TopicListResponse();
  }

  public static io.nitric.proto.event.v1.TopicListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicListResponse>
      PARSER = new com.google.protobuf.AbstractParser<TopicListResponse>() {
    @java.lang.Override
    public TopicListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TopicListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.event.v1.TopicListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

