// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

/**
 * Protobuf type {@code nitric.document.v1.ExpressionValue}
 */
public final class ExpressionValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.document.v1.ExpressionValue)
    ExpressionValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpressionValue.newBuilder() to construct.
  private ExpressionValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpressionValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpressionValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_ExpressionValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_ExpressionValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.document.v1.ExpressionValue.class, io.nitric.proto.document.v1.ExpressionValue.Builder.class);
  }

  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT_VALUE(1),
    DOUBLE_VALUE(2),
    STRING_VALUE(3),
    BOOL_VALUE(4),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return INT_VALUE;
        case 2: return DOUBLE_VALUE;
        case 3: return STRING_VALUE;
        case 4: return BOOL_VALUE;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  public static final int INT_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Represents an integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return kindCase_ == 1;
  }
  /**
   * <pre>
   * Represents an integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   * @return The intValue.
   */
  @java.lang.Override
  public long getIntValue() {
    if (kindCase_ == 1) {
      return (java.lang.Long) kind_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return kindCase_ == 2;
  }
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (kindCase_ == 2) {
      return (java.lang.Double) kind_;
    }
    return 0D;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return kindCase_ == 3;
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (kindCase_ == 3) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (kindCase_ == 3) {
        kind_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (kindCase_ == 3) {
      ref = kind_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (kindCase_ == 3) {
        kind_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   * @return Whether the boolValue field is set.
   */
  @java.lang.Override
  public boolean hasBoolValue() {
    return kindCase_ == 4;
  }
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   * @return The boolValue.
   */
  @java.lang.Override
  public boolean getBoolValue() {
    if (kindCase_ == 4) {
      return (java.lang.Boolean) kind_;
    }
    return false;
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
    if (kindCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) kind_));
    }
    if (kindCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, kind_);
    }
    if (kindCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) kind_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) kind_));
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, kind_);
    }
    if (kindCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) kind_));
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
    if (!(obj instanceof io.nitric.proto.document.v1.ExpressionValue)) {
      return super.equals(obj);
    }
    io.nitric.proto.document.v1.ExpressionValue other = (io.nitric.proto.document.v1.ExpressionValue) obj;

    if (!getKindCase().equals(other.getKindCase())) return false;
    switch (kindCase_) {
      case 1:
        if (getIntValue()
            != other.getIntValue()) return false;
        break;
      case 2:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleValue())) return false;
        break;
      case 3:
        if (!getStringValue()
            .equals(other.getStringValue())) return false;
        break;
      case 4:
        if (getBoolValue()
            != other.getBoolValue()) return false;
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
    switch (kindCase_) {
      case 1:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getIntValue());
        break;
      case 2:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 3:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 4:
        hash = (37 * hash) + BOOL_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBoolValue());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.document.v1.ExpressionValue parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.document.v1.ExpressionValue prototype) {
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
   * Protobuf type {@code nitric.document.v1.ExpressionValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.document.v1.ExpressionValue)
      io.nitric.proto.document.v1.ExpressionValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_ExpressionValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_ExpressionValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.document.v1.ExpressionValue.class, io.nitric.proto.document.v1.ExpressionValue.Builder.class);
    }

    // Construct using io.nitric.proto.document.v1.ExpressionValue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      kindCase_ = 0;
      kind_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.document.v1.Documents.internal_static_nitric_document_v1_ExpressionValue_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.ExpressionValue getDefaultInstanceForType() {
      return io.nitric.proto.document.v1.ExpressionValue.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.ExpressionValue build() {
      io.nitric.proto.document.v1.ExpressionValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.document.v1.ExpressionValue buildPartial() {
      io.nitric.proto.document.v1.ExpressionValue result = new io.nitric.proto.document.v1.ExpressionValue(this);
      if (kindCase_ == 1) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 2) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 3) {
        result.kind_ = kind_;
      }
      if (kindCase_ == 4) {
        result.kind_ = kind_;
      }
      result.kindCase_ = kindCase_;
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
      if (other instanceof io.nitric.proto.document.v1.ExpressionValue) {
        return mergeFrom((io.nitric.proto.document.v1.ExpressionValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.document.v1.ExpressionValue other) {
      if (other == io.nitric.proto.document.v1.ExpressionValue.getDefaultInstance()) return this;
      switch (other.getKindCase()) {
        case INT_VALUE: {
          setIntValue(other.getIntValue());
          break;
        }
        case DOUBLE_VALUE: {
          setDoubleValue(other.getDoubleValue());
          break;
        }
        case STRING_VALUE: {
          kindCase_ = 3;
          kind_ = other.kind_;
          onChanged();
          break;
        }
        case BOOL_VALUE: {
          setBoolValue(other.getBoolValue());
          break;
        }
        case KIND_NOT_SET: {
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
            case 8: {
              kind_ = input.readInt64();
              kindCase_ = 1;
              break;
            } // case 8
            case 17: {
              kind_ = input.readDouble();
              kindCase_ = 2;
              break;
            } // case 17
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              kindCase_ = 3;
              kind_ = s;
              break;
            } // case 26
            case 32: {
              kind_ = input.readBool();
              kindCase_ = 4;
              break;
            } // case 32
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
    private int kindCase_ = 0;
    private java.lang.Object kind_;
    public KindCase
        getKindCase() {
      return KindCase.forNumber(
          kindCase_);
    }

    public Builder clearKind() {
      kindCase_ = 0;
      kind_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return kindCase_ == 1;
    }
    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return The intValue.
     */
    public long getIntValue() {
      if (kindCase_ == 1) {
        return (java.lang.Long) kind_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(long value) {
      kindCase_ = 1;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (kindCase_ == 1) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return kindCase_ == 2;
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (kindCase_ == 2) {
        return (java.lang.Double) kind_;
      }
      return 0D;
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      kindCase_ = 2;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (kindCase_ == 2) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return kindCase_ == 3;
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (kindCase_ == 3) {
        ref = kind_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (kindCase_ == 3) {
          kind_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (kindCase_ == 3) {
        ref = kind_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (kindCase_ == 3) {
          kind_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (kindCase_ == 3) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      kindCase_ = 3;
      kind_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     * @return Whether the boolValue field is set.
     */
    public boolean hasBoolValue() {
      return kindCase_ == 4;
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     * @return The boolValue.
     */
    public boolean getBoolValue() {
      if (kindCase_ == 4) {
        return (java.lang.Boolean) kind_;
      }
      return false;
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     * @param value The boolValue to set.
     * @return This builder for chaining.
     */
    public Builder setBoolValue(boolean value) {
      kindCase_ = 4;
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoolValue() {
      if (kindCase_ == 4) {
        kindCase_ = 0;
        kind_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:nitric.document.v1.ExpressionValue)
  }

  // @@protoc_insertion_point(class_scope:nitric.document.v1.ExpressionValue)
  private static final io.nitric.proto.document.v1.ExpressionValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.document.v1.ExpressionValue();
  }

  public static io.nitric.proto.document.v1.ExpressionValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpressionValue>
      PARSER = new com.google.protobuf.AbstractParser<ExpressionValue>() {
    @java.lang.Override
    public ExpressionValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpressionValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpressionValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.document.v1.ExpressionValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

