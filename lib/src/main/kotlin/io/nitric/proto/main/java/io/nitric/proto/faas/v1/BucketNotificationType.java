// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * <pre>
 * Notification Workers
 * </pre>
 *
 * Protobuf enum {@code nitric.faas.v1.BucketNotificationType}
 */
public enum BucketNotificationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>All = 0;</code>
   */
  All(0),
  /**
   * <code>Created = 1;</code>
   */
  Created(1),
  /**
   * <code>Deleted = 2;</code>
   */
  Deleted(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>All = 0;</code>
   */
  public static final int All_VALUE = 0;
  /**
   * <code>Created = 1;</code>
   */
  public static final int Created_VALUE = 1;
  /**
   * <code>Deleted = 2;</code>
   */
  public static final int Deleted_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BucketNotificationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BucketNotificationType forNumber(int value) {
    switch (value) {
      case 0: return All;
      case 1: return Created;
      case 2: return Deleted;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BucketNotificationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BucketNotificationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BucketNotificationType>() {
          public BucketNotificationType findValueByNumber(int number) {
            return BucketNotificationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.getDescriptor().getEnumTypes().get(0);
  }

  private static final BucketNotificationType[] VALUES = values();

  public static BucketNotificationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BucketNotificationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:nitric.faas.v1.BucketNotificationType)
}

