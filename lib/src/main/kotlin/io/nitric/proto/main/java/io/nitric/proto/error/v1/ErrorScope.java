// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/error/v1/error.proto

package io.nitric.proto.error.v1;

/**
 * Protobuf type {@code nitric.error.v1.ErrorScope}
 */
public final class ErrorScope extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.error.v1.ErrorScope)
    ErrorScopeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorScope.newBuilder() to construct.
  private ErrorScope(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorScope() {
    service_ = "";
    plugin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErrorScope();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetArgs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.error.v1.ErrorScope.class, io.nitric.proto.error.v1.ErrorScope.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object service_;
  /**
   * <pre>
   * The API service invoked, e.g. 'Service.Method'.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The API service invoked, e.g. 'Service.Method'.
   * </pre>
   *
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLUGIN_FIELD_NUMBER = 2;
  private volatile java.lang.Object plugin_;
  /**
   * <pre>
   * The plugin method invoked, e.g. 'PluginService.Method'.
   * </pre>
   *
   * <code>string plugin = 2;</code>
   * @return The plugin.
   */
  @java.lang.Override
  public java.lang.String getPlugin() {
    java.lang.Object ref = plugin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plugin_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The plugin method invoked, e.g. 'PluginService.Method'.
   * </pre>
   *
   * <code>string plugin = 2;</code>
   * @return The bytes for plugin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPluginBytes() {
    java.lang.Object ref = plugin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plugin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGS_FIELD_NUMBER = 3;
  private static final class ArgsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_ArgsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> args_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetArgs() {
    if (args_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ArgsDefaultEntryHolder.defaultEntry);
    }
    return args_;
  }

  public int getArgsCount() {
    return internalGetArgs().getMap().size();
  }
  /**
   * <pre>
   * The plugin method arguments, ensure only non-sensitive data is specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 3;</code>
   */

  @java.lang.Override
  public boolean containsArgs(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetArgs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getArgsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getArgs() {
    return getArgsMap();
  }
  /**
   * <pre>
   * The plugin method arguments, ensure only non-sensitive data is specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 3;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getArgsMap() {
    return internalGetArgs().getMap();
  }
  /**
   * <pre>
   * The plugin method arguments, ensure only non-sensitive data is specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 3;</code>
   */
  @java.lang.Override

  public java.lang.String getArgsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetArgs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * The plugin method arguments, ensure only non-sensitive data is specified.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 3;</code>
   */
  @java.lang.Override

  public java.lang.String getArgsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetArgs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plugin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, plugin_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetArgs(),
        ArgsDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plugin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, plugin_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetArgs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      args__ = ArgsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, args__);
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
    if (!(obj instanceof io.nitric.proto.error.v1.ErrorScope)) {
      return super.equals(obj);
    }
    io.nitric.proto.error.v1.ErrorScope other = (io.nitric.proto.error.v1.ErrorScope) obj;

    if (!getService()
        .equals(other.getService())) return false;
    if (!getPlugin()
        .equals(other.getPlugin())) return false;
    if (!internalGetArgs().equals(
        other.internalGetArgs())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + PLUGIN_FIELD_NUMBER;
    hash = (53 * hash) + getPlugin().hashCode();
    if (!internalGetArgs().getMap().isEmpty()) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetArgs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.error.v1.ErrorScope parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.error.v1.ErrorScope prototype) {
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
   * Protobuf type {@code nitric.error.v1.ErrorScope}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.error.v1.ErrorScope)
      io.nitric.proto.error.v1.ErrorScopeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.error.v1.ErrorScope.class, io.nitric.proto.error.v1.ErrorScope.Builder.class);
    }

    // Construct using io.nitric.proto.error.v1.ErrorScope.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      service_ = "";

      plugin_ = "";

      internalGetMutableArgs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.error.v1.Errors.internal_static_nitric_error_v1_ErrorScope_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorScope getDefaultInstanceForType() {
      return io.nitric.proto.error.v1.ErrorScope.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorScope build() {
      io.nitric.proto.error.v1.ErrorScope result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.error.v1.ErrorScope buildPartial() {
      io.nitric.proto.error.v1.ErrorScope result = new io.nitric.proto.error.v1.ErrorScope(this);
      int from_bitField0_ = bitField0_;
      result.service_ = service_;
      result.plugin_ = plugin_;
      result.args_ = internalGetArgs();
      result.args_.makeImmutable();
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
      if (other instanceof io.nitric.proto.error.v1.ErrorScope) {
        return mergeFrom((io.nitric.proto.error.v1.ErrorScope)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.error.v1.ErrorScope other) {
      if (other == io.nitric.proto.error.v1.ErrorScope.getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getPlugin().isEmpty()) {
        plugin_ = other.plugin_;
        onChanged();
      }
      internalGetMutableArgs().mergeFrom(
          other.internalGetArgs());
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
              service_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              plugin_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              args__ = input.readMessage(
                  ArgsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableArgs().getMutableMap().put(
                  args__.getKey(), args__.getValue());
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
    private int bitField0_;

    private java.lang.Object service_ = "";
    /**
     * <pre>
     * The API service invoked, e.g. 'Service.Method'.
     * </pre>
     *
     * <code>string service = 1;</code>
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The API service invoked, e.g. 'Service.Method'.
     * </pre>
     *
     * <code>string service = 1;</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The API service invoked, e.g. 'Service.Method'.
     * </pre>
     *
     * <code>string service = 1;</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API service invoked, e.g. 'Service.Method'.
     * </pre>
     *
     * <code>string service = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {
      
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The API service invoked, e.g. 'Service.Method'.
     * </pre>
     *
     * <code>string service = 1;</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plugin_ = "";
    /**
     * <pre>
     * The plugin method invoked, e.g. 'PluginService.Method'.
     * </pre>
     *
     * <code>string plugin = 2;</code>
     * @return The plugin.
     */
    public java.lang.String getPlugin() {
      java.lang.Object ref = plugin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plugin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The plugin method invoked, e.g. 'PluginService.Method'.
     * </pre>
     *
     * <code>string plugin = 2;</code>
     * @return The bytes for plugin.
     */
    public com.google.protobuf.ByteString
        getPluginBytes() {
      java.lang.Object ref = plugin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plugin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The plugin method invoked, e.g. 'PluginService.Method'.
     * </pre>
     *
     * <code>string plugin = 2;</code>
     * @param value The plugin to set.
     * @return This builder for chaining.
     */
    public Builder setPlugin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plugin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The plugin method invoked, e.g. 'PluginService.Method'.
     * </pre>
     *
     * <code>string plugin = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlugin() {
      
      plugin_ = getDefaultInstance().getPlugin();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The plugin method invoked, e.g. 'PluginService.Method'.
     * </pre>
     *
     * <code>string plugin = 2;</code>
     * @param value The bytes for plugin to set.
     * @return This builder for chaining.
     */
    public Builder setPluginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plugin_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> args_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetArgs() {
      if (args_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      return args_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableArgs() {
      onChanged();;
      if (args_ == null) {
        args_ = com.google.protobuf.MapField.newMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      if (!args_.isMutable()) {
        args_ = args_.copy();
      }
      return args_;
    }

    public int getArgsCount() {
      return internalGetArgs().getMap().size();
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */

    @java.lang.Override
    public boolean containsArgs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetArgs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getArgsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getArgs() {
      return getArgsMap();
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getArgsMap() {
      return internalGetArgs().getMap();
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */
    @java.lang.Override

    public java.lang.String getArgsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetArgs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */
    @java.lang.Override

    public java.lang.String getArgsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetArgs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearArgs() {
      internalGetMutableArgs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */

    public Builder removeArgs(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableArgs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableArgs() {
      return internalGetMutableArgs().getMutableMap();
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */
    public Builder putArgs(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableArgs().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * The plugin method arguments, ensure only non-sensitive data is specified.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 3;</code>
     */

    public Builder putAllArgs(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableArgs().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:nitric.error.v1.ErrorScope)
  }

  // @@protoc_insertion_point(class_scope:nitric.error.v1.ErrorScope)
  private static final io.nitric.proto.error.v1.ErrorScope DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.error.v1.ErrorScope();
  }

  public static io.nitric.proto.error.v1.ErrorScope getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorScope>
      PARSER = new com.google.protobuf.AbstractParser<ErrorScope>() {
    @java.lang.Override
    public ErrorScope parsePartialFrom(
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

  public static com.google.protobuf.Parser<ErrorScope> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorScope> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.error.v1.ErrorScope getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

