//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

@kotlin.jvm.JvmName("-initializewebsocketResponseContext")
inline fun websocketResponseContext(block: io.nitric.proto.faas.v1.WebsocketResponseContextKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.WebsocketResponseContext =
  io.nitric.proto.faas.v1.WebsocketResponseContextKt.Dsl._create(io.nitric.proto.faas.v1.WebsocketResponseContext.newBuilder()).apply { block() }._build()
object WebsocketResponseContextKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.faas.v1.WebsocketResponseContext.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.faas.v1.WebsocketResponseContext.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.faas.v1.WebsocketResponseContext = _builder.build()

    /**
     * <pre>
     * There aren't really responses here, instead we need to provide a runtime
     * API for responding back and emitting/broadcasting on the websocket from the server
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    var success: kotlin.Boolean
      @JvmName("getSuccess")
      get() = _builder.getSuccess()
      @JvmName("setSuccess")
      set(value) {
        _builder.setSuccess(value)
      }
    /**
     * <pre>
     * There aren't really responses here, instead we need to provide a runtime
     * API for responding back and emitting/broadcasting on the websocket from the server
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    fun clearSuccess() {
      _builder.clearSuccess()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.faas.v1.WebsocketResponseContext.copy(block: io.nitric.proto.faas.v1.WebsocketResponseContextKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.WebsocketResponseContext =
  io.nitric.proto.faas.v1.WebsocketResponseContextKt.Dsl._create(this.toBuilder()).apply { block() }._build()

