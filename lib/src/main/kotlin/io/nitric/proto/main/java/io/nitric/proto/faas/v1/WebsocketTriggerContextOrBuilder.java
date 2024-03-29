// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface WebsocketTriggerContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.WebsocketTriggerContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The nitric name of the socket that this worker listens on
   * </pre>
   *
   * <code>string socket = 1;</code>
   * @return The socket.
   */
  java.lang.String getSocket();
  /**
   * <pre>
   * The nitric name of the socket that this worker listens on
   * </pre>
   *
   * <code>string socket = 1;</code>
   * @return The bytes for socket.
   */
  com.google.protobuf.ByteString
      getSocketBytes();

  /**
   * <pre>
   * The type of websocket event
   * </pre>
   *
   * <code>.nitric.faas.v1.WebsocketEvent event = 2;</code>
   * @return The enum numeric value on the wire for event.
   */
  int getEventValue();
  /**
   * <pre>
   * The type of websocket event
   * </pre>
   *
   * <code>.nitric.faas.v1.WebsocketEvent event = 2;</code>
   * @return The event.
   */
  io.nitric.proto.faas.v1.WebsocketEvent getEvent();

  /**
   * <pre>
   * The connection this trigger came from
   * </pre>
   *
   * <code>string connectionId = 3;</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * The connection this trigger came from
   * </pre>
   *
   * <code>string connectionId = 3;</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * The query params available in the connection request
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.QueryValue&gt; query_params = 6;</code>
   */
  int getQueryParamsCount();
  /**
   * <pre>
   * The query params available in the connection request
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.QueryValue&gt; query_params = 6;</code>
   */
  boolean containsQueryParams(
      java.lang.String key);
  /**
   * Use {@link #getQueryParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.nitric.proto.faas.v1.QueryValue>
  getQueryParams();
  /**
   * <pre>
   * The query params available in the connection request
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.QueryValue&gt; query_params = 6;</code>
   */
  java.util.Map<java.lang.String, io.nitric.proto.faas.v1.QueryValue>
  getQueryParamsMap();
  /**
   * <pre>
   * The query params available in the connection request
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.QueryValue&gt; query_params = 6;</code>
   */

  /* nullable */
io.nitric.proto.faas.v1.QueryValue getQueryParamsOrDefault(
      java.lang.String key,
      /* nullable */
io.nitric.proto.faas.v1.QueryValue defaultValue);
  /**
   * <pre>
   * The query params available in the connection request
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.QueryValue&gt; query_params = 6;</code>
   */

  io.nitric.proto.faas.v1.QueryValue getQueryParamsOrThrow(
      java.lang.String key);
}
