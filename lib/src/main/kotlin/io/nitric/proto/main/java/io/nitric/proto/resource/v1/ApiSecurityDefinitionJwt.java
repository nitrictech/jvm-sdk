// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * <pre>
 * protect your API with JWT authentication
 * </pre>
 *
 * Protobuf type {@code nitric.resource.v1.ApiSecurityDefinitionJwt}
 */
public final class ApiSecurityDefinitionJwt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.resource.v1.ApiSecurityDefinitionJwt)
    ApiSecurityDefinitionJwtOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiSecurityDefinitionJwt.newBuilder() to construct.
  private ApiSecurityDefinitionJwt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiSecurityDefinitionJwt() {
    issuer_ = "";
    audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiSecurityDefinitionJwt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.class, io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.Builder.class);
  }

  public static final int ISSUER_FIELD_NUMBER = 1;
  private volatile java.lang.Object issuer_;
  /**
   * <code>string issuer = 1;</code>
   * @return The issuer.
   */
  @java.lang.Override
  public java.lang.String getIssuer() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issuer_ = s;
      return s;
    }
  }
  /**
   * <code>string issuer = 1;</code>
   * @return The bytes for issuer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIssuerBytes() {
    java.lang.Object ref = issuer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issuer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList audiences_;
  /**
   * <code>repeated string audiences = 2;</code>
   * @return A list containing the audiences.
   */
  public com.google.protobuf.ProtocolStringList
      getAudiencesList() {
    return audiences_;
  }
  /**
   * <code>repeated string audiences = 2;</code>
   * @return The count of audiences.
   */
  public int getAudiencesCount() {
    return audiences_.size();
  }
  /**
   * <code>repeated string audiences = 2;</code>
   * @param index The index of the element to return.
   * @return The audiences at the given index.
   */
  public java.lang.String getAudiences(int index) {
    return audiences_.get(index);
  }
  /**
   * <code>repeated string audiences = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the audiences at the given index.
   */
  public com.google.protobuf.ByteString
      getAudiencesBytes(int index) {
    return audiences_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issuer_);
    }
    for (int i = 0; i < audiences_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audiences_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issuer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issuer_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < audiences_.size(); i++) {
        dataSize += computeStringSizeNoTag(audiences_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAudiencesList().size();
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
    if (!(obj instanceof io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt)) {
      return super.equals(obj);
    }
    io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt other = (io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt) obj;

    if (!getIssuer()
        .equals(other.getIssuer())) return false;
    if (!getAudiencesList()
        .equals(other.getAudiencesList())) return false;
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
    hash = (37 * hash) + ISSUER_FIELD_NUMBER;
    hash = (53 * hash) + getIssuer().hashCode();
    if (getAudiencesCount() > 0) {
      hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAudiencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt prototype) {
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
   * protect your API with JWT authentication
   * </pre>
   *
   * Protobuf type {@code nitric.resource.v1.ApiSecurityDefinitionJwt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.resource.v1.ApiSecurityDefinitionJwt)
      io.nitric.proto.resource.v1.ApiSecurityDefinitionJwtOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.class, io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.Builder.class);
    }

    // Construct using io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      issuer_ = "";

      audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiSecurityDefinitionJwt_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt getDefaultInstanceForType() {
      return io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt build() {
      io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt buildPartial() {
      io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt result = new io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt(this);
      int from_bitField0_ = bitField0_;
      result.issuer_ = issuer_;
      if (((bitField0_ & 0x00000001) != 0)) {
        audiences_ = audiences_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.audiences_ = audiences_;
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
      if (other instanceof io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt) {
        return mergeFrom((io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt other) {
      if (other == io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt.getDefaultInstance()) return this;
      if (!other.getIssuer().isEmpty()) {
        issuer_ = other.issuer_;
        onChanged();
      }
      if (!other.audiences_.isEmpty()) {
        if (audiences_.isEmpty()) {
          audiences_ = other.audiences_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAudiencesIsMutable();
          audiences_.addAll(other.audiences_);
        }
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
              issuer_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAudiencesIsMutable();
              audiences_.add(s);
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
    private int bitField0_;

    private java.lang.Object issuer_ = "";
    /**
     * <code>string issuer = 1;</code>
     * @return The issuer.
     */
    public java.lang.String getIssuer() {
      java.lang.Object ref = issuer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issuer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string issuer = 1;</code>
     * @return The bytes for issuer.
     */
    public com.google.protobuf.ByteString
        getIssuerBytes() {
      java.lang.Object ref = issuer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issuer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string issuer = 1;</code>
     * @param value The issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      issuer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string issuer = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIssuer() {
      
      issuer_ = getDefaultInstance().getIssuer();
      onChanged();
      return this;
    }
    /**
     * <code>string issuer = 1;</code>
     * @param value The bytes for issuer to set.
     * @return This builder for chaining.
     */
    public Builder setIssuerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      issuer_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAudiencesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        audiences_ = new com.google.protobuf.LazyStringArrayList(audiences_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @return A list containing the audiences.
     */
    public com.google.protobuf.ProtocolStringList
        getAudiencesList() {
      return audiences_.getUnmodifiableView();
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @return The count of audiences.
     */
    public int getAudiencesCount() {
      return audiences_.size();
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param index The index of the element to return.
     * @return The audiences at the given index.
     */
    public java.lang.String getAudiences(int index) {
      return audiences_.get(index);
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the audiences at the given index.
     */
    public com.google.protobuf.ByteString
        getAudiencesBytes(int index) {
      return audiences_.getByteString(index);
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param index The index to set the value at.
     * @param value The audiences to set.
     * @return This builder for chaining.
     */
    public Builder setAudiences(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAudiencesIsMutable();
      audiences_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param value The audiences to add.
     * @return This builder for chaining.
     */
    public Builder addAudiences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAudiencesIsMutable();
      audiences_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param values The audiences to add.
     * @return This builder for chaining.
     */
    public Builder addAllAudiences(
        java.lang.Iterable<java.lang.String> values) {
      ensureAudiencesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, audiences_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudiences() {
      audiences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string audiences = 2;</code>
     * @param value The bytes of the audiences to add.
     * @return This builder for chaining.
     */
    public Builder addAudiencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAudiencesIsMutable();
      audiences_.add(value);
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


    // @@protoc_insertion_point(builder_scope:nitric.resource.v1.ApiSecurityDefinitionJwt)
  }

  // @@protoc_insertion_point(class_scope:nitric.resource.v1.ApiSecurityDefinitionJwt)
  private static final io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt();
  }

  public static io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiSecurityDefinitionJwt>
      PARSER = new com.google.protobuf.AbstractParser<ApiSecurityDefinitionJwt>() {
    @java.lang.Override
    public ApiSecurityDefinitionJwt parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiSecurityDefinitionJwt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiSecurityDefinitionJwt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

