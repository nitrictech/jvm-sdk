// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/websocket/v1/websocket.proto

package io.nitric.proto.websocket.v1;

public interface WebsocketCloseRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.websocket.v1.WebsocketCloseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The nitric name of the socket to send on
   * </pre>
   *
   * <code>string socket = 1 [(.validate.rules) = { ... }</code>
   * @return The socket.
   */
  java.lang.String getSocket();
  /**
   * <pre>
   * The nitric name of the socket to send on
   * </pre>
   *
   * <code>string socket = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for socket.
   */
  com.google.protobuf.ByteString
      getSocketBytes();

  /**
   * <pre>
   * The connection ID of the client to send to
   * </pre>
   *
   * <code>string connection_id = 2 [(.validate.rules) = { ... }</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * The connection ID of the client to send to
   * </pre>
   *
   * <code>string connection_id = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
