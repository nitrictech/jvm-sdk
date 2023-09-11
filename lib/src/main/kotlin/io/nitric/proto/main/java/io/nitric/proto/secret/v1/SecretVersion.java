// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/secret/v1/secret.proto

package io.nitric.proto.secret.v1;

/**
 * <pre>
 * A version of a secret
 * </pre>
 *
 * Protobuf type {@code nitric.secret.v1.SecretVersion}
 */
public final class SecretVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.secret.v1.SecretVersion)
    SecretVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecretVersion.newBuilder() to construct.
  private SecretVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecretVersion() {
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecretVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.secret.v1.Secrets.internal_static_nitric_secret_v1_SecretVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.secret.v1.Secrets.internal_static_nitric_secret_v1_SecretVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.secret.v1.SecretVersion.class, io.nitric.proto.secret.v1.SecretVersion.Builder.class);
  }

  public static final int SECRET_FIELD_NUMBER = 1;
  private io.nitric.proto.secret.v1.Secret secret_;
  /**
   * <pre>
   * Reference to the secret container 
   * </pre>
   *
   * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return secret_ != null;
  }
  /**
   * <pre>
   * Reference to the secret container 
   * </pre>
   *
   * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
   * @return The secret.
   */
  @java.lang.Override
  public io.nitric.proto.secret.v1.Secret getSecret() {
    return secret_ == null ? io.nitric.proto.secret.v1.Secret.getDefaultInstance() : secret_;
  }
  /**
   * <pre>
   * Reference to the secret container 
   * </pre>
   *
   * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.nitric.proto.secret.v1.SecretOrBuilder getSecretOrBuilder() {
    return getSecret();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * The secret version
   * </pre>
   *
   * <code>string version = 2 [(.validate.rules) = { ... }</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The secret version
   * </pre>
   *
   * <code>string version = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
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
    if (secret_ != null) {
      output.writeMessage(1, getSecret());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (secret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSecret());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
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
    if (!(obj instanceof io.nitric.proto.secret.v1.SecretVersion)) {
      return super.equals(obj);
    }
    io.nitric.proto.secret.v1.SecretVersion other = (io.nitric.proto.secret.v1.SecretVersion) obj;

    if (hasSecret() != other.hasSecret()) return false;
    if (hasSecret()) {
      if (!getSecret()
          .equals(other.getSecret())) return false;
    }
    if (!getVersion()
        .equals(other.getVersion())) return false;
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
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.secret.v1.SecretVersion parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.secret.v1.SecretVersion prototype) {
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
   * A version of a secret
   * </pre>
   *
   * Protobuf type {@code nitric.secret.v1.SecretVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.secret.v1.SecretVersion)
      io.nitric.proto.secret.v1.SecretVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.secret.v1.Secrets.internal_static_nitric_secret_v1_SecretVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.secret.v1.Secrets.internal_static_nitric_secret_v1_SecretVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.secret.v1.SecretVersion.class, io.nitric.proto.secret.v1.SecretVersion.Builder.class);
    }

    // Construct using io.nitric.proto.secret.v1.SecretVersion.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (secretBuilder_ == null) {
        secret_ = null;
      } else {
        secret_ = null;
        secretBuilder_ = null;
      }
      version_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.secret.v1.Secrets.internal_static_nitric_secret_v1_SecretVersion_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.secret.v1.SecretVersion getDefaultInstanceForType() {
      return io.nitric.proto.secret.v1.SecretVersion.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.secret.v1.SecretVersion build() {
      io.nitric.proto.secret.v1.SecretVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.secret.v1.SecretVersion buildPartial() {
      io.nitric.proto.secret.v1.SecretVersion result = new io.nitric.proto.secret.v1.SecretVersion(this);
      if (secretBuilder_ == null) {
        result.secret_ = secret_;
      } else {
        result.secret_ = secretBuilder_.build();
      }
      result.version_ = version_;
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
      if (other instanceof io.nitric.proto.secret.v1.SecretVersion) {
        return mergeFrom((io.nitric.proto.secret.v1.SecretVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.secret.v1.SecretVersion other) {
      if (other == io.nitric.proto.secret.v1.SecretVersion.getDefaultInstance()) return this;
      if (other.hasSecret()) {
        mergeSecret(other.getSecret());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
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
                  getSecretFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              version_ = input.readStringRequireUtf8();

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

    private io.nitric.proto.secret.v1.Secret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.secret.v1.Secret, io.nitric.proto.secret.v1.Secret.Builder, io.nitric.proto.secret.v1.SecretOrBuilder> secretBuilder_;
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return secretBuilder_ != null || secret_ != null;
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     * @return The secret.
     */
    public io.nitric.proto.secret.v1.Secret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null ? io.nitric.proto.secret.v1.Secret.getDefaultInstance() : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setSecret(io.nitric.proto.secret.v1.Secret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
        onChanged();
      } else {
        secretBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setSecret(
        io.nitric.proto.secret.v1.Secret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
        onChanged();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeSecret(io.nitric.proto.secret.v1.Secret value) {
      if (secretBuilder_ == null) {
        if (secret_ != null) {
          secret_ =
            io.nitric.proto.secret.v1.Secret.newBuilder(secret_).mergeFrom(value).buildPartial();
        } else {
          secret_ = value;
        }
        onChanged();
      } else {
        secretBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearSecret() {
      if (secretBuilder_ == null) {
        secret_ = null;
        onChanged();
      } else {
        secret_ = null;
        secretBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.secret.v1.Secret.Builder getSecretBuilder() {
      
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    public io.nitric.proto.secret.v1.SecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null ?
            io.nitric.proto.secret.v1.Secret.getDefaultInstance() : secret_;
      }
    }
    /**
     * <pre>
     * Reference to the secret container 
     * </pre>
     *
     * <code>.nitric.secret.v1.Secret secret = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.secret.v1.Secret, io.nitric.proto.secret.v1.Secret.Builder, io.nitric.proto.secret.v1.SecretOrBuilder> 
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.secret.v1.Secret, io.nitric.proto.secret.v1.Secret.Builder, io.nitric.proto.secret.v1.SecretOrBuilder>(
                getSecret(),
                getParentForChildren(),
                isClean());
        secret_ = null;
      }
      return secretBuilder_;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * The secret version
     * </pre>
     *
     * <code>string version = 2 [(.validate.rules) = { ... }</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The secret version
     * </pre>
     *
     * <code>string version = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The secret version
     * </pre>
     *
     * <code>string version = 2 [(.validate.rules) = { ... }</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secret version
     * </pre>
     *
     * <code>string version = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secret version
     * </pre>
     *
     * <code>string version = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
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


    // @@protoc_insertion_point(builder_scope:nitric.secret.v1.SecretVersion)
  }

  // @@protoc_insertion_point(class_scope:nitric.secret.v1.SecretVersion)
  private static final io.nitric.proto.secret.v1.SecretVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.secret.v1.SecretVersion();
  }

  public static io.nitric.proto.secret.v1.SecretVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecretVersion>
      PARSER = new com.google.protobuf.AbstractParser<SecretVersion>() {
    @java.lang.Override
    public SecretVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecretVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecretVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.secret.v1.SecretVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
