// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface WebsocketResponseContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.WebsocketResponseContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * There aren't really responses here, instead we need to provide a runtime
   * API for responding back and emitting/broadcasting on the websocket from the server
   * </pre>
   *
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();
}
