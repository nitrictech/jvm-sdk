// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface BucketNotificationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.BucketNotificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.nitric.faas.v1.BucketNotificationType notification_type = 1;</code>
   * @return The enum numeric value on the wire for notificationType.
   */
  int getNotificationTypeValue();
  /**
   * <code>.nitric.faas.v1.BucketNotificationType notification_type = 1;</code>
   * @return The notificationType.
   */
  io.nitric.proto.faas.v1.BucketNotificationType getNotificationType();

  /**
   * <pre>
   * A notification filter is a prefix for a bucket object in which creations or deletions should trigger a notification:
   * e.g. Notification filter: /images/cat and Event Type: created, would trigger on creating /images/cat.png and /images/cat.jpg but not creating /cat.png
   * </pre>
   *
   * <code>string notification_prefix_filter = 2;</code>
   * @return The notificationPrefixFilter.
   */
  java.lang.String getNotificationPrefixFilter();
  /**
   * <pre>
   * A notification filter is a prefix for a bucket object in which creations or deletions should trigger a notification:
   * e.g. Notification filter: /images/cat and Event Type: created, would trigger on creating /images/cat.png and /images/cat.jpg but not creating /cat.png
   * </pre>
   *
   * <code>string notification_prefix_filter = 2;</code>
   * @return The bytes for notificationPrefixFilter.
   */
  com.google.protobuf.ByteString
      getNotificationPrefixFilterBytes();
}
