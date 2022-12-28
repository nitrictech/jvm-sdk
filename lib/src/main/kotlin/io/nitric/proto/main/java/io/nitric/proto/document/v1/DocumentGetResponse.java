// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

/**
 * Protobuf type {@code nitric.document.v1.DocumentGetResponse}
 */
public final class DocumentGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.document.v1.DocumentGetResponse)
    DocumentGetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentGetResponse.newBuilder() to construct.
  private DocumentGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentGetResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentGetResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.document.v1.DocumentGetResponse.class, io.nitric.proto.document.v1.DocumentGetResponse.Builder.class);
  }

  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private io.nitric.proto.document.v1.Document document_;
  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.nitric.document.v1.Document document = 1;</code>
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.nitric.document.v1.Document document = 1;</code>
   * @return The document.
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.Document getDocument() {
    return document_ == null ? io.nitric.proto.document.v1.Document.getDefaultInstance() : document_;
  }
  /**
   * <pre>
   * The retrieved value
   * </pre>
   *
   * <code>.nitric.document.v1.Document document = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.DocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
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
    if (document_ != null) {
      output.writeMessage(1, getDocument());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDocument());
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
    if (!(obj instanceof io.nitric.proto.document.v1.DocumentGetResponse)) {
      return super.equals(obj);
    }
    io.nitric.proto.document.v1.DocumentGetResponse other = (io.nitric.proto.document.v1.DocumentGetResponse) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument()
          .equals(other.getDocument())) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.DocumentGetResponse parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.document.v1.DocumentGetResponse prototype) {
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
   * Protobuf type {@code nitric.document.v1.DocumentGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.document.v1.DocumentGetResponse)
      io.nitric.proto.document.v1.DocumentGetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.document.v1.DocumentGetResponse.class, io.nitric.proto.document.v1.DocumentGetResponse.Builder.class);
    }

    // Construct using io.nitric.proto.document.v1.DocumentGetResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_DocumentGetResponse_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetResponse getDefaultInstanceForType() {
      return io.nitric.proto.document.v1.DocumentGetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetResponse build() {
      io.nitric.proto.document.v1.DocumentGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.DocumentGetResponse buildPartial() {
      io.nitric.proto.document.v1.DocumentGetResponse result = new io.nitric.proto.document.v1.DocumentGetResponse(this);
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
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
      if (other instanceof io.nitric.proto.document.v1.DocumentGetResponse) {
        return mergeFrom((io.nitric.proto.document.v1.DocumentGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.document.v1.DocumentGetResponse other) {
      if (other == io.nitric.proto.document.v1.DocumentGetResponse.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
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
                  getDocumentFieldBuilder().getBuilder(),
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

    private io.nitric.proto.document.v1.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Document, io.nitric.proto.document.v1.Document.Builder, io.nitric.proto.document.v1.DocumentOrBuilder> documentBuilder_;
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     * @return The document.
     */
    public io.nitric.proto.document.v1.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null ? io.nitric.proto.document.v1.Document.getDefaultInstance() : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public Builder setDocument(io.nitric.proto.document.v1.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public Builder setDocument(
        io.nitric.proto.document.v1.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public Builder mergeDocument(io.nitric.proto.document.v1.Document value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
            io.nitric.proto.document.v1.Document.newBuilder(document_).mergeFrom(value).buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public io.nitric.proto.document.v1.Document.Builder getDocumentBuilder() {
      
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    public io.nitric.proto.document.v1.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null ?
            io.nitric.proto.document.v1.Document.getDefaultInstance() : document_;
      }
    }
    /**
     * <pre>
     * The retrieved value
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Document, io.nitric.proto.document.v1.Document.Builder, io.nitric.proto.document.v1.DocumentOrBuilder> 
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.document.v1.Document, io.nitric.proto.document.v1.Document.Builder, io.nitric.proto.document.v1.DocumentOrBuilder>(
                getDocument(),
                getParentForChildren(),
                isClean());
        document_ = null;
      }
      return documentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.document.v1.DocumentGetResponse)
  }

  // @@protoc_insertion_point(class_scope:nitric.document.v1.DocumentGetResponse)
  private static final io.nitric.proto.document.v1.DocumentGetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.document.v1.DocumentGetResponse();
  }

  public static io.nitric.proto.document.v1.DocumentGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<DocumentGetResponse>() {
    @java.lang.Override
    public DocumentGetResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentGetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentGetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.document.v1.DocumentGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

