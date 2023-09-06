// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/error/v1/error.proto

package io.nitric.proto.error.v1;

/**
 * Protobuf type {@code nitric.error.v1.ErrorDetails}
 */
public final class ErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.error.v1.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
    message_ = "";
    cause_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErrorDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.error.v1.ErrorDetails.class, io.nitric.proto.error.v1.ErrorDetails.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * The developer error message, explaining the error and ideally solution.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The developer error message, explaining the error and ideally solution.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAUSE_FIELD_NUMBER = 2;
  private volatile java.lang.Object cause_;
  /**
   * <pre>
   * The error root cause.
   * </pre>
   *
   * <code>string cause = 2;</code>
   * @return The cause.
   */
  @java.lang.Override
  public java.lang.String getCause() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cause_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The error root cause.
   * </pre>
   *
   * <code>string cause = 2;</code>
   * @return The bytes for cause.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCauseBytes() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cause_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_FIELD_NUMBER = 3;
  private io.nitric.proto.error.v1.ErrorScope scope_;
  /**
   * <pre>
   * The scope of the error.
   * </pre>
   *
   * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
   * @return Whether the scope field is set.
   */
  @java.lang.Override
  public boolean hasScope() {
    return scope_ != null;
  }
  /**
   * <pre>
   * The scope of the error.
   * </pre>
   *
   * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
   * @return The scope.
   */
  @java.lang.Override
  public io.nitric.proto.error.v1.ErrorScope getScope() {
    return scope_ == null ? io.nitric.proto.error.v1.ErrorScope.getDefaultInstance() : scope_;
  }
  /**
   * <pre>
   * The scope of the error.
   * </pre>
   *
   * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
   */
  @java.lang.Override
  public io.nitric.proto.error.v1.ErrorScopeOrBuilder getScopeOrBuilder() {
    return getScope();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cause_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cause_);
    }
    if (scope_ != null) {
      output.writeMessage(3, getScope());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cause_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cause_);
    }
    if (scope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getScope());
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
    if (!(obj instanceof io.nitric.proto.error.v1.ErrorDetails)) {
      return super.equals(obj);
    }
    io.nitric.proto.error.v1.ErrorDetails other = (io.nitric.proto.error.v1.ErrorDetails) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getCause()
        .equals(other.getCause())) return false;
    if (hasScope() != other.hasScope()) return false;
    if (hasScope()) {
      if (!getScope()
          .equals(other.getScope())) return false;
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + CAUSE_FIELD_NUMBER;
    hash = (53 * hash) + getCause().hashCode();
    if (hasScope()) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + getScope().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorDetails parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.error.v1.ErrorDetails prototype) {
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
   * Protobuf type {@code nitric.error.v1.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.error.v1.ErrorDetails)
      io.nitric.proto.error.v1.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.error.v1.ErrorDetails.class, io.nitric.proto.error.v1.ErrorDetails.Builder.class);
    }

    // Construct using io.nitric.proto.error.v1.ErrorDetails.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      cause_ = "";

      if (scopeBuilder_ == null) {
        scope_ = null;
      } else {
        scope_ = null;
        scopeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorDetails getDefaultInstanceForType() {
      return io.nitric.proto.error.v1.ErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorDetails build() {
      io.nitric.proto.error.v1.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorDetails buildPartial() {
      io.nitric.proto.error.v1.ErrorDetails result = new io.nitric.proto.error.v1.ErrorDetails(this);
      result.message_ = message_;
      result.cause_ = cause_;
      if (scopeBuilder_ == null) {
        result.scope_ = scope_;
      } else {
        result.scope_ = scopeBuilder_.build();
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
      if (other instanceof io.nitric.proto.error.v1.ErrorDetails) {
        return mergeFrom((io.nitric.proto.error.v1.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.error.v1.ErrorDetails other) {
      if (other == io.nitric.proto.error.v1.ErrorDetails.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getCause().isEmpty()) {
        cause_ = other.cause_;
        onChanged();
      }
      if (other.hasScope()) {
        mergeScope(other.getScope());
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
              message_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              cause_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getScopeFieldBuilder().getBuilder(),
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

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * The developer error message, explaining the error and ideally solution.
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The developer error message, explaining the error and ideally solution.
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The developer error message, explaining the error and ideally solution.
     * </pre>
     *
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The developer error message, explaining the error and ideally solution.
     * </pre>
     *
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The developer error message, explaining the error and ideally solution.
     * </pre>
     *
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cause_ = "";
    /**
     * <pre>
     * The error root cause.
     * </pre>
     *
     * <code>string cause = 2;</code>
     * @return The cause.
     */
    public java.lang.String getCause() {
      java.lang.Object ref = cause_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cause_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The error root cause.
     * </pre>
     *
     * <code>string cause = 2;</code>
     * @return The bytes for cause.
     */
    public com.google.protobuf.ByteString
        getCauseBytes() {
      java.lang.Object ref = cause_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cause_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The error root cause.
     * </pre>
     *
     * <code>string cause = 2;</code>
     * @param value The cause to set.
     * @return This builder for chaining.
     */
    public Builder setCause(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cause_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error root cause.
     * </pre>
     *
     * <code>string cause = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCause() {
      
      cause_ = getDefaultInstance().getCause();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error root cause.
     * </pre>
     *
     * <code>string cause = 2;</code>
     * @param value The bytes for cause to set.
     * @return This builder for chaining.
     */
    public Builder setCauseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cause_ = value;
      onChanged();
      return this;
    }

    private io.nitric.proto.error.v1.ErrorScope scope_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.error.v1.ErrorScope, io.nitric.proto.error.v1.ErrorScope.Builder, io.nitric.proto.error.v1.ErrorScopeOrBuilder> scopeBuilder_;
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     * @return Whether the scope field is set.
     */
    public boolean hasScope() {
      return scopeBuilder_ != null || scope_ != null;
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     * @return The scope.
     */
    public io.nitric.proto.error.v1.ErrorScope getScope() {
      if (scopeBuilder_ == null) {
        return scope_ == null ? io.nitric.proto.error.v1.ErrorScope.getDefaultInstance() : scope_;
      } else {
        return scopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public Builder setScope(io.nitric.proto.error.v1.ErrorScope value) {
      if (scopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scope_ = value;
        onChanged();
      } else {
        scopeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public Builder setScope(
        io.nitric.proto.error.v1.ErrorScope.Builder builderForValue) {
      if (scopeBuilder_ == null) {
        scope_ = builderForValue.build();
        onChanged();
      } else {
        scopeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public Builder mergeScope(io.nitric.proto.error.v1.ErrorScope value) {
      if (scopeBuilder_ == null) {
        if (scope_ != null) {
          scope_ =
            io.nitric.proto.error.v1.ErrorScope.newBuilder(scope_).mergeFrom(value).buildPartial();
        } else {
          scope_ = value;
        }
        onChanged();
      } else {
        scopeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public Builder clearScope() {
      if (scopeBuilder_ == null) {
        scope_ = null;
        onChanged();
      } else {
        scope_ = null;
        scopeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public io.nitric.proto.error.v1.ErrorScope.Builder getScopeBuilder() {
      
      onChanged();
      return getScopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    public io.nitric.proto.error.v1.ErrorScopeOrBuilder getScopeOrBuilder() {
      if (scopeBuilder_ != null) {
        return scopeBuilder_.getMessageOrBuilder();
      } else {
        return scope_ == null ?
            io.nitric.proto.error.v1.ErrorScope.getDefaultInstance() : scope_;
      }
    }
    /**
     * <pre>
     * The scope of the error.
     * </pre>
     *
     * <code>.nitric.error.v1.ErrorScope scope = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.error.v1.ErrorScope, io.nitric.proto.error.v1.ErrorScope.Builder, io.nitric.proto.error.v1.ErrorScopeOrBuilder> 
        getScopeFieldBuilder() {
      if (scopeBuilder_ == null) {
        scopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.error.v1.ErrorScope, io.nitric.proto.error.v1.ErrorScope.Builder, io.nitric.proto.error.v1.ErrorScopeOrBuilder>(
                getScope(),
                getParentForChildren(),
                isClean());
        scope_ = null;
      }
      return scopeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.error.v1.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:nitric.error.v1.ErrorDetails)
  private static final io.nitric.proto.error.v1.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.error.v1.ErrorDetails();
  }

  public static io.nitric.proto.error.v1.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    @java.lang.Override
    public ErrorDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.error.v1.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

