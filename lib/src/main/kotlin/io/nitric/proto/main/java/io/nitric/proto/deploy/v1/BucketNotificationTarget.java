// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

/**
 * Protobuf type {@code nitric.deploy.v1.BucketNotificationTarget}
 */
public final class BucketNotificationTarget extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.deploy.v1.BucketNotificationTarget)
    BucketNotificationTargetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BucketNotificationTarget.newBuilder() to construct.
  private BucketNotificationTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BucketNotificationTarget() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BucketNotificationTarget();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_BucketNotificationTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_BucketNotificationTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.deploy.v1.BucketNotificationTarget.class, io.nitric.proto.deploy.v1.BucketNotificationTarget.Builder.class);
  }

  private int targetCase_ = 0;
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXECUTION_UNIT(2),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 2: return EXECUTION_UNIT;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private io.nitric.proto.faas.v1.BucketNotificationConfig config_;
  /**
   * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
   * @return The config.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.BucketNotificationConfig getConfig() {
    return config_ == null ? io.nitric.proto.faas.v1.BucketNotificationConfig.getDefaultInstance() : config_;
  }
  /**
   * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.BucketNotificationConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int EXECUTION_UNIT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 2;</code>
   * @return Whether the executionUnit field is set.
   */
  public boolean hasExecutionUnit() {
    return targetCase_ == 2;
  }
  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 2;</code>
   * @return The executionUnit.
   */
  public java.lang.String getExecutionUnit() {
    java.lang.Object ref = "";
    if (targetCase_ == 2) {
      ref = target_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (targetCase_ == 2) {
        target_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 2;</code>
   * @return The bytes for executionUnit.
   */
  public com.google.protobuf.ByteString
      getExecutionUnitBytes() {
    java.lang.Object ref = "";
    if (targetCase_ == 2) {
      ref = target_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (targetCase_ == 2) {
        target_ = b;
      }
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (targetCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfig());
    }
    if (targetCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, target_);
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
    if (!(obj instanceof io.nitric.proto.deploy.v1.BucketNotificationTarget)) {
      return super.equals(obj);
    }
    io.nitric.proto.deploy.v1.BucketNotificationTarget other = (io.nitric.proto.deploy.v1.BucketNotificationTarget) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
    if (!getTargetCase().equals(other.getTargetCase())) return false;
    switch (targetCase_) {
      case 2:
        if (!getExecutionUnit()
            .equals(other.getExecutionUnit())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    switch (targetCase_) {
      case 2:
        hash = (37 * hash) + EXECUTION_UNIT_FIELD_NUMBER;
        hash = (53 * hash) + getExecutionUnit().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.BucketNotificationTarget parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.deploy.v1.BucketNotificationTarget prototype) {
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
   * Protobuf type {@code nitric.deploy.v1.BucketNotificationTarget}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.deploy.v1.BucketNotificationTarget)
      io.nitric.proto.deploy.v1.BucketNotificationTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_BucketNotificationTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_BucketNotificationTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.deploy.v1.BucketNotificationTarget.class, io.nitric.proto.deploy.v1.BucketNotificationTarget.Builder.class);
    }

    // Construct using io.nitric.proto.deploy.v1.BucketNotificationTarget.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      targetCase_ = 0;
      target_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_BucketNotificationTarget_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.BucketNotificationTarget getDefaultInstanceForType() {
      return io.nitric.proto.deploy.v1.BucketNotificationTarget.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.BucketNotificationTarget build() {
      io.nitric.proto.deploy.v1.BucketNotificationTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.BucketNotificationTarget buildPartial() {
      io.nitric.proto.deploy.v1.BucketNotificationTarget result = new io.nitric.proto.deploy.v1.BucketNotificationTarget(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      if (targetCase_ == 2) {
        result.target_ = target_;
      }
      result.targetCase_ = targetCase_;
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
      if (other instanceof io.nitric.proto.deploy.v1.BucketNotificationTarget) {
        return mergeFrom((io.nitric.proto.deploy.v1.BucketNotificationTarget)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.deploy.v1.BucketNotificationTarget other) {
      if (other == io.nitric.proto.deploy.v1.BucketNotificationTarget.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      switch (other.getTargetCase()) {
        case EXECUTION_UNIT: {
          targetCase_ = 2;
          target_ = other.target_;
          onChanged();
          break;
        }
        case TARGET_NOT_SET: {
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
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              targetCase_ = 2;
              target_ = s;
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
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }


    private io.nitric.proto.faas.v1.BucketNotificationConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.BucketNotificationConfig, io.nitric.proto.faas.v1.BucketNotificationConfig.Builder, io.nitric.proto.faas.v1.BucketNotificationConfigOrBuilder> configBuilder_;
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     * @return The config.
     */
    public io.nitric.proto.faas.v1.BucketNotificationConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? io.nitric.proto.faas.v1.BucketNotificationConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public Builder setConfig(io.nitric.proto.faas.v1.BucketNotificationConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public Builder setConfig(
        io.nitric.proto.faas.v1.BucketNotificationConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public Builder mergeConfig(io.nitric.proto.faas.v1.BucketNotificationConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            io.nitric.proto.faas.v1.BucketNotificationConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public io.nitric.proto.faas.v1.BucketNotificationConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    public io.nitric.proto.faas.v1.BucketNotificationConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            io.nitric.proto.faas.v1.BucketNotificationConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.BucketNotificationConfig, io.nitric.proto.faas.v1.BucketNotificationConfig.Builder, io.nitric.proto.faas.v1.BucketNotificationConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.BucketNotificationConfig, io.nitric.proto.faas.v1.BucketNotificationConfig.Builder, io.nitric.proto.faas.v1.BucketNotificationConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @return Whether the executionUnit field is set.
     */
    @java.lang.Override
    public boolean hasExecutionUnit() {
      return targetCase_ == 2;
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @return The executionUnit.
     */
    @java.lang.Override
    public java.lang.String getExecutionUnit() {
      java.lang.Object ref = "";
      if (targetCase_ == 2) {
        ref = target_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (targetCase_ == 2) {
          target_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @return The bytes for executionUnit.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExecutionUnitBytes() {
      java.lang.Object ref = "";
      if (targetCase_ == 2) {
        ref = target_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (targetCase_ == 2) {
          target_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @param value The executionUnit to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionUnit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  targetCase_ = 2;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExecutionUnit() {
      if (targetCase_ == 2) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @param value The bytes for executionUnit to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionUnitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      targetCase_ = 2;
      target_ = value;
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


    // @@protoc_insertion_point(builder_scope:nitric.deploy.v1.BucketNotificationTarget)
  }

  // @@protoc_insertion_point(class_scope:nitric.deploy.v1.BucketNotificationTarget)
  private static final io.nitric.proto.deploy.v1.BucketNotificationTarget DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.deploy.v1.BucketNotificationTarget();
  }

  public static io.nitric.proto.deploy.v1.BucketNotificationTarget getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BucketNotificationTarget>
      PARSER = new com.google.protobuf.AbstractParser<BucketNotificationTarget>() {
    @java.lang.Override
    public BucketNotificationTarget parsePartialFrom(
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

  public static com.google.protobuf.Parser<BucketNotificationTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BucketNotificationTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.deploy.v1.BucketNotificationTarget getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

