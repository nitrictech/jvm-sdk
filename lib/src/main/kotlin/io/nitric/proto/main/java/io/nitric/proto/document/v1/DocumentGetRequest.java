// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

/**
 * Protobuf type {@code nitric.document.v1.DocumentGetRequest}
 */
public final class DocumentGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.document.v1.DocumentGetRequest)
    DocumentGetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentGetRequest.newBuilder() to construct.
  private DocumentGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentGetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentGetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.document.v1.DocumentGetRequest.class, io.nitric.proto.document.v1.DocumentGetRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private io.nitric.proto.document.v1.Key key_;
  /**
   * <pre>
   * Key of the document to retrieve
   * </pre>
   *
   * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * Key of the document to retrieve
   * </pre>
   *
   * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
   * @return The key.
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.Key getKey() {
    return key_ == null ? io.nitric.proto.document.v1.Key.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Key of the document to retrieve
   * </pre>
   *
   * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.KeyOrBuilder getKeyOrBuilder() {
    return getKey();
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
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
    if (!(obj instanceof io.nitric.proto.document.v1.DocumentGetRequest)) {
      return super.equals(obj);
    }
    io.nitric.proto.document.v1.DocumentGetRequest other = (io.nitric.proto.document.v1.DocumentGetRequest) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetRequest parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.document.v1.DocumentGetRequest prototype) {
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
   * Protobuf type {@code nitric.document.v1.DocumentGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.document.v1.DocumentGetRequest)
      io.nitric.proto.document.v1.DocumentGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.document.v1.DocumentGetRequest.class, io.nitric.proto.document.v1.DocumentGetRequest.Builder.class);
    }

    // Construct using io.nitric.proto.document.v1.DocumentGetRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetRequest_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetRequest getDefaultInstanceForType() {
      return io.nitric.proto.document.v1.DocumentGetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetRequest build() {
      io.nitric.proto.document.v1.DocumentGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetRequest buildPartial() {
      io.nitric.proto.document.v1.DocumentGetRequest result = new io.nitric.proto.document.v1.DocumentGetRequest(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
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
      if (other instanceof io.nitric.proto.document.v1.DocumentGetRequest) {
        return mergeFrom((io.nitric.proto.document.v1.DocumentGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.document.v1.DocumentGetRequest other) {
      if (other == io.nitric.proto.document.v1.DocumentGetRequest.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
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
                  getKeyFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private io.nitric.proto.document.v1.Key key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     * @return The key.
     */
    public io.nitric.proto.document.v1.Key getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? io.nitric.proto.document.v1.Key.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setKey(io.nitric.proto.document.v1.Key value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setKey(
        io.nitric.proto.document.v1.Key.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeKey(io.nitric.proto.document.v1.Key value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            io.nitric.proto.document.v1.Key.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.document.v1.Key.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.document.v1.KeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            io.nitric.proto.document.v1.Key.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Key of the document to retrieve
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.document.v1.DocumentGetRequest)
  }

  // @@protoc_insertion_point(class_scope:nitric.document.v1.DocumentGetRequest)
  private static final io.nitric.proto.document.v1.DocumentGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.document.v1.DocumentGetRequest();
  }

  public static io.nitric.proto.document.v1.DocumentGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<DocumentGetRequest>() {
    @java.lang.Override
    public DocumentGetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentGetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.document.v1.DocumentGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
