// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * Protobuf type {@code nitric.faas.v1.ApiWorker}
 */
public final class ApiWorker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.ApiWorker)
    ApiWorkerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiWorker.newBuilder() to construct.
  private ApiWorker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiWorker() {
    api_ = "";
    path_ = "";
    methods_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiWorker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.ApiWorker.class, io.nitric.proto.faas.v1.ApiWorker.Builder.class);
  }

  public static final int API_FIELD_NUMBER = 1;
  private volatile java.lang.Object api_;
  /**
   * <code>string api = 1;</code>
   * @return The api.
   */
  @java.lang.Override
  public java.lang.String getApi() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      api_ = s;
      return s;
    }
  }
  /**
   * <code>string api = 1;</code>
   * @return The bytes for api.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApiBytes() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      api_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 2;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHODS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList methods_;
  /**
   * <code>repeated string methods = 3;</code>
   * @return A list containing the methods.
   */
  public com.google.protobuf.ProtocolStringList
      getMethodsList() {
    return methods_;
  }
  /**
   * <code>repeated string methods = 3;</code>
   * @return The count of methods.
   */
  public int getMethodsCount() {
    return methods_.size();
  }
  /**
   * <code>repeated string methods = 3;</code>
   * @param index The index of the element to return.
   * @return The methods at the given index.
   */
  public java.lang.String getMethods(int index) {
    return methods_.get(index);
  }
  /**
   * <code>repeated string methods = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the methods at the given index.
   */
  public com.google.protobuf.ByteString
      getMethodsBytes(int index) {
    return methods_.getByteString(index);
  }

  public static final int OPTIONS_FIELD_NUMBER = 4;
  private io.nitric.proto.faas.v1.ApiWorkerOptions options_;
  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   * @return Whether the options field is set.
   */
  @java.lang.Override
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   * @return The options.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ApiWorkerOptions getOptions() {
    return options_ == null ? io.nitric.proto.faas.v1.ApiWorkerOptions.getDefaultInstance() : options_;
  }
  /**
   * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder getOptionsOrBuilder() {
    return getOptions();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(api_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, api_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    for (int i = 0; i < methods_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, methods_.getRaw(i));
    }
    if (options_ != null) {
      output.writeMessage(4, getOptions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(api_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, api_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < methods_.size(); i++) {
        dataSize += computeStringSizeNoTag(methods_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMethodsList().size();
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getOptions());
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
    if (!(obj instanceof io.nitric.proto.faas.v1.ApiWorker)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.ApiWorker other = (io.nitric.proto.faas.v1.ApiWorker) obj;

    if (!getApi()
        .equals(other.getApi())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getMethodsList()
        .equals(other.getMethodsList())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions()
          .equals(other.getOptions())) return false;
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
    hash = (37 * hash) + API_FIELD_NUMBER;
    hash = (53 * hash) + getApi().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (getMethodsCount() > 0) {
      hash = (37 * hash) + METHODS_FIELD_NUMBER;
      hash = (53 * hash) + getMethodsList().hashCode();
    }
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ApiWorker parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.ApiWorker prototype) {
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
   * Protobuf type {@code nitric.faas.v1.ApiWorker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.ApiWorker)
      io.nitric.proto.faas.v1.ApiWorkerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.ApiWorker.class, io.nitric.proto.faas.v1.ApiWorker.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.ApiWorker.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      api_ = "";

      path_ = "";

      methods_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ApiWorker_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorker getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.ApiWorker.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorker build() {
      io.nitric.proto.faas.v1.ApiWorker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ApiWorker buildPartial() {
      io.nitric.proto.faas.v1.ApiWorker result = new io.nitric.proto.faas.v1.ApiWorker(this);
      int from_bitField0_ = bitField0_;
      result.api_ = api_;
      result.path_ = path_;
      if (((bitField0_ & 0x00000001) != 0)) {
        methods_ = methods_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.methods_ = methods_;
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
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
      if (other instanceof io.nitric.proto.faas.v1.ApiWorker) {
        return mergeFrom((io.nitric.proto.faas.v1.ApiWorker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.ApiWorker other) {
      if (other == io.nitric.proto.faas.v1.ApiWorker.getDefaultInstance()) return this;
      if (!other.getApi().isEmpty()) {
        api_ = other.api_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.methods_.isEmpty()) {
        if (methods_.isEmpty()) {
          methods_ = other.methods_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMethodsIsMutable();
          methods_.addAll(other.methods_);
        }
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
              api_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              path_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureMethodsIsMutable();
              methods_.add(s);
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getOptionsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 34
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

    private java.lang.Object api_ = "";
    /**
     * <code>string api = 1;</code>
     * @return The api.
     */
    public java.lang.String getApi() {
      java.lang.Object ref = api_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        api_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string api = 1;</code>
     * @return The bytes for api.
     */
    public com.google.protobuf.ByteString
        getApiBytes() {
      java.lang.Object ref = api_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        api_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string api = 1;</code>
     * @param value The api to set.
     * @return This builder for chaining.
     */
    public Builder setApi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      api_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string api = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApi() {
      
      api_ = getDefaultInstance().getApi();
      onChanged();
      return this;
    }
    /**
     * <code>string api = 1;</code>
     * @param value The bytes for api to set.
     * @return This builder for chaining.
     */
    public Builder setApiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      api_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 2;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 2;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 2;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList methods_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMethodsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        methods_ = new com.google.protobuf.LazyStringArrayList(methods_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @return A list containing the methods.
     */
    public com.google.protobuf.ProtocolStringList
        getMethodsList() {
      return methods_.getUnmodifiableView();
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @return The count of methods.
     */
    public int getMethodsCount() {
      return methods_.size();
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param index The index of the element to return.
     * @return The methods at the given index.
     */
    public java.lang.String getMethods(int index) {
      return methods_.get(index);
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the methods at the given index.
     */
    public com.google.protobuf.ByteString
        getMethodsBytes(int index) {
      return methods_.getByteString(index);
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param index The index to set the value at.
     * @param value The methods to set.
     * @return This builder for chaining.
     */
    public Builder setMethods(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMethodsIsMutable();
      methods_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param value The methods to add.
     * @return This builder for chaining.
     */
    public Builder addMethods(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMethodsIsMutable();
      methods_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param values The methods to add.
     * @return This builder for chaining.
     */
    public Builder addAllMethods(
        java.lang.Iterable<java.lang.String> values) {
      ensureMethodsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, methods_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethods() {
      methods_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string methods = 3;</code>
     * @param value The bytes of the methods to add.
     * @return This builder for chaining.
     */
    public Builder addMethodsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMethodsIsMutable();
      methods_.add(value);
      onChanged();
      return this;
    }

    private io.nitric.proto.faas.v1.ApiWorkerOptions options_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ApiWorkerOptions, io.nitric.proto.faas.v1.ApiWorkerOptions.Builder, io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder> optionsBuilder_;
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     * @return The options.
     */
    public io.nitric.proto.faas.v1.ApiWorkerOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? io.nitric.proto.faas.v1.ApiWorkerOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public Builder setOptions(io.nitric.proto.faas.v1.ApiWorkerOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public Builder setOptions(
        io.nitric.proto.faas.v1.ApiWorkerOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public Builder mergeOptions(io.nitric.proto.faas.v1.ApiWorkerOptions value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
            io.nitric.proto.faas.v1.ApiWorkerOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public io.nitric.proto.faas.v1.ApiWorkerOptions.Builder getOptionsBuilder() {
      
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    public io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            io.nitric.proto.faas.v1.ApiWorkerOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <code>.nitric.faas.v1.ApiWorkerOptions options = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ApiWorkerOptions, io.nitric.proto.faas.v1.ApiWorkerOptions.Builder, io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.ApiWorkerOptions, io.nitric.proto.faas.v1.ApiWorkerOptions.Builder, io.nitric.proto.faas.v1.ApiWorkerOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.ApiWorker)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.ApiWorker)
  private static final io.nitric.proto.faas.v1.ApiWorker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.ApiWorker();
  }

  public static io.nitric.proto.faas.v1.ApiWorker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiWorker>
      PARSER = new com.google.protobuf.AbstractParser<ApiWorker>() {
    @java.lang.Override
    public ApiWorker parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiWorker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiWorker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.ApiWorker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

