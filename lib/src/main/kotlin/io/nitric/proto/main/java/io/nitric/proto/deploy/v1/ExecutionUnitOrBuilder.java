// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface ExecutionUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.ExecutionUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Container image as a execution unit
   * </pre>
   *
   * <code>.nitric.deploy.v1.ImageSource image = 1;</code>
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   * <pre>
   * Container image as a execution unit
   * </pre>
   *
   * <code>.nitric.deploy.v1.ImageSource image = 1;</code>
   * @return The image.
   */
  io.nitric.proto.deploy.v1.ImageSource getImage();
  /**
   * <pre>
   * Container image as a execution unit
   * </pre>
   *
   * <code>.nitric.deploy.v1.ImageSource image = 1;</code>
   */
  io.nitric.proto.deploy.v1.ImageSourceOrBuilder getImageOrBuilder();

  /**
   * <pre>
   * Expected worker count for this execution unit
   * </pre>
   *
   * <code>int32 workers = 10;</code>
   * @return The workers.
   */
  int getWorkers();

  /**
   * <pre>
   * Configurable timeout for request handling
   * </pre>
   *
   * <code>int32 timeout = 11 [deprecated = true];</code>
   * @deprecated nitric.deploy.v1.ExecutionUnit.timeout is deprecated.
   *     See proto/deploy/v1/deploy.proto;l=108
   * @return The timeout.
   */
  @java.lang.Deprecated int getTimeout();

  /**
   * <pre>
   * Configurable memory size for this instance
   * </pre>
   *
   * <code>int32 memory = 12 [deprecated = true];</code>
   * @deprecated nitric.deploy.v1.ExecutionUnit.memory is deprecated.
   *     See proto/deploy/v1/deploy.proto;l=110
   * @return The memory.
   */
  @java.lang.Deprecated int getMemory();

  /**
   * <pre>
   * A simple type property
   * describes the requested type of execution unit that this should be
   * for this project, a provider can implement how this request is satisfied
   * in any way
   * </pre>
   *
   * <code>string type = 13;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * A simple type property
   * describes the requested type of execution unit that this should be
   * for this project, a provider can implement how this request is satisfied
   * in any way
   * </pre>
   *
   * <code>string type = 13;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Environment variables for this execution unit
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 14;</code>
   */
  int getEnvCount();
  /**
   * <pre>
   * Environment variables for this execution unit
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 14;</code>
   */
  boolean containsEnv(
      java.lang.String key);
  /**
   * Use {@link #getEnvMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnv();
  /**
   * <pre>
   * Environment variables for this execution unit
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 14;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvMap();
  /**
   * <pre>
   * Environment variables for this execution unit
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 14;</code>
   */

  /* nullable */
java.lang.String getEnvOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Environment variables for this execution unit
   * </pre>
   *
   * <code>map&lt;string, string&gt; env = 14;</code>
   */

  java.lang.String getEnvOrThrow(
      java.lang.String key);

  public io.nitric.proto.deploy.v1.ExecutionUnit.SourceCase getSourceCase();
}