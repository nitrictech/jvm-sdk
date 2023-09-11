// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/storage/v1/storage.proto

package io.nitric.proto.storage.v1;

public interface StorageListFilesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.storage.v1.StorageListFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * keys of the files in the bucket
   * </pre>
   *
   * <code>repeated .nitric.storage.v1.File files = 1;</code>
   */
  java.util.List<io.nitric.proto.storage.v1.File> 
      getFilesList();
  /**
   * <pre>
   * keys of the files in the bucket
   * </pre>
   *
   * <code>repeated .nitric.storage.v1.File files = 1;</code>
   */
  io.nitric.proto.storage.v1.File getFiles(int index);
  /**
   * <pre>
   * keys of the files in the bucket
   * </pre>
   *
   * <code>repeated .nitric.storage.v1.File files = 1;</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * keys of the files in the bucket
   * </pre>
   *
   * <code>repeated .nitric.storage.v1.File files = 1;</code>
   */
  java.util.List<? extends io.nitric.proto.storage.v1.FileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * keys of the files in the bucket
   * </pre>
   *
   * <code>repeated .nitric.storage.v1.File files = 1;</code>
   */
  io.nitric.proto.storage.v1.FileOrBuilder getFilesOrBuilder(
      int index);
}