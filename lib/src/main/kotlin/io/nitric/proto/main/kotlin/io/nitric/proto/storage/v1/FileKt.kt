//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/storage/v1/storage.proto

package io.nitric.proto.storage.v1;

@kotlin.jvm.JvmName("-initializefile")
inline fun file(block: io.nitric.proto.storage.v1.FileKt.Dsl.() -> kotlin.Unit): io.nitric.proto.storage.v1.File =
  io.nitric.proto.storage.v1.FileKt.Dsl._create(io.nitric.proto.storage.v1.File.newBuilder()).apply { block() }._build()
object FileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.storage.v1.File.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.storage.v1.File.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.storage.v1.File = _builder.build()

    /**
     * <code>string key = 1;</code>
     */
    var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>string key = 1;</code>
     */
    fun clearKey() {
      _builder.clearKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.storage.v1.File.copy(block: io.nitric.proto.storage.v1.FileKt.Dsl.() -> kotlin.Unit): io.nitric.proto.storage.v1.File =
  io.nitric.proto.storage.v1.FileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

