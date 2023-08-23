// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

/**
 * Protobuf type {@code nitric.deploy.v1.Api}
 */
public final class Api extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.deploy.v1.Api)
    ApiOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Api.newBuilder() to construct.
  private Api(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Api() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Api();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_Api_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_Api_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.deploy.v1.Api.class, io.nitric.proto.deploy.v1.Api.Builder.class);
  }

  private int documentCase_ = 0;
  private java.lang.Object document_;
  public enum DocumentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OPENAPI(1),
    DOCUMENT_NOT_SET(0);
    private final int value;
    private DocumentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DocumentCase valueOf(int value) {
      return forNumber(value);
    }

    public static DocumentCase forNumber(int value) {
      switch (value) {
        case 1: return OPENAPI;
        case 0: return DOCUMENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DocumentCase
  getDocumentCase() {
    return DocumentCase.forNumber(
        documentCase_);
  }

  public static final int OPENAPI_FIELD_NUMBER = 1;
  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return Whether the openapi field is set.
   */
  public boolean hasOpenapi() {
    return documentCase_ == 1;
  }
  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return The openapi.
   */
  public java.lang.String getOpenapi() {
    java.lang.Object ref = "";
    if (documentCase_ == 1) {
      ref = document_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (documentCase_ == 1) {
        document_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return The bytes for openapi.
   */
  public com.google.protobuf.ByteString
      getOpenapiBytes() {
    java.lang.Object ref = "";
    if (documentCase_ == 1) {
      ref = document_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (documentCase_ == 1) {
        document_ = b;
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
    if (documentCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, document_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (documentCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, document_);
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
    if (!(obj instanceof io.nitric.proto.deploy.v1.Api)) {
      return super.equals(obj);
    }
    io.nitric.proto.deploy.v1.Api other = (io.nitric.proto.deploy.v1.Api) obj;

    if (!getDocumentCase().equals(other.getDocumentCase())) return false;
    switch (documentCase_) {
      case 1:
        if (!getOpenapi()
            .equals(other.getOpenapi())) return false;
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
    switch (documentCase_) {
      case 1:
        hash = (37 * hash) + OPENAPI_FIELD_NUMBER;
        hash = (53 * hash) + getOpenapi().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.deploy.v1.Api parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.Api parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.Api parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.deploy.v1.Api parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.deploy.v1.Api prototype) {
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
   * Protobuf type {@code nitric.deploy.v1.Api}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.deploy.v1.Api)
      io.nitric.proto.deploy.v1.ApiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_Api_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_Api_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.deploy.v1.Api.class, io.nitric.proto.deploy.v1.Api.Builder.class);
    }

    // Construct using io.nitric.proto.deploy.v1.Api.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      documentCase_ = 0;
      document_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.deploy.v1.Deploys.internal_static_nitric_deploy_v1_Api_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.Api getDefaultInstanceForType() {
      return io.nitric.proto.deploy.v1.Api.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.Api build() {
      io.nitric.proto.deploy.v1.Api result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.deploy.v1.Api buildPartial() {
      io.nitric.proto.deploy.v1.Api result = new io.nitric.proto.deploy.v1.Api(this);
      if (documentCase_ == 1) {
        result.document_ = document_;
      }
      result.documentCase_ = documentCase_;
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
      if (other instanceof io.nitric.proto.deploy.v1.Api) {
        return mergeFrom((io.nitric.proto.deploy.v1.Api)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.deploy.v1.Api other) {
      if (other == io.nitric.proto.deploy.v1.Api.getDefaultInstance()) return this;
      switch (other.getDocumentCase()) {
        case OPENAPI: {
          documentCase_ = 1;
          document_ = other.document_;
          onChanged();
          break;
        }
        case DOCUMENT_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              documentCase_ = 1;
              document_ = s;
              break;
            } // case 10
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
    private int documentCase_ = 0;
    private java.lang.Object document_;
    public DocumentCase
        getDocumentCase() {
      return DocumentCase.forNumber(
          documentCase_);
    }

    public Builder clearDocument() {
      documentCase_ = 0;
      document_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @return Whether the openapi field is set.
     */
    @java.lang.Override
    public boolean hasOpenapi() {
      return documentCase_ == 1;
    }
    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @return The openapi.
     */
    @java.lang.Override
    public java.lang.String getOpenapi() {
      java.lang.Object ref = "";
      if (documentCase_ == 1) {
        ref = document_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (documentCase_ == 1) {
          document_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @return The bytes for openapi.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOpenapiBytes() {
      java.lang.Object ref = "";
      if (documentCase_ == 1) {
        ref = document_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (documentCase_ == 1) {
          document_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @param value The openapi to set.
     * @return This builder for chaining.
     */
    public Builder setOpenapi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  documentCase_ = 1;
      document_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenapi() {
      if (documentCase_ == 1) {
        documentCase_ = 0;
        document_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * An OpenAPI document for deployment
     * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
     * </pre>
     *
     * <code>string openapi = 1;</code>
     * @param value The bytes for openapi to set.
     * @return This builder for chaining.
     */
    public Builder setOpenapiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      documentCase_ = 1;
      document_ = value;
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


    // @@protoc_insertion_point(builder_scope:nitric.deploy.v1.Api)
  }

  // @@protoc_insertion_point(class_scope:nitric.deploy.v1.Api)
  private static final io.nitric.proto.deploy.v1.Api DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.deploy.v1.Api();
  }

  public static io.nitric.proto.deploy.v1.Api getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Api>
      PARSER = new com.google.protobuf.AbstractParser<Api>() {
    @java.lang.Override
    public Api parsePartialFrom(
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

  public static com.google.protobuf.Parser<Api> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Api> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.deploy.v1.Api getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

