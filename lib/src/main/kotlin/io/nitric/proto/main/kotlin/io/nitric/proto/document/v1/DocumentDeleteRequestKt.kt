//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

@kotlin.jvm.JvmName("-initializedocumentDeleteRequest")
inline fun documentDeleteRequest(block: io.nitric.proto.document.v1.DocumentDeleteRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.DocumentDeleteRequest =
  io.nitric.proto.document.v1.DocumentDeleteRequestKt.Dsl._create(io.nitric.proto.document.v1.DocumentDeleteRequest.newBuilder()).apply { block() }._build()
object DocumentDeleteRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.document.v1.DocumentDeleteRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.document.v1.DocumentDeleteRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.document.v1.DocumentDeleteRequest = _builder.build()

    /**
     * <pre>
     * Key of the document to delete
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    var key: io.nitric.proto.document.v1.Key
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <pre>
     * Key of the document to delete
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     */
    fun clearKey() {
      _builder.clearKey()
    }
    /**
     * <pre>
     * Key of the document to delete
     * </pre>
     *
     * <code>.nitric.document.v1.Key key = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the key field is set.
     */
    fun hasKey(): kotlin.Boolean {
      return _builder.hasKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.document.v1.DocumentDeleteRequest.copy(block: io.nitric.proto.document.v1.DocumentDeleteRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.DocumentDeleteRequest =
  io.nitric.proto.document.v1.DocumentDeleteRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.document.v1.DocumentDeleteRequestOrBuilder.keyOrNull: io.nitric.proto.document.v1.Key?
  get() = if (hasKey()) getKey() else null

