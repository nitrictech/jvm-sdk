// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * Protobuf type {@code nitric.faas.v1.NotificationTriggerContext}
 */
public final class NotificationTriggerContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.NotificationTriggerContext)
    NotificationTriggerContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotificationTriggerContext.newBuilder() to construct.
  private NotificationTriggerContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotificationTriggerContext() {
    source_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NotificationTriggerContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_NotificationTriggerContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_NotificationTriggerContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.NotificationTriggerContext.class, io.nitric.proto.faas.v1.NotificationTriggerContext.Builder.class);
  }

  private int notificationCase_ = 0;
  private java.lang.Object notification_;
  public enum NotificationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BUCKET(10),
    NOTIFICATION_NOT_SET(0);
    private final int value;
    private NotificationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NotificationCase valueOf(int value) {
      return forNumber(value);
    }

    public static NotificationCase forNumber(int value) {
      switch (value) {
        case 10: return BUCKET;
        case 0: return NOTIFICATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public NotificationCase
  getNotificationCase() {
    return NotificationCase.forNumber(
        notificationCase_);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object source_;
  /**
   * <code>string source = 1;</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>string source = 1;</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUCKET_FIELD_NUMBER = 10;
  /**
   * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
   * @return Whether the bucket field is set.
   */
  @java.lang.Override
  public boolean hasBucket() {
    return notificationCase_ == 10;
  }
  /**
   * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
   * @return The bucket.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.BucketNotification getBucket() {
    if (notificationCase_ == 10) {
       return (io.nitric.proto.faas.v1.BucketNotification) notification_;
    }
    return io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
  }
  /**
   * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.BucketNotificationOrBuilder getBucketOrBuilder() {
    if (notificationCase_ == 10) {
       return (io.nitric.proto.faas.v1.BucketNotification) notification_;
    }
    return io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    if (notificationCase_ == 10) {
      output.writeMessage(10, (io.nitric.proto.faas.v1.BucketNotification) notification_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (notificationCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, (io.nitric.proto.faas.v1.BucketNotification) notification_);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.NotificationTriggerContext)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.NotificationTriggerContext other = (io.nitric.proto.faas.v1.NotificationTriggerContext) obj;

    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getNotificationCase().equals(other.getNotificationCase())) return false;
    switch (notificationCase_) {
      case 10:
        if (!getBucket()
            .equals(other.getBucket())) return false;
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    switch (notificationCase_) {
      case 10:
        hash = (37 * hash) + BUCKET_FIELD_NUMBER;
        hash = (53 * hash) + getBucket().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.NotificationTriggerContext parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.NotificationTriggerContext prototype) {
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
   * Protobuf type {@code nitric.faas.v1.NotificationTriggerContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.NotificationTriggerContext)
      io.nitric.proto.faas.v1.NotificationTriggerContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_NotificationTriggerContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_NotificationTriggerContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.NotificationTriggerContext.class, io.nitric.proto.faas.v1.NotificationTriggerContext.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.NotificationTriggerContext.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      source_ = "";

      if (bucketBuilder_ != null) {
        bucketBuilder_.clear();
      }
      notificationCase_ = 0;
      notification_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_NotificationTriggerContext_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.NotificationTriggerContext getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.NotificationTriggerContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.NotificationTriggerContext build() {
      io.nitric.proto.faas.v1.NotificationTriggerContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.NotificationTriggerContext buildPartial() {
      io.nitric.proto.faas.v1.NotificationTriggerContext result = new io.nitric.proto.faas.v1.NotificationTriggerContext(this);
      result.source_ = source_;
      if (notificationCase_ == 10) {
        if (bucketBuilder_ == null) {
          result.notification_ = notification_;
        } else {
          result.notification_ = bucketBuilder_.build();
        }
      }
      result.notificationCase_ = notificationCase_;
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
      if (other instanceof io.nitric.proto.faas.v1.NotificationTriggerContext) {
        return mergeFrom((io.nitric.proto.faas.v1.NotificationTriggerContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.NotificationTriggerContext other) {
      if (other == io.nitric.proto.faas.v1.NotificationTriggerContext.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      switch (other.getNotificationCase()) {
        case BUCKET: {
          mergeBucket(other.getBucket());
          break;
        }
        case NOTIFICATION_NOT_SET: {
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
              source_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 82: {
              input.readMessage(
                  getBucketFieldBuilder().getBuilder(),
                  extensionRegistry);
              notificationCase_ = 10;
              break;
            } // case 82
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
    private int notificationCase_ = 0;
    private java.lang.Object notification_;
    public NotificationCase
        getNotificationCase() {
      return NotificationCase.forNumber(
          notificationCase_);
    }

    public Builder clearNotification() {
      notificationCase_ = 0;
      notification_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object source_ = "";
    /**
     * <code>string source = 1;</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source = 1;</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source = 1;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string source = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <code>string source = 1;</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.BucketNotification, io.nitric.proto.faas.v1.BucketNotification.Builder, io.nitric.proto.faas.v1.BucketNotificationOrBuilder> bucketBuilder_;
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     * @return Whether the bucket field is set.
     */
    @java.lang.Override
    public boolean hasBucket() {
      return notificationCase_ == 10;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     * @return The bucket.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.BucketNotification getBucket() {
      if (bucketBuilder_ == null) {
        if (notificationCase_ == 10) {
          return (io.nitric.proto.faas.v1.BucketNotification) notification_;
        }
        return io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
      } else {
        if (notificationCase_ == 10) {
          return bucketBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    public Builder setBucket(io.nitric.proto.faas.v1.BucketNotification value) {
      if (bucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notification_ = value;
        onChanged();
      } else {
        bucketBuilder_.setMessage(value);
      }
      notificationCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    public Builder setBucket(
        io.nitric.proto.faas.v1.BucketNotification.Builder builderForValue) {
      if (bucketBuilder_ == null) {
        notification_ = builderForValue.build();
        onChanged();
      } else {
        bucketBuilder_.setMessage(builderForValue.build());
      }
      notificationCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    public Builder mergeBucket(io.nitric.proto.faas.v1.BucketNotification value) {
      if (bucketBuilder_ == null) {
        if (notificationCase_ == 10 &&
            notification_ != io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance()) {
          notification_ = io.nitric.proto.faas.v1.BucketNotification.newBuilder((io.nitric.proto.faas.v1.BucketNotification) notification_)
              .mergeFrom(value).buildPartial();
        } else {
          notification_ = value;
        }
        onChanged();
      } else {
        if (notificationCase_ == 10) {
          bucketBuilder_.mergeFrom(value);
        } else {
          bucketBuilder_.setMessage(value);
        }
      }
      notificationCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    public Builder clearBucket() {
      if (bucketBuilder_ == null) {
        if (notificationCase_ == 10) {
          notificationCase_ = 0;
          notification_ = null;
          onChanged();
        }
      } else {
        if (notificationCase_ == 10) {
          notificationCase_ = 0;
          notification_ = null;
        }
        bucketBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    public io.nitric.proto.faas.v1.BucketNotification.Builder getBucketBuilder() {
      return getBucketFieldBuilder().getBuilder();
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.BucketNotificationOrBuilder getBucketOrBuilder() {
      if ((notificationCase_ == 10) && (bucketBuilder_ != null)) {
        return bucketBuilder_.getMessageOrBuilder();
      } else {
        if (notificationCase_ == 10) {
          return (io.nitric.proto.faas.v1.BucketNotification) notification_;
        }
        return io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.BucketNotification bucket = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.BucketNotification, io.nitric.proto.faas.v1.BucketNotification.Builder, io.nitric.proto.faas.v1.BucketNotificationOrBuilder> 
        getBucketFieldBuilder() {
      if (bucketBuilder_ == null) {
        if (!(notificationCase_ == 10)) {
          notification_ = io.nitric.proto.faas.v1.BucketNotification.getDefaultInstance();
        }
        bucketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.BucketNotification, io.nitric.proto.faas.v1.BucketNotification.Builder, io.nitric.proto.faas.v1.BucketNotificationOrBuilder>(
                (io.nitric.proto.faas.v1.BucketNotification) notification_,
                getParentForChildren(),
                isClean());
        notification_ = null;
      }
      notificationCase_ = 10;
      onChanged();;
      return bucketBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.NotificationTriggerContext)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.NotificationTriggerContext)
  private static final io.nitric.proto.faas.v1.NotificationTriggerContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.NotificationTriggerContext();
  }

  public static io.nitric.proto.faas.v1.NotificationTriggerContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationTriggerContext>
      PARSER = new com.google.protobuf.AbstractParser<NotificationTriggerContext>() {
    @java.lang.Override
    public NotificationTriggerContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotificationTriggerContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationTriggerContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.NotificationTriggerContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

