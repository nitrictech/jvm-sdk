// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface WebsocketWorkerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.WebsocketWorker)
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
   * The type of event that this worker handles
   * </pre>
   *
   * <code>.nitric.faas.v1.WebsocketEvent event = 2;</code>
   * @return The enum numeric value on the wire for event.
   */
  int getEventValue();
  /**
   * <pre>
   * The type of event that this worker handles
   * </pre>
   *
   * <code>.nitric.faas.v1.WebsocketEvent event = 2;</code>
   * @return The event.
   */
  io.nitric.proto.faas.v1.WebsocketEvent getEvent();
}
