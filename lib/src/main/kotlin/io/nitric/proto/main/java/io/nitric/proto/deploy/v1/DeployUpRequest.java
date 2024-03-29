// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

/**
 * Protobuf type {@code nitric.deploy.v1.DeployUpRequest}
 */
public final class DeployUpRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.deploy.v1.DeployUpRequest)
    DeployUpRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeployUpRequest.newBuilder() to construct.
  private DeployUpRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeployUpRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeployUpRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_DeployUpRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_DeployUpRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.deploy.v1.DeployUpRequest.class, io.nitric.proto.deploy.v1.DeployUpRequest.Builder.class);
  }

  public static final int SPEC_FIELD_NUMBER = 1;
  private io.nitric.proto.deploy.v1.Spec spec_;
  /**
   * <pre>
   * The spec to deploy
   * </pre>
   *
   * <code>.nitric.deploy.v1.Spec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return spec_ != null;
  }
  /**
   * <pre>
   * The spec to deploy
   * </pre>
   *
   * <code>.nitric.deploy.v1.Spec spec = 1;</code>
   * @return The spec.
   */
  @java.lang.Override
  public io.nitric.proto.deploy.v1.Spec getSpec() {
    return spec_ == null ? io.nitric.proto.deploy.v1.Spec.getDefaultInstance() : spec_;
  }
  /**
   * <pre>
   * The spec to deploy
   * </pre>
   *
   * <code>.nitric.deploy.v1.Spec spec = 1;</code>
   */
  @java.lang.Override
  public io.nitric.proto.deploy.v1.SpecOrBuilder getSpecOrBuilder() {
    return getSpec();
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct attributes_;
  /**
   * <pre>
   * A map of attributes related to the deploy request
   * this allows for adding project identifiers etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct attributes = 2;</code>
   * @return Whether the attributes field is set.
   */
  @java.lang.Override
  public boolean hasAttributes() {
    return attributes_ != null;
  }
  /**
   * <pre>
   * A map of attributes related to the deploy request
   * this allows for adding project identifiers etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct attributes = 2;</code>
   * @return The attributes.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getAttributes() {
    return attributes_ == null ? com.google.protobuf.Struct.getDefaultInstance() : attributes_;
  }
  /**
   * <pre>
   * A map of attributes related to the deploy request
   * this allows for adding project identifiers etc.
   * </pre>
   *
   * <code>.google.protobuf.Struct attributes = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getAttributesOrBuilder() {
    return getAttributes();
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
    if (spec_ != null) {
      output.writeMessage(1, getSpec());
    }
    if (attributes_ != null) {
      output.writeMessage(2, getAttributes());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (spec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSpec());
    }
    if (attributes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAttributes());
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
    if (!(obj instanceof io.nitric.proto.deploy.v1.DeployUpRequest)) {
      return super.equals(obj);
    }
    io.nitric.proto.deploy.v1.DeployUpRequest other = (io.nitric.proto.deploy.v1.DeployUpRequest) obj;

    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec()
          .equals(other.getSpec())) return false;
    }
    if (hasAttributes() != other.hasAttributes()) return false;
    if (hasAttributes()) {
      if (!getAttributes()
          .equals(other.getAttributes())) return false;
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
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    if (hasAttributes()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributes().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.DeployUpRequest parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.deploy.v1.DeployUpRequest prototype) {
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
   * Protobuf type {@code nitric.deploy.v1.DeployUpRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.deploy.v1.DeployUpRequest)
      io.nitric.proto.deploy.v1.DeployUpRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_DeployUpRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_DeployUpRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.deploy.v1.DeployUpRequest.class, io.nitric.proto.deploy.v1.DeployUpRequest.Builder.class);
    }

    // Construct using io.nitric.proto.deploy.v1.DeployUpRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (specBuilder_ == null) {
        spec_ = null;
      } else {
        spec_ = null;
        specBuilder_ = null;
      }
      if (attributesBuilder_ == null) {
        attributes_ = null;
      } else {
        attributes_ = null;
        attributesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_DeployUpRequest_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.DeployUpRequest getDefaultInstanceForType() {
      return io.nitric.proto.deploy.v1.DeployUpRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.DeployUpRequest build() {
      io.nitric.proto.deploy.v1.DeployUpRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.DeployUpRequest buildPartial() {
      io.nitric.proto.deploy.v1.DeployUpRequest result = new io.nitric.proto.deploy.v1.DeployUpRequest(this);
      if (specBuilder_ == null) {
        result.spec_ = spec_;
      } else {
        result.spec_ = specBuilder_.build();
      }
      if (attributesBuilder_ == null) {
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
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
      if (other instanceof io.nitric.proto.deploy.v1.DeployUpRequest) {
        return mergeFrom((io.nitric.proto.deploy.v1.DeployUpRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.deploy.v1.DeployUpRequest other) {
      if (other == io.nitric.proto.deploy.v1.DeployUpRequest.getDefaultInstance()) return this;
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
      }
      if (other.hasAttributes()) {
        mergeAttributes(other.getAttributes());
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
                  getSpecFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAttributesFieldBuilder().getBuilder(),
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

    private io.nitric.proto.deploy.v1.Spec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.deploy.v1.Spec, io.nitric.proto.deploy.v1.Spec.Builder, io.nitric.proto.deploy.v1.SpecOrBuilder> specBuilder_;
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return specBuilder_ != null || spec_ != null;
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     * @return The spec.
     */
    public io.nitric.proto.deploy.v1.Spec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null ? io.nitric.proto.deploy.v1.Spec.getDefaultInstance() : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public Builder setSpec(io.nitric.proto.deploy.v1.Spec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        specBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public Builder setSpec(
        io.nitric.proto.deploy.v1.Spec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public Builder mergeSpec(io.nitric.proto.deploy.v1.Spec value) {
      if (specBuilder_ == null) {
        if (spec_ != null) {
          spec_ =
            io.nitric.proto.deploy.v1.Spec.newBuilder(spec_).mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        specBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public Builder clearSpec() {
      if (specBuilder_ == null) {
        spec_ = null;
        onChanged();
      } else {
        spec_ = null;
        specBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public io.nitric.proto.deploy.v1.Spec.Builder getSpecBuilder() {
      
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    public io.nitric.proto.deploy.v1.SpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null ?
            io.nitric.proto.deploy.v1.Spec.getDefaultInstance() : spec_;
      }
    }
    /**
     * <pre>
     * The spec to deploy
     * </pre>
     *
     * <code>.nitric.deploy.v1.Spec spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.deploy.v1.Spec, io.nitric.proto.deploy.v1.Spec.Builder, io.nitric.proto.deploy.v1.SpecOrBuilder> 
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.deploy.v1.Spec, io.nitric.proto.deploy.v1.Spec.Builder, io.nitric.proto.deploy.v1.SpecOrBuilder>(
                getSpec(),
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      return specBuilder_;
    }

    private com.google.protobuf.Struct attributes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> attributesBuilder_;
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     * @return Whether the attributes field is set.
     */
    public boolean hasAttributes() {
      return attributesBuilder_ != null || attributes_ != null;
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     * @return The attributes.
     */
    public com.google.protobuf.Struct getAttributes() {
      if (attributesBuilder_ == null) {
        return attributes_ == null ? com.google.protobuf.Struct.getDefaultInstance() : attributes_;
      } else {
        return attributesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public Builder setAttributes(com.google.protobuf.Struct value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attributes_ = value;
        onChanged();
      } else {
        attributesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public Builder setAttributes(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        attributes_ = builderForValue.build();
        onChanged();
      } else {
        attributesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public Builder mergeAttributes(com.google.protobuf.Struct value) {
      if (attributesBuilder_ == null) {
        if (attributes_ != null) {
          attributes_ =
            com.google.protobuf.Struct.newBuilder(attributes_).mergeFrom(value).buildPartial();
        } else {
          attributes_ = value;
        }
        onChanged();
      } else {
        attributesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = null;
        onChanged();
      } else {
        attributes_ = null;
        attributesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getAttributesBuilder() {
      
      onChanged();
      return getAttributesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getAttributesOrBuilder() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilder();
      } else {
        return attributes_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : attributes_;
      }
    }
    /**
     * <pre>
     * A map of attributes related to the deploy request
     * this allows for adding project identifiers etc.
     * </pre>
     *
     * <code>.google.protobuf.Struct attributes = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getAttributes(),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.deploy.v1.DeployUpRequest)
  }

  // @@protoc_insertion_point(class_scope:nitric.deploy.v1.DeployUpRequest)
  private static final io.nitric.proto.deploy.v1.DeployUpRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.deploy.v1.DeployUpRequest();
  }

  public static io.nitric.proto.deploy.v1.DeployUpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployUpRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeployUpRequest>() {
    @java.lang.Override
    public DeployUpRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployUpRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployUpRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.deploy.v1.DeployUpRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

