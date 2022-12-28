// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

/**
 * <pre>
 * WellKnownRegex contain some well-known patterns.
 * </pre>
 *
 * Protobuf enum {@code validate.KnownRegex}
 */
public enum KnownRegex
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * HTTP header name as defined by RFC 7230.
   * </pre>
   *
   * <code>HTTP_HEADER_NAME = 1;</code>
   */
  HTTP_HEADER_NAME(1),
  /**
   * <pre>
   * HTTP header value as defined by RFC 7230.
   * </pre>
   *
   * <code>HTTP_HEADER_VALUE = 2;</code>
   */
  HTTP_HEADER_VALUE(2),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * HTTP header name as defined by RFC 7230.
   * </pre>
   *
   * <code>HTTP_HEADER_NAME = 1;</code>
   */
  public static final int HTTP_HEADER_NAME_VALUE = 1;
  /**
   * <pre>
   * HTTP header value as defined by RFC 7230.
   * </pre>
   *
   * <code>HTTP_HEADER_VALUE = 2;</code>
   */
  public static final int HTTP_HEADER_VALUE_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static KnownRegex valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KnownRegex forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return HTTP_HEADER_NAME;
      case 2: return HTTP_HEADER_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KnownRegex>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KnownRegex> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KnownRegex>() {
          public KnownRegex findValueByNumber(int number) {
            return KnownRegex.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.envoyproxy.pgv.validate.Validate.getDescriptor().getEnumTypes().get(0);
  }

  private static final KnownRegex[] VALUES = values();

  public static KnownRegex valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private KnownRegex(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:validate.KnownRegex)
}

