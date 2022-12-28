// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

/**
 * <pre>
 * EnumRules describe the constraints applied to enum values
 * </pre>
 *
 * Protobuf type {@code validate.EnumRules}
 */
public final class EnumRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.EnumRules)
    EnumRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnumRules.newBuilder() to construct.
  private EnumRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnumRules() {
    in_ = emptyIntList();
    notIn_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnumRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.pgv.validate.Validate.internal_static_validate_EnumRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.pgv.validate.Validate.internal_static_validate_EnumRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.pgv.validate.EnumRules.class, io.envoyproxy.pgv.validate.EnumRules.Builder.class);
  }

  private int bitField0_;
  public static final int CONST_FIELD_NUMBER = 1;
  private int const_;
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1;</code>
   * @return Whether the const field is set.
   */
  @java.lang.Override
  public boolean hasConst() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1;</code>
   * @return The const.
   */
  @java.lang.Override
  public int getConst() {
    return const_;
  }

  public static final int DEFINED_ONLY_FIELD_NUMBER = 2;
  private boolean definedOnly_;
  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2;</code>
   * @return Whether the definedOnly field is set.
   */
  @java.lang.Override
  public boolean hasDefinedOnly() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2;</code>
   * @return The definedOnly.
   */
  @java.lang.Override
  public boolean getDefinedOnly() {
    return definedOnly_;
  }

  public static final int IN_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList in_;
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3;</code>
   * @return A list containing the in.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getInList() {
    return in_;
  }
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3;</code>
   * @return The count of in.
   */
  public int getInCount() {
    return in_.size();
  }
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3;</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  public int getIn(int index) {
    return in_.getInt(index);
  }

  public static final int NOT_IN_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList notIn_;
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4;</code>
   * @return A list containing the notIn.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getNotInList() {
    return notIn_;
  }
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4;</code>
   * @return The count of notIn.
   */
  public int getNotInCount() {
    return notIn_.size();
  }
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4;</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  public int getNotIn(int index) {
    return notIn_.getInt(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, const_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, definedOnly_);
    }
    for (int i = 0; i < in_.size(); i++) {
      output.writeInt32(3, in_.getInt(i));
    }
    for (int i = 0; i < notIn_.size(); i++) {
      output.writeInt32(4, notIn_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, const_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, definedOnly_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < in_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(in_.getInt(i));
      }
      size += dataSize;
      size += 1 * getInList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notIn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(notIn_.getInt(i));
      }
      size += dataSize;
      size += 1 * getNotInList().size();
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
    if (!(obj instanceof io.envoyproxy.pgv.validate.EnumRules)) {
      return super.equals(obj);
    }
    io.envoyproxy.pgv.validate.EnumRules other = (io.envoyproxy.pgv.validate.EnumRules) obj;

    if (hasConst() != other.hasConst()) return false;
    if (hasConst()) {
      if (getConst()
          != other.getConst()) return false;
    }
    if (hasDefinedOnly() != other.hasDefinedOnly()) return false;
    if (hasDefinedOnly()) {
      if (getDefinedOnly()
          != other.getDefinedOnly()) return false;
    }
    if (!getInList()
        .equals(other.getInList())) return false;
    if (!getNotInList()
        .equals(other.getNotInList())) return false;
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
    if (hasConst()) {
      hash = (37 * hash) + CONST_FIELD_NUMBER;
      hash = (53 * hash) + getConst();
    }
    if (hasDefinedOnly()) {
      hash = (37 * hash) + DEFINED_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDefinedOnly());
    }
    if (getInCount() > 0) {
      hash = (37 * hash) + IN_FIELD_NUMBER;
      hash = (53 * hash) + getInList().hashCode();
    }
    if (getNotInCount() > 0) {
      hash = (37 * hash) + NOT_IN_FIELD_NUMBER;
      hash = (53 * hash) + getNotInList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.pgv.validate.EnumRules parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.pgv.validate.EnumRules prototype) {
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
   * EnumRules describe the constraints applied to enum values
   * </pre>
   *
   * Protobuf type {@code validate.EnumRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.EnumRules)
      io.envoyproxy.pgv.validate.EnumRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.pgv.validate.Validate.internal_static_validate_EnumRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.pgv.validate.Validate.internal_static_validate_EnumRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.pgv.validate.EnumRules.class, io.envoyproxy.pgv.validate.EnumRules.Builder.class);
    }

    // Construct using io.envoyproxy.pgv.validate.EnumRules.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      const_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      definedOnly_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      in_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      notIn_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.pgv.validate.Validate.internal_static_validate_EnumRules_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.pgv.validate.EnumRules getDefaultInstanceForType() {
      return io.envoyproxy.pgv.validate.EnumRules.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.pgv.validate.EnumRules build() {
      io.envoyproxy.pgv.validate.EnumRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.pgv.validate.EnumRules buildPartial() {
      io.envoyproxy.pgv.validate.EnumRules result = new io.envoyproxy.pgv.validate.EnumRules(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.definedOnly_ = definedOnly_;
        to_bitField0_ |= 0x00000002;
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        in_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.in_ = in_;
      if (((bitField0_ & 0x00000008) != 0)) {
        notIn_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.notIn_ = notIn_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.envoyproxy.pgv.validate.EnumRules) {
        return mergeFrom((io.envoyproxy.pgv.validate.EnumRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.pgv.validate.EnumRules other) {
      if (other == io.envoyproxy.pgv.validate.EnumRules.getDefaultInstance()) return this;
      if (other.hasConst()) {
        setConst(other.getConst());
      }
      if (other.hasDefinedOnly()) {
        setDefinedOnly(other.getDefinedOnly());
      }
      if (!other.in_.isEmpty()) {
        if (in_.isEmpty()) {
          in_ = other.in_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureInIsMutable();
          in_.addAll(other.in_);
        }
        onChanged();
      }
      if (!other.notIn_.isEmpty()) {
        if (notIn_.isEmpty()) {
          notIn_ = other.notIn_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureNotInIsMutable();
          notIn_.addAll(other.notIn_);
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
            case 8: {
              const_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              definedOnly_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              int v = input.readInt32();
              ensureInIsMutable();
              in_.addInt(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureInIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                in_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 26
            case 32: {
              int v = input.readInt32();
              ensureNotInIsMutable();
              notIn_.addInt(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureNotInIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                notIn_.addInt(input.readInt32());
              }
              input.popLimit(limit);
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

    private int const_ ;
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1;</code>
     * @return Whether the const field is set.
     */
    @java.lang.Override
    public boolean hasConst() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1;</code>
     * @return The const.
     */
    @java.lang.Override
    public int getConst() {
      return const_;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1;</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(int value) {
      bitField0_ |= 0x00000001;
      const_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      const_ = 0;
      onChanged();
      return this;
    }

    private boolean definedOnly_ ;
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2;</code>
     * @return Whether the definedOnly field is set.
     */
    @java.lang.Override
    public boolean hasDefinedOnly() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2;</code>
     * @return The definedOnly.
     */
    @java.lang.Override
    public boolean getDefinedOnly() {
      return definedOnly_;
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2;</code>
     * @param value The definedOnly to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedOnly(boolean value) {
      bitField0_ |= 0x00000002;
      definedOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinedOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      definedOnly_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList in_ = emptyIntList();
    private void ensureInIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        in_ = mutableCopy(in_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @return A list containing the in.
     */
    public java.util.List<java.lang.Integer>
        getInList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(in_) : in_;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @return The count of in.
     */
    public int getInCount() {
      return in_.size();
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @param index The index of the element to return.
     * @return The in at the given index.
     */
    public int getIn(int index) {
      return in_.getInt(index);
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @param index The index to set the value at.
     * @param value The in to set.
     * @return This builder for chaining.
     */
    public Builder setIn(
        int index, int value) {
      ensureInIsMutable();
      in_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @param value The in to add.
     * @return This builder for chaining.
     */
    public Builder addIn(int value) {
      ensureInIsMutable();
      in_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @param values The in to add.
     * @return This builder for chaining.
     */
    public Builder addAllIn(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, in_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIn() {
      in_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList notIn_ = emptyIntList();
    private void ensureNotInIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        notIn_ = mutableCopy(notIn_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @return A list containing the notIn.
     */
    public java.util.List<java.lang.Integer>
        getNotInList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(notIn_) : notIn_;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @return The count of notIn.
     */
    public int getNotInCount() {
      return notIn_.size();
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @param index The index of the element to return.
     * @return The notIn at the given index.
     */
    public int getNotIn(int index) {
      return notIn_.getInt(index);
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @param index The index to set the value at.
     * @param value The notIn to set.
     * @return This builder for chaining.
     */
    public Builder setNotIn(
        int index, int value) {
      ensureNotInIsMutable();
      notIn_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @param value The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addNotIn(int value) {
      ensureNotInIsMutable();
      notIn_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @param values The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotIn(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNotInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notIn_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotIn() {
      notIn_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:validate.EnumRules)
  }

  // @@protoc_insertion_point(class_scope:validate.EnumRules)
  private static final io.envoyproxy.pgv.validate.EnumRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.pgv.validate.EnumRules();
  }

  public static io.envoyproxy.pgv.validate.EnumRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EnumRules>
      PARSER = new com.google.protobuf.AbstractParser<EnumRules>() {
    @java.lang.Override
    public EnumRules parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnumRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnumRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.pgv.validate.EnumRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

