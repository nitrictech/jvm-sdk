// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * Protobuf type {@code nitric.faas.v1.WebsocketResponseContext}
 */
public final class WebsocketResponseContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.WebsocketResponseContext)
    WebsocketResponseContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebsocketResponseContext.newBuilder() to construct.
  private WebsocketResponseContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebsocketResponseContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebsocketResponseContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_WebsocketResponseContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_WebsocketResponseContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.WebsocketResponseContext.class, io.nitric.proto.faas.v1.WebsocketResponseContext.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <pre>
   * There aren't really responses here, instead we need to provide a runtime
   * API for responding back and emitting/broadcasting on the websocket from the server
   * </pre>
   *
   * <code>bool success = 1;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.WebsocketResponseContext)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.WebsocketResponseContext other = (io.nitric.proto.faas.v1.WebsocketResponseContext) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.WebsocketResponseContext parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.WebsocketResponseContext prototype) {
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
   * Protobuf type {@code nitric.faas.v1.WebsocketResponseContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.WebsocketResponseContext)
      io.nitric.proto.faas.v1.WebsocketResponseContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_WebsocketResponseContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_WebsocketResponseContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.WebsocketResponseContext.class, io.nitric.proto.faas.v1.WebsocketResponseContext.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.WebsocketResponseContext.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      success_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_WebsocketResponseContext_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.WebsocketResponseContext getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.WebsocketResponseContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.WebsocketResponseContext build() {
      io.nitric.proto.faas.v1.WebsocketResponseContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.WebsocketResponseContext buildPartial() {
      io.nitric.proto.faas.v1.WebsocketResponseContext result = new io.nitric.proto.faas.v1.WebsocketResponseContext(this);
      result.success_ = success_;
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
      if (other instanceof io.nitric.proto.faas.v1.WebsocketResponseContext) {
        return mergeFrom((io.nitric.proto.faas.v1.WebsocketResponseContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.WebsocketResponseContext other) {
      if (other == io.nitric.proto.faas.v1.WebsocketResponseContext.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
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
            case 8: {
              success_ = input.readBool();

              break;
            } // case 8
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

    private boolean success_ ;
    /**
     * <pre>
     * There aren't really responses here, instead we need to provide a runtime
     * API for responding back and emitting/broadcasting on the websocket from the server
     * </pre>
     *
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <pre>
     * There aren't really responses here, instead we need to provide a runtime
     * API for responding back and emitting/broadcasting on the websocket from the server
     * </pre>
     *
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * There aren't really responses here, instead we need to provide a runtime
     * API for responding back and emitting/broadcasting on the websocket from the server
     * </pre>
     *
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.WebsocketResponseContext)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.WebsocketResponseContext)
  private static final io.nitric.proto.faas.v1.WebsocketResponseContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.WebsocketResponseContext();
  }

  public static io.nitric.proto.faas.v1.WebsocketResponseContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebsocketResponseContext>
      PARSER = new com.google.protobuf.AbstractParser<WebsocketResponseContext>() {
    @java.lang.Override
    public WebsocketResponseContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebsocketResponseContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebsocketResponseContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.WebsocketResponseContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

