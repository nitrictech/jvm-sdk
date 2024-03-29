// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * Protobuf type {@code nitric.resource.v1.ApiResource}
 */
public final class ApiResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.resource.v1.ApiResource)
    ApiResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiResource.newBuilder() to construct.
  private ApiResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiResource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiResource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetSecurityDefinitions();
      case 2:
        return internalGetSecurity();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.resource.v1.ApiResource.class, io.nitric.proto.resource.v1.ApiResource.Builder.class);
  }

  public static final int SECURITY_DEFINITIONS_FIELD_NUMBER = 1;
  private static final class SecurityDefinitionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>newDefaultInstance(
                io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_SecurityDefinitionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.nitric.proto.resource.v1.ApiSecurityDefinition.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> securityDefinitions_;
  private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
  internalGetSecurityDefinitions() {
    if (securityDefinitions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SecurityDefinitionsDefaultEntryHolder.defaultEntry);
    }
    return securityDefinitions_;
  }

  public int getSecurityDefinitionsCount() {
    return internalGetSecurityDefinitions().getMap().size();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */

  @java.lang.Override
  public boolean containsSecurityDefinitions(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetSecurityDefinitions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSecurityDefinitionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitions() {
    return getSecurityDefinitionsMap();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitionsMap() {
    return internalGetSecurityDefinitions().getMap();
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrDefault(
      java.lang.String key,
      io.nitric.proto.resource.v1.ApiSecurityDefinition defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
        internalGetSecurityDefinitions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Security definitions for the api
   * These may be used by registered routes and operations on the API
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
        internalGetSecurityDefinitions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SECURITY_FIELD_NUMBER = 2;
  private static final class SecurityDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.nitric.proto.resource.v1.ApiScopes> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>newDefaultInstance(
                io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_SecurityEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.nitric.proto.resource.v1.ApiScopes.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.nitric.proto.resource.v1.ApiScopes> security_;
  private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
  internalGetSecurity() {
    if (security_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SecurityDefaultEntryHolder.defaultEntry);
    }
    return security_;
  }

  public int getSecurityCount() {
    return internalGetSecurity().getMap().size();
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
   */

  @java.lang.Override
  public boolean containsSecurity(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetSecurity().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSecurityMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> getSecurity() {
    return getSecurityMap();
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> getSecurityMap() {
    return internalGetSecurity().getMap();
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiScopes getSecurityOrDefault(
      java.lang.String key,
      io.nitric.proto.resource.v1.ApiScopes defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> map =
        internalGetSecurity().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * root level security for this api
   * </pre>
   *
   * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
   */
  @java.lang.Override

  public io.nitric.proto.resource.v1.ApiScopes getSecurityOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> map =
        internalGetSecurity().getMap();
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSecurityDefinitions(),
        SecurityDefinitionsDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSecurity(),
        SecurityDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> entry
         : internalGetSecurityDefinitions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
      securityDefinitions__ = SecurityDefinitionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, securityDefinitions__);
    }
    for (java.util.Map.Entry<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> entry
         : internalGetSecurity().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
      security__ = SecurityDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, security__);
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
    if (!(obj instanceof io.nitric.proto.resource.v1.ApiResource)) {
      return super.equals(obj);
    }
    io.nitric.proto.resource.v1.ApiResource other = (io.nitric.proto.resource.v1.ApiResource) obj;

    if (!internalGetSecurityDefinitions().equals(
        other.internalGetSecurityDefinitions())) return false;
    if (!internalGetSecurity().equals(
        other.internalGetSecurity())) return false;
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
    if (!internalGetSecurityDefinitions().getMap().isEmpty()) {
      hash = (37 * hash) + SECURITY_DEFINITIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecurityDefinitions().hashCode();
    }
    if (!internalGetSecurity().getMap().isEmpty()) {
      hash = (37 * hash) + SECURITY_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecurity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiResource parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.resource.v1.ApiResource prototype) {
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
   * Protobuf type {@code nitric.resource.v1.ApiResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.resource.v1.ApiResource)
      io.nitric.proto.resource.v1.ApiResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSecurityDefinitions();
        case 2:
          return internalGetSecurity();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSecurityDefinitions();
        case 2:
          return internalGetMutableSecurity();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.resource.v1.ApiResource.class, io.nitric.proto.resource.v1.ApiResource.Builder.class);
    }

    // Construct using io.nitric.proto.resource.v1.ApiResource.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableSecurityDefinitions().clear();
      internalGetMutableSecurity().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiResource_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource getDefaultInstanceForType() {
      return io.nitric.proto.resource.v1.ApiResource.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource build() {
      io.nitric.proto.resource.v1.ApiResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiResource buildPartial() {
      io.nitric.proto.resource.v1.ApiResource result = new io.nitric.proto.resource.v1.ApiResource(this);
      int from_bitField0_ = bitField0_;
      result.securityDefinitions_ = internalGetSecurityDefinitions();
      result.securityDefinitions_.makeImmutable();
      result.security_ = internalGetSecurity();
      result.security_.makeImmutable();
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
      if (other instanceof io.nitric.proto.resource.v1.ApiResource) {
        return mergeFrom((io.nitric.proto.resource.v1.ApiResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.resource.v1.ApiResource other) {
      if (other == io.nitric.proto.resource.v1.ApiResource.getDefaultInstance()) return this;
      internalGetMutableSecurityDefinitions().mergeFrom(
          other.internalGetSecurityDefinitions());
      internalGetMutableSecurity().mergeFrom(
          other.internalGetSecurity());
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
              com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
              securityDefinitions__ = input.readMessage(
                  SecurityDefinitionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSecurityDefinitions().getMutableMap().put(
                  securityDefinitions__.getKey(), securityDefinitions__.getValue());
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
              security__ = input.readMessage(
                  SecurityDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSecurity().getMutableMap().put(
                  security__.getKey(), security__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> securityDefinitions_;
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    internalGetSecurityDefinitions() {
      if (securityDefinitions_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SecurityDefinitionsDefaultEntryHolder.defaultEntry);
      }
      return securityDefinitions_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    internalGetMutableSecurityDefinitions() {
      onChanged();;
      if (securityDefinitions_ == null) {
        securityDefinitions_ = com.google.protobuf.MapField.newMapField(
            SecurityDefinitionsDefaultEntryHolder.defaultEntry);
      }
      if (!securityDefinitions_.isMutable()) {
        securityDefinitions_ = securityDefinitions_.copy();
      }
      return securityDefinitions_;
    }

    public int getSecurityDefinitionsCount() {
      return internalGetSecurityDefinitions().getMap().size();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    @java.lang.Override
    public boolean containsSecurityDefinitions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetSecurityDefinitions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSecurityDefinitionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitions() {
      return getSecurityDefinitionsMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> getSecurityDefinitionsMap() {
      return internalGetSecurityDefinitions().getMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrDefault(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiSecurityDefinition defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
          internalGetSecurityDefinitions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiSecurityDefinition getSecurityDefinitionsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> map =
          internalGetSecurityDefinitions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSecurityDefinitions() {
      internalGetMutableSecurityDefinitions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    public Builder removeSecurityDefinitions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableSecurityDefinitions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition>
    getMutableSecurityDefinitions() {
      return internalGetMutableSecurityDefinitions().getMutableMap();
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */
    public Builder putSecurityDefinitions(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiSecurityDefinition value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableSecurityDefinitions().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Security definitions for the api
     * These may be used by registered routes and operations on the API
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiSecurityDefinition&gt; security_definitions = 1;</code>
     */

    public Builder putAllSecurityDefinitions(
        java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiSecurityDefinition> values) {
      internalGetMutableSecurityDefinitions().getMutableMap()
          .putAll(values);
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.nitric.proto.resource.v1.ApiScopes> security_;
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
    internalGetSecurity() {
      if (security_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SecurityDefaultEntryHolder.defaultEntry);
      }
      return security_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
    internalGetMutableSecurity() {
      onChanged();;
      if (security_ == null) {
        security_ = com.google.protobuf.MapField.newMapField(
            SecurityDefaultEntryHolder.defaultEntry);
      }
      if (!security_.isMutable()) {
        security_ = security_.copy();
      }
      return security_;
    }

    public int getSecurityCount() {
      return internalGetSecurity().getMap().size();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */

    @java.lang.Override
    public boolean containsSecurity(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetSecurity().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSecurityMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> getSecurity() {
      return getSecurityMap();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> getSecurityMap() {
      return internalGetSecurity().getMap();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiScopes getSecurityOrDefault(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiScopes defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> map =
          internalGetSecurity().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */
    @java.lang.Override

    public io.nitric.proto.resource.v1.ApiScopes getSecurityOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> map =
          internalGetSecurity().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSecurity() {
      internalGetMutableSecurity().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */

    public Builder removeSecurity(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableSecurity().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes>
    getMutableSecurity() {
      return internalGetMutableSecurity().getMutableMap();
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */
    public Builder putSecurity(
        java.lang.String key,
        io.nitric.proto.resource.v1.ApiScopes value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableSecurity().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * root level security for this api
     * </pre>
     *
     * <code>map&lt;string, .nitric.resource.v1.ApiScopes&gt; security = 2;</code>
     */

    public Builder putAllSecurity(
        java.util.Map<java.lang.String, io.nitric.proto.resource.v1.ApiScopes> values) {
      internalGetMutableSecurity().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:nitric.resource.v1.ApiResource)
  }

  // @@protoc_insertion_point(class_scope:nitric.resource.v1.ApiResource)
  private static final io.nitric.proto.resource.v1.ApiResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.resource.v1.ApiResource();
  }

  public static io.nitric.proto.resource.v1.ApiResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiResource>
      PARSER = new com.google.protobuf.AbstractParser<ApiResource>() {
    @java.lang.Override
    public ApiResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.resource.v1.ApiResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

