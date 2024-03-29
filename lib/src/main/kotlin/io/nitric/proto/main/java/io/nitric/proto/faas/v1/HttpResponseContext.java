// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * <pre>
 * Specific HttpResponse message
 * Note this does not have to be handled by the
 * User at all but they will have the option of control
 * If they choose...
 * </pre>
 *
 * Protobuf type {@code nitric.faas.v1.HttpResponseContext}
 */
public final class HttpResponseContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.HttpResponseContext)
    HttpResponseContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpResponseContext.newBuilder() to construct.
  private HttpResponseContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpResponseContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpResponseContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetHeadersOld();
      case 3:
        return internalGetHeaders();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.HttpResponseContext.class, io.nitric.proto.faas.v1.HttpResponseContext.Builder.class);
  }

  public static final int HEADERS_OLD_FIELD_NUMBER = 1;
  private static final class HeadersOldDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_HeadersOldEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> headersOld_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetHeadersOld() {
    if (headersOld_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HeadersOldDefaultEntryHolder.defaultEntry);
    }
    return headersOld_;
  }
  @java.lang.Deprecated 
  public int getHeadersOldCount() {
    return internalGetHeadersOld().getMap().size();
  }
  /**
   * <pre>
   * Old HTTP response headers (deprecated)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  @java.lang.Override
  public boolean containsHeadersOld(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHeadersOld().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHeadersOldMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getHeadersOld() {
    return getHeadersOldMap();
  }
  /**
   * <pre>
   * Old HTTP response headers (deprecated)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated 
  public java.util.Map<java.lang.String, java.lang.String> getHeadersOldMap() {
    return internalGetHeadersOld().getMap();
  }
  /**
   * <pre>
   * Old HTTP response headers (deprecated)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated 
  public java.lang.String getHeadersOldOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeadersOld().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Old HTTP response headers (deprecated)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated 
  public java.lang.String getHeadersOldOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeadersOld().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <pre>
   * The HTTP status of the request
   * </pre>
   *
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int HEADERS_FIELD_NUMBER = 3;
  private static final class HeadersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.nitric.proto.faas.v1.HeaderValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>newDefaultInstance(
                io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_HeadersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.nitric.proto.faas.v1.HeaderValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.nitric.proto.faas.v1.HeaderValue> headers_;
  private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
  internalGetHeaders() {
    if (headers_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HeadersDefaultEntryHolder.defaultEntry);
    }
    return headers_;
  }

  public int getHeadersCount() {
    return internalGetHeaders().getMap().size();
  }
  /**
   * <pre>
   * HTTP response headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
   */

  @java.lang.Override
  public boolean containsHeaders(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHeaders().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> getHeaders() {
    return getHeadersMap();
  }
  /**
   * <pre>
   * HTTP response headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> getHeadersMap() {
    return internalGetHeaders().getMap();
  }
  /**
   * <pre>
   * HTTP response headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
   */
  @java.lang.Override

  public io.nitric.proto.faas.v1.HeaderValue getHeadersOrDefault(
      java.lang.String key,
      io.nitric.proto.faas.v1.HeaderValue defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> map =
        internalGetHeaders().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * HTTP response headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
   */
  @java.lang.Override

  public io.nitric.proto.faas.v1.HeaderValue getHeadersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> map =
        internalGetHeaders().getMap();
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
        internalGetHeadersOld(),
        HeadersOldDefaultEntryHolder.defaultEntry,
        1);
    if (status_ != 0) {
      output.writeInt32(2, status_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetHeaders(),
        HeadersDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetHeadersOld().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      headersOld__ = HeadersOldDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, headersOld__);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, status_);
    }
    for (java.util.Map.Entry<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> entry
         : internalGetHeaders().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
      headers__ = HeadersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, headers__);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.HttpResponseContext)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.HttpResponseContext other = (io.nitric.proto.faas.v1.HttpResponseContext) obj;

    if (!internalGetHeadersOld().equals(
        other.internalGetHeadersOld())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (!internalGetHeaders().equals(
        other.internalGetHeaders())) return false;
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
    if (!internalGetHeadersOld().getMap().isEmpty()) {
      hash = (37 * hash) + HEADERS_OLD_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeadersOld().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    if (!internalGetHeaders().getMap().isEmpty()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeaders().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.HttpResponseContext parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.HttpResponseContext prototype) {
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
   * Specific HttpResponse message
   * Note this does not have to be handled by the
   * User at all but they will have the option of control
   * If they choose...
   * </pre>
   *
   * Protobuf type {@code nitric.faas.v1.HttpResponseContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.HttpResponseContext)
      io.nitric.proto.faas.v1.HttpResponseContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetHeadersOld();
        case 3:
          return internalGetHeaders();
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
          return internalGetMutableHeadersOld();
        case 3:
          return internalGetMutableHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.HttpResponseContext.class, io.nitric.proto.faas.v1.HttpResponseContext.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.HttpResponseContext.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableHeadersOld().clear();
      status_ = 0;

      internalGetMutableHeaders().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_HttpResponseContext_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.HttpResponseContext getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.HttpResponseContext build() {
      io.nitric.proto.faas.v1.HttpResponseContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.HttpResponseContext buildPartial() {
      io.nitric.proto.faas.v1.HttpResponseContext result = new io.nitric.proto.faas.v1.HttpResponseContext(this);
      int from_bitField0_ = bitField0_;
      result.headersOld_ = internalGetHeadersOld();
      result.headersOld_.makeImmutable();
      result.status_ = status_;
      result.headers_ = internalGetHeaders();
      result.headers_.makeImmutable();
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
      if (other instanceof io.nitric.proto.faas.v1.HttpResponseContext) {
        return mergeFrom((io.nitric.proto.faas.v1.HttpResponseContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.HttpResponseContext other) {
      if (other == io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance()) return this;
      internalGetMutableHeadersOld().mergeFrom(
          other.internalGetHeadersOld());
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      internalGetMutableHeaders().mergeFrom(
          other.internalGetHeaders());
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              headersOld__ = input.readMessage(
                  HeadersOldDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableHeadersOld().getMutableMap().put(
                  headersOld__.getKey(), headersOld__.getValue());
              break;
            } // case 10
            case 16: {
              status_ = input.readInt32();

              break;
            } // case 16
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
              headers__ = input.readMessage(
                  HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableHeaders().getMutableMap().put(
                  headers__.getKey(), headers__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> headersOld_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetHeadersOld() {
      if (headersOld_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeadersOldDefaultEntryHolder.defaultEntry);
      }
      return headersOld_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableHeadersOld() {
      onChanged();;
      if (headersOld_ == null) {
        headersOld_ = com.google.protobuf.MapField.newMapField(
            HeadersOldDefaultEntryHolder.defaultEntry);
      }
      if (!headersOld_.isMutable()) {
        headersOld_ = headersOld_.copy();
      }
      return headersOld_;
    }
    @java.lang.Deprecated 
    public int getHeadersOldCount() {
      return internalGetHeadersOld().getMap().size();
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated 
    @java.lang.Override
    public boolean containsHeadersOld(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHeadersOld().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeadersOldMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getHeadersOld() {
      return getHeadersOldMap();
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Override
    @java.lang.Deprecated 
    public java.util.Map<java.lang.String, java.lang.String> getHeadersOldMap() {
      return internalGetHeadersOld().getMap();
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Override
    @java.lang.Deprecated 
    public java.lang.String getHeadersOldOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeadersOld().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Override
    @java.lang.Deprecated 
    public java.lang.String getHeadersOldOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeadersOld().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    @java.lang.Deprecated 
    public Builder clearHeadersOld() {
      internalGetMutableHeadersOld().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated 
    public Builder removeHeadersOld(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHeadersOld().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableHeadersOld() {
      return internalGetMutableHeadersOld().getMutableMap();
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder putHeadersOld(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableHeadersOld().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Old HTTP response headers (deprecated)
     * TODO: Remove in 1.0
     * </pre>
     *
     * <code>map&lt;string, string&gt; headers_old = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated 
    public Builder putAllHeadersOld(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableHeadersOld().getMutableMap()
          .putAll(values);
      return this;
    }

    private int status_ ;
    /**
     * <pre>
     * The HTTP status of the request
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <pre>
     * The HTTP status of the request
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP status of the request
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.nitric.proto.faas.v1.HeaderValue> headers_;
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
    internalGetHeaders() {
      if (headers_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      return headers_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
    internalGetMutableHeaders() {
      onChanged();;
      if (headers_ == null) {
        headers_ = com.google.protobuf.MapField.newMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      if (!headers_.isMutable()) {
        headers_ = headers_.copy();
      }
      return headers_;
    }

    public int getHeadersCount() {
      return internalGetHeaders().getMap().size();
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */

    @java.lang.Override
    public boolean containsHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHeaders().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeadersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> getHeaders() {
      return getHeadersMap();
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> getHeadersMap() {
      return internalGetHeaders().getMap();
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */
    @java.lang.Override

    public io.nitric.proto.faas.v1.HeaderValue getHeadersOrDefault(
        java.lang.String key,
        io.nitric.proto.faas.v1.HeaderValue defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> map =
          internalGetHeaders().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */
    @java.lang.Override

    public io.nitric.proto.faas.v1.HeaderValue getHeadersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> map =
          internalGetHeaders().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearHeaders() {
      internalGetMutableHeaders().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */

    public Builder removeHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHeaders().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
    getMutableHeaders() {
      return internalGetMutableHeaders().getMutableMap();
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */
    public Builder putHeaders(
        java.lang.String key,
        io.nitric.proto.faas.v1.HeaderValue value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableHeaders().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * HTTP response headers
     * </pre>
     *
     * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 3;</code>
     */

    public Builder putAllHeaders(
        java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue> values) {
      internalGetMutableHeaders().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.HttpResponseContext)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.HttpResponseContext)
  private static final io.nitric.proto.faas.v1.HttpResponseContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.HttpResponseContext();
  }

  public static io.nitric.proto.faas.v1.HttpResponseContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpResponseContext>
      PARSER = new com.google.protobuf.AbstractParser<HttpResponseContext>() {
    @java.lang.Override
    public HttpResponseContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpResponseContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpResponseContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.HttpResponseContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

