// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface BucketNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.BucketNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>.nitric.faas.v1.BucketNotificationType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.nitric.faas.v1.BucketNotificationType type = 2;</code>
   * @return The type.
   */
  io.nitric.proto.faas.v1.BucketNotificationType getType();
}