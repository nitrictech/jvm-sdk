//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/websocket/v1/websocket.proto

package io.nitric.proto.websocket.v1;

@kotlin.jvm.JvmName("-initializewebsocketSendRequest")
inline fun websocketSendRequest(block: io.nitric.proto.websocket.v1.WebsocketSendRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.websocket.v1.WebsocketSendRequest =
  io.nitric.proto.websocket.v1.WebsocketSendRequestKt.Dsl._create(io.nitric.proto.websocket.v1.WebsocketSendRequest.newBuilder()).apply { block() }._build()
object WebsocketSendRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.websocket.v1.WebsocketSendRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.websocket.v1.WebsocketSendRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.websocket.v1.WebsocketSendRequest = _builder.build()

    /**
     * <pre>
     * The nitric name of the socket to send on
     * </pre>
     *
     * <code>string socket = 1 [(.validate.rules) = { ... }</code>
     */
    var socket: kotlin.String
      @JvmName("getSocket")
      get() = _builder.getSocket()
      @JvmName("setSocket")
      set(value) {
        _builder.setSocket(value)
      }
    /**
     * <pre>
     * The nitric name of the socket to send on
     * </pre>
     *
     * <code>string socket = 1 [(.validate.rules) = { ... }</code>
     */
    fun clearSocket() {
      _builder.clearSocket()
    }

    /**
     * <pre>
     * The connection ID of the client to send to
     * </pre>
     *
     * <code>string connection_id = 2 [(.validate.rules) = { ... }</code>
     */
    var connectionId: kotlin.String
      @JvmName("getConnectionId")
      get() = _builder.getConnectionId()
      @JvmName("setConnectionId")
      set(value) {
        _builder.setConnectionId(value)
      }
    /**
     * <pre>
     * The connection ID of the client to send to
     * </pre>
     *
     * <code>string connection_id = 2 [(.validate.rules) = { ... }</code>
     */
    fun clearConnectionId() {
      _builder.clearConnectionId()
    }

    /**
     * <pre>
     * The data to send to the socket
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * The data to send to the socket
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.websocket.v1.WebsocketSendRequest.copy(block: io.nitric.proto.websocket.v1.WebsocketSendRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.websocket.v1.WebsocketSendRequest =
  io.nitric.proto.websocket.v1.WebsocketSendRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

