// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/storage/v1/storage.proto

package io.nitric.proto.storage.v1;

public interface StorageDeleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.storage.v1.StorageDeleteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the bucket to delete from
   * </pre>
   *
   * <code>string bucket_name = 1;</code>
   * @return The bucketName.
   */
  java.lang.String getBucketName();
  /**
   * <pre>
   * Name of the bucket to delete from
   * </pre>
   *
   * <code>string bucket_name = 1;</code>
   * @return The bytes for bucketName.
   */
  com.google.protobuf.ByteString
      getBucketNameBytes();

  /**
   * <pre>
   * Key of item to delete
   * </pre>
   *
   * <code>string key = 2 [(.validate.rules) = { ... }</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Key of item to delete
   * </pre>
   *
   * <code>string key = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
