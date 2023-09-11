// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * <pre>
 * Messages the client is able to send to the server
 * </pre>
 *
 * Protobuf type {@code nitric.faas.v1.ClientMessage}
 */
public final class ClientMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.ClientMessage)
    ClientMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientMessage.newBuilder() to construct.
  private ClientMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientMessage() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ClientMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ClientMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.ClientMessage.class, io.nitric.proto.faas.v1.ClientMessage.Builder.class);
  }

  private int contentCase_ = 0;
  private java.lang.Object content_;
  public enum ContentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INIT_REQUEST(2),
    TRIGGER_RESPONSE(3),
    CONTENT_NOT_SET(0);
    private final int value;
    private ContentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentCase forNumber(int value) {
      switch (value) {
        case 2: return INIT_REQUEST;
        case 3: return TRIGGER_RESPONSE;
        case 0: return CONTENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContentCase
  getContentCase() {
    return ContentCase.forNumber(
        contentCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Client message ID, used to pair requests/responses
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
   * Client message ID, used to pair requests/responses
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

  public static final int INIT_REQUEST_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Client initialisation request
   * A worker will not be eligible for triggers
   * until it has identified itself
   * </pre>
   *
   * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
   * @return Whether the initRequest field is set.
   */
  @java.lang.Override
  public boolean hasInitRequest() {
    return contentCase_ == 2;
  }
  /**
   * <pre>
   * Client initialisation request
   * A worker will not be eligible for triggers
   * until it has identified itself
   * </pre>
   *
   * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
   * @return The initRequest.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.InitRequest getInitRequest() {
    if (contentCase_ == 2) {
       return (io.nitric.proto.faas.v1.InitRequest) content_;
    }
    return io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
  }
  /**
   * <pre>
   * Client initialisation request
   * A worker will not be eligible for triggers
   * until it has identified itself
   * </pre>
   *
   * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.InitRequestOrBuilder getInitRequestOrBuilder() {
    if (contentCase_ == 2) {
       return (io.nitric.proto.faas.v1.InitRequest) content_;
    }
    return io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
  }

  public static final int TRIGGER_RESPONSE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Client responsding with result of
   * a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
   * @return Whether the triggerResponse field is set.
   */
  @java.lang.Override
  public boolean hasTriggerResponse() {
    return contentCase_ == 3;
  }
  /**
   * <pre>
   * Client responsding with result of
   * a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
   * @return The triggerResponse.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.TriggerResponse getTriggerResponse() {
    if (contentCase_ == 3) {
       return (io.nitric.proto.faas.v1.TriggerResponse) content_;
    }
    return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
  }
  /**
   * <pre>
   * Client responsding with result of
   * a trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.TriggerResponseOrBuilder getTriggerResponseOrBuilder() {
    if (contentCase_ == 3) {
       return (io.nitric.proto.faas.v1.TriggerResponse) content_;
    }
    return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
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
    if (contentCase_ == 2) {
      output.writeMessage(2, (io.nitric.proto.faas.v1.InitRequest) content_);
    }
    if (contentCase_ == 3) {
      output.writeMessage(3, (io.nitric.proto.faas.v1.TriggerResponse) content_);
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
    if (contentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.nitric.proto.faas.v1.InitRequest) content_);
    }
    if (contentCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.nitric.proto.faas.v1.TriggerResponse) content_);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.ClientMessage)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.ClientMessage other = (io.nitric.proto.faas.v1.ClientMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getContentCase().equals(other.getContentCase())) return false;
    switch (contentCase_) {
      case 2:
        if (!getInitRequest()
            .equals(other.getInitRequest())) return false;
        break;
      case 3:
        if (!getTriggerResponse()
            .equals(other.getTriggerResponse())) return false;
        break;
      case 0:
      default:
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
    switch (contentCase_) {
      case 2:
        hash = (37 * hash) + INIT_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getInitRequest().hashCode();
        break;
      case 3:
        hash = (37 * hash) + TRIGGER_RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getTriggerResponse().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ClientMessage parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.ClientMessage prototype) {
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
   * Messages the client is able to send to the server
   * </pre>
   *
   * Protobuf type {@code nitric.faas.v1.ClientMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.ClientMessage)
      io.nitric.proto.faas.v1.ClientMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ClientMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ClientMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.ClientMessage.class, io.nitric.proto.faas.v1.ClientMessage.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.ClientMessage.newBuilder()
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

      if (initRequestBuilder_ != null) {
        initRequestBuilder_.clear();
      }
      if (triggerResponseBuilder_ != null) {
        triggerResponseBuilder_.clear();
      }
      contentCase_ = 0;
      content_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ClientMessage_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ClientMessage getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.ClientMessage.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ClientMessage build() {
      io.nitric.proto.faas.v1.ClientMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ClientMessage buildPartial() {
      io.nitric.proto.faas.v1.ClientMessage result = new io.nitric.proto.faas.v1.ClientMessage(this);
      result.id_ = id_;
      if (contentCase_ == 2) {
        if (initRequestBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = initRequestBuilder_.build();
        }
      }
      if (contentCase_ == 3) {
        if (triggerResponseBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = triggerResponseBuilder_.build();
        }
      }
      result.contentCase_ = contentCase_;
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
      if (other instanceof io.nitric.proto.faas.v1.ClientMessage) {
        return mergeFrom((io.nitric.proto.faas.v1.ClientMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.ClientMessage other) {
      if (other == io.nitric.proto.faas.v1.ClientMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      switch (other.getContentCase()) {
        case INIT_REQUEST: {
          mergeInitRequest(other.getInitRequest());
          break;
        }
        case TRIGGER_RESPONSE: {
          mergeTriggerResponse(other.getTriggerResponse());
          break;
        }
        case CONTENT_NOT_SET: {
          break;
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
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getInitRequestFieldBuilder().getBuilder(),
                  extensionRegistry);
              contentCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTriggerResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              contentCase_ = 3;
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
    private int contentCase_ = 0;
    private java.lang.Object content_;
    public ContentCase
        getContentCase() {
      return ContentCase.forNumber(
          contentCase_);
    }

    public Builder clearContent() {
      contentCase_ = 0;
      content_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Client message ID, used to pair requests/responses
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
     * Client message ID, used to pair requests/responses
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
     * Client message ID, used to pair requests/responses
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
     * Client message ID, used to pair requests/responses
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
     * Client message ID, used to pair requests/responses
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

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.InitRequest, io.nitric.proto.faas.v1.InitRequest.Builder, io.nitric.proto.faas.v1.InitRequestOrBuilder> initRequestBuilder_;
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     * @return Whether the initRequest field is set.
     */
    @java.lang.Override
    public boolean hasInitRequest() {
      return contentCase_ == 2;
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     * @return The initRequest.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.InitRequest getInitRequest() {
      if (initRequestBuilder_ == null) {
        if (contentCase_ == 2) {
          return (io.nitric.proto.faas.v1.InitRequest) content_;
        }
        return io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
      } else {
        if (contentCase_ == 2) {
          return initRequestBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    public Builder setInitRequest(io.nitric.proto.faas.v1.InitRequest value) {
      if (initRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        initRequestBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    public Builder setInitRequest(
        io.nitric.proto.faas.v1.InitRequest.Builder builderForValue) {
      if (initRequestBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        initRequestBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    public Builder mergeInitRequest(io.nitric.proto.faas.v1.InitRequest value) {
      if (initRequestBuilder_ == null) {
        if (contentCase_ == 2 &&
            content_ != io.nitric.proto.faas.v1.InitRequest.getDefaultInstance()) {
          content_ = io.nitric.proto.faas.v1.InitRequest.newBuilder((io.nitric.proto.faas.v1.InitRequest) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 2) {
          initRequestBuilder_.mergeFrom(value);
        } else {
          initRequestBuilder_.setMessage(value);
        }
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    public Builder clearInitRequest() {
      if (initRequestBuilder_ == null) {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
        }
        initRequestBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    public io.nitric.proto.faas.v1.InitRequest.Builder getInitRequestBuilder() {
      return getInitRequestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.InitRequestOrBuilder getInitRequestOrBuilder() {
      if ((contentCase_ == 2) && (initRequestBuilder_ != null)) {
        return initRequestBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 2) {
          return (io.nitric.proto.faas.v1.InitRequest) content_;
        }
        return io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client initialisation request
     * A worker will not be eligible for triggers
     * until it has identified itself
     * </pre>
     *
     * <code>.nitric.faas.v1.InitRequest init_request = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.InitRequest, io.nitric.proto.faas.v1.InitRequest.Builder, io.nitric.proto.faas.v1.InitRequestOrBuilder> 
        getInitRequestFieldBuilder() {
      if (initRequestBuilder_ == null) {
        if (!(contentCase_ == 2)) {
          content_ = io.nitric.proto.faas.v1.InitRequest.getDefaultInstance();
        }
        initRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.InitRequest, io.nitric.proto.faas.v1.InitRequest.Builder, io.nitric.proto.faas.v1.InitRequestOrBuilder>(
                (io.nitric.proto.faas.v1.InitRequest) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 2;
      onChanged();;
      return initRequestBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.TriggerResponse, io.nitric.proto.faas.v1.TriggerResponse.Builder, io.nitric.proto.faas.v1.TriggerResponseOrBuilder> triggerResponseBuilder_;
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     * @return Whether the triggerResponse field is set.
     */
    @java.lang.Override
    public boolean hasTriggerResponse() {
      return contentCase_ == 3;
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     * @return The triggerResponse.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.TriggerResponse getTriggerResponse() {
      if (triggerResponseBuilder_ == null) {
        if (contentCase_ == 3) {
          return (io.nitric.proto.faas.v1.TriggerResponse) content_;
        }
        return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
      } else {
        if (contentCase_ == 3) {
          return triggerResponseBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    public Builder setTriggerResponse(io.nitric.proto.faas.v1.TriggerResponse value) {
      if (triggerResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        triggerResponseBuilder_.setMessage(value);
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    public Builder setTriggerResponse(
        io.nitric.proto.faas.v1.TriggerResponse.Builder builderForValue) {
      if (triggerResponseBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        triggerResponseBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    public Builder mergeTriggerResponse(io.nitric.proto.faas.v1.TriggerResponse value) {
      if (triggerResponseBuilder_ == null) {
        if (contentCase_ == 3 &&
            content_ != io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance()) {
          content_ = io.nitric.proto.faas.v1.TriggerResponse.newBuilder((io.nitric.proto.faas.v1.TriggerResponse) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 3) {
          triggerResponseBuilder_.mergeFrom(value);
        } else {
          triggerResponseBuilder_.setMessage(value);
        }
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    public Builder clearTriggerResponse() {
      if (triggerResponseBuilder_ == null) {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
        }
        triggerResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    public io.nitric.proto.faas.v1.TriggerResponse.Builder getTriggerResponseBuilder() {
      return getTriggerResponseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.TriggerResponseOrBuilder getTriggerResponseOrBuilder() {
      if ((contentCase_ == 3) && (triggerResponseBuilder_ != null)) {
        return triggerResponseBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 3) {
          return (io.nitric.proto.faas.v1.TriggerResponse) content_;
        }
        return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client responsding with result of
     * a trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TriggerResponse trigger_response = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.TriggerResponse, io.nitric.proto.faas.v1.TriggerResponse.Builder, io.nitric.proto.faas.v1.TriggerResponseOrBuilder> 
        getTriggerResponseFieldBuilder() {
      if (triggerResponseBuilder_ == null) {
        if (!(contentCase_ == 3)) {
          content_ = io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
        }
        triggerResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.TriggerResponse, io.nitric.proto.faas.v1.TriggerResponse.Builder, io.nitric.proto.faas.v1.TriggerResponseOrBuilder>(
                (io.nitric.proto.faas.v1.TriggerResponse) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 3;
      onChanged();;
      return triggerResponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.ClientMessage)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.ClientMessage)
  private static final io.nitric.proto.faas.v1.ClientMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.ClientMessage();
  }

  public static io.nitric.proto.faas.v1.ClientMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientMessage>
      PARSER = new com.google.protobuf.AbstractParser<ClientMessage>() {
    @java.lang.Override
    public ClientMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.ClientMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
