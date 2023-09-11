// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

/**
 * <pre>
 * Nitric Event Model
 * </pre>
 *
 * Protobuf type {@code nitric.event.v1.NitricEvent}
 */
public final class NitricEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.event.v1.NitricEvent)
    NitricEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NitricEvent.newBuilder() to construct.
  private NitricEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NitricEvent() {
    id_ = "";
    payloadType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NitricEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_NitricEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_NitricEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.event.v1.NitricEvent.class, io.nitric.proto.event.v1.NitricEvent.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * A Unique ID for the Nitric Event
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A Unique ID for the Nitric Event
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object payloadType_;
  /**
   * <pre>
   * A content hint for the events payload
   * </pre>
   *
   * <code>string payload_type = 2;</code>
   * @return The payloadType.
   */
  @java.lang.Override
  public java.lang.String getPayloadType() {
    java.lang.Object ref = payloadType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payloadType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A content hint for the events payload
   * </pre>
   *
   * <code>string payload_type = 2;</code>
   * @return The bytes for payloadType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayloadTypeBytes() {
    java.lang.Object ref = payloadType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payloadType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct payload_;
  /**
   * <pre>
   * The payload of the event
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <pre>
   * The payload of the event
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getPayload() {
    return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
  }
  /**
   * <pre>
   * The payload of the event
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
    return getPayload();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payloadType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, payloadType_);
    }
    if (payload_ != null) {
      output.writeMessage(3, getPayload());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payloadType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, payloadType_);
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPayload());
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
    if (!(obj instanceof io.nitric.proto.event.v1.NitricEvent)) {
      return super.equals(obj);
    }
    io.nitric.proto.event.v1.NitricEvent other = (io.nitric.proto.event.v1.NitricEvent) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getPayloadType()
        .equals(other.getPayloadType())) return false;
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload()
          .equals(other.getPayload())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PAYLOAD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadType().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.event.v1.NitricEvent parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.event.v1.NitricEvent prototype) {
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
   * Nitric Event Model
   * </pre>
   *
   * Protobuf type {@code nitric.event.v1.NitricEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.event.v1.NitricEvent)
      io.nitric.proto.event.v1.NitricEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_NitricEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_NitricEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.event.v1.NitricEvent.class, io.nitric.proto.event.v1.NitricEvent.Builder.class);
    }

    // Construct using io.nitric.proto.event.v1.NitricEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      payloadType_ = "";

      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.event.v1.Events.internal_static_nitric_event_v1_NitricEvent_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.NitricEvent getDefaultInstanceForType() {
      return io.nitric.proto.event.v1.NitricEvent.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.NitricEvent build() {
      io.nitric.proto.event.v1.NitricEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.event.v1.NitricEvent buildPartial() {
      io.nitric.proto.event.v1.NitricEvent result = new io.nitric.proto.event.v1.NitricEvent(this);
      result.id_ = id_;
      result.payloadType_ = payloadType_;
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
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
      if (other instanceof io.nitric.proto.event.v1.NitricEvent) {
        return mergeFrom((io.nitric.proto.event.v1.NitricEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.event.v1.NitricEvent other) {
      if (other == io.nitric.proto.event.v1.NitricEvent.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getPayloadType().isEmpty()) {
        payloadType_ = other.payloadType_;
        onChanged();
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
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
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              payloadType_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPayloadFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * A Unique ID for the Nitric Event
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A Unique ID for the Nitric Event
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A Unique ID for the Nitric Event
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Unique ID for the Nitric Event
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Unique ID for the Nitric Event
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object payloadType_ = "";
    /**
     * <pre>
     * A content hint for the events payload
     * </pre>
     *
     * <code>string payload_type = 2;</code>
     * @return The payloadType.
     */
    public java.lang.String getPayloadType() {
      java.lang.Object ref = payloadType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payloadType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A content hint for the events payload
     * </pre>
     *
     * <code>string payload_type = 2;</code>
     * @return The bytes for payloadType.
     */
    public com.google.protobuf.ByteString
        getPayloadTypeBytes() {
      java.lang.Object ref = payloadType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payloadType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A content hint for the events payload
     * </pre>
     *
     * <code>string payload_type = 2;</code>
     * @param value The payloadType to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payloadType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A content hint for the events payload
     * </pre>
     *
     * <code>string payload_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadType() {
      
      payloadType_ = getDefaultInstance().getPayloadType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A content hint for the events payload
     * </pre>
     *
     * <code>string payload_type = 2;</code>
     * @param value The bytes for payloadType to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      payloadType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> payloadBuilder_;
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     * @return The payload.
     */
    public com.google.protobuf.Struct getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder setPayload(com.google.protobuf.Struct value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder setPayload(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder mergePayload(com.google.protobuf.Struct value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
            com.google.protobuf.Struct.newBuilder(payload_).mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public com.google.protobuf.Struct.Builder getPayloadBuilder() {
      
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : payload_;
      }
    }
    /**
     * <pre>
     * The payload of the event
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.event.v1.NitricEvent)
  }

  // @@protoc_insertion_point(class_scope:nitric.event.v1.NitricEvent)
  private static final io.nitric.proto.event.v1.NitricEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.event.v1.NitricEvent();
  }

  public static io.nitric.proto.event.v1.NitricEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NitricEvent>
      PARSER = new com.google.protobuf.AbstractParser<NitricEvent>() {
    @java.lang.Override
    public NitricEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<NitricEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NitricEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.event.v1.NitricEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
