// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

/**
 * <pre>
 * Provides a Collection type for storing documents
 * </pre>
 *
 * Protobuf type {@code nitric.document.v1.Collection}
 */
public final class Collection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.document.v1.Collection)
    CollectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Collection.newBuilder() to construct.
  private Collection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Collection() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Collection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_Collection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_Collection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.document.v1.Collection.class, io.nitric.proto.document.v1.Collection.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The collection name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The collection name
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 2;
  private io.nitric.proto.document.v1.Key parent_;
  /**
   * <pre>
   * Optional parent key, required when the collection is a sub-collection of another document
   * </pre>
   *
   * <code>.nitric.document.v1.Key parent = 2;</code>
   * @return Whether the parent field is set.
   */
  @java.lang.Override
  public boolean hasParent() {
    return parent_ != null;
  }
  /**
   * <pre>
   * Optional parent key, required when the collection is a sub-collection of another document
   * </pre>
   *
   * <code>.nitric.document.v1.Key parent = 2;</code>
   * @return The parent.
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.Key getParent() {
    return parent_ == null ? io.nitric.proto.document.v1.Key.getDefaultInstance() : parent_;
  }
  /**
   * <pre>
   * Optional parent key, required when the collection is a sub-collection of another document
   * </pre>
   *
   * <code>.nitric.document.v1.Key parent = 2;</code>
   */
  @java.lang.Override
  public io.nitric.proto.document.v1.KeyOrBuilder getParentOrBuilder() {
    return getParent();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (parent_ != null) {
      output.writeMessage(2, getParent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (parent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParent());
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
    if (!(obj instanceof io.nitric.proto.document.v1.Collection)) {
      return super.equals(obj);
    }
    io.nitric.proto.document.v1.Collection other = (io.nitric.proto.document.v1.Collection) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasParent() != other.hasParent()) return false;
    if (hasParent()) {
      if (!getParent()
          .equals(other.getParent())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasParent()) {
      hash = (37 * hash) + PARENT_FIELD_NUMBER;
      hash = (53 * hash) + getParent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.document.v1.Collection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.Collection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.Collection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.Collection parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.document.v1.Collection prototype) {
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
   * Provides a Collection type for storing documents
   * </pre>
   *
   * Protobuf type {@code nitric.document.v1.Collection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.document.v1.Collection)
      io.nitric.proto.document.v1.CollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_Collection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_Collection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.document.v1.Collection.class, io.nitric.proto.document.v1.Collection.Builder.class);
    }

    // Construct using io.nitric.proto.document.v1.Collection.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (parentBuilder_ == null) {
        parent_ = null;
      } else {
        parent_ = null;
        parentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_Collection_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.Collection getDefaultInstanceForType() {
      return io.nitric.proto.document.v1.Collection.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.Collection build() {
      io.nitric.proto.document.v1.Collection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.Collection buildPartial() {
      io.nitric.proto.document.v1.Collection result = new io.nitric.proto.document.v1.Collection(this);
      result.name_ = name_;
      if (parentBuilder_ == null) {
        result.parent_ = parent_;
      } else {
        result.parent_ = parentBuilder_.build();
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
      if (other instanceof io.nitric.proto.document.v1.Collection) {
        return mergeFrom((io.nitric.proto.document.v1.Collection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.document.v1.Collection other) {
      if (other == io.nitric.proto.document.v1.Collection.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasParent()) {
        mergeParent(other.getParent());
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
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getParentFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private io.nitric.proto.document.v1.Key parent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder> parentBuilder_;
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     * @return Whether the parent field is set.
     */
    public boolean hasParent() {
      return parentBuilder_ != null || parent_ != null;
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     * @return The parent.
     */
    public io.nitric.proto.document.v1.Key getParent() {
      if (parentBuilder_ == null) {
        return parent_ == null ? io.nitric.proto.document.v1.Key.getDefaultInstance() : parent_;
      } else {
        return parentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public Builder setParent(io.nitric.proto.document.v1.Key value) {
      if (parentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parent_ = value;
        onChanged();
      } else {
        parentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public Builder setParent(
        io.nitric.proto.document.v1.Key.Builder builderForValue) {
      if (parentBuilder_ == null) {
        parent_ = builderForValue.build();
        onChanged();
      } else {
        parentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public Builder mergeParent(io.nitric.proto.document.v1.Key value) {
      if (parentBuilder_ == null) {
        if (parent_ != null) {
          parent_ =
            io.nitric.proto.document.v1.Key.newBuilder(parent_).mergeFrom(value).buildPartial();
        } else {
          parent_ = value;
        }
        onChanged();
      } else {
        parentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public Builder clearParent() {
      if (parentBuilder_ == null) {
        parent_ = null;
        onChanged();
      } else {
        parent_ = null;
        parentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public io.nitric.proto.document.v1.Key.Builder getParentBuilder() {
      
      onChanged();
      return getParentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    public io.nitric.proto.document.v1.KeyOrBuilder getParentOrBuilder() {
      if (parentBuilder_ != null) {
        return parentBuilder_.getMessageOrBuilder();
      } else {
        return parent_ == null ?
            io.nitric.proto.document.v1.Key.getDefaultInstance() : parent_;
      }
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder> 
        getParentFieldBuilder() {
      if (parentBuilder_ == null) {
        parentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.document.v1.Key, io.nitric.proto.document.v1.Key.Builder, io.nitric.proto.document.v1.KeyOrBuilder>(
                getParent(),
                getParentForChildren(),
                isClean());
        parent_ = null;
      }
      return parentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.document.v1.Collection)
  }

  // @@protoc_insertion_point(class_scope:nitric.document.v1.Collection)
  private static final io.nitric.proto.document.v1.Collection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.document.v1.Collection();
  }

  public static io.nitric.proto.document.v1.Collection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Collection>
      PARSER = new com.google.protobuf.AbstractParser<Collection>() {
    @java.lang.Override
    public Collection parsePartialFrom(
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

  public static com.google.protobuf.Parser<Collection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Collection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.document.v1.Collection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

