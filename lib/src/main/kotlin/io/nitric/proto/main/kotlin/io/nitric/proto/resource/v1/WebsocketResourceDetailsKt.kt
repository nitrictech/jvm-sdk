//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

@kotlin.jvm.JvmName("-initializewebsocketResourceDetails")
inline fun websocketResourceDetails(block: io.nitric.proto.resource.v1.WebsocketResourceDetailsKt.Dsl.() -> kotlin.Unit): io.nitric.proto.resource.v1.WebsocketResourceDetails =
  io.nitric.proto.resource.v1.WebsocketResourceDetailsKt.Dsl._create(io.nitric.proto.resource.v1.WebsocketResourceDetails.newBuilder()).apply { block() }._build()
object WebsocketResourceDetailsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.resource.v1.WebsocketResourceDetails.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.resource.v1.WebsocketResourceDetails.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.resource.v1.WebsocketResourceDetails = _builder.build()

    /**
     * <code>string url = 1;</code>
     */
    var url: kotlin.String
      @JvmName("getUrl")
      get() = _builder.getUrl()
      @JvmName("setUrl")
      set(value) {
        _builder.setUrl(value)
      }
    /**
     * <code>string url = 1;</code>
     */
    fun clearUrl() {
      _builder.clearUrl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.resource.v1.WebsocketResourceDetails.copy(block: io.nitric.proto.resource.v1.WebsocketResourceDetailsKt.Dsl.() -> kotlin.Unit): io.nitric.proto.resource.v1.WebsocketResourceDetails =
  io.nitric.proto.resource.v1.WebsocketResourceDetailsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

