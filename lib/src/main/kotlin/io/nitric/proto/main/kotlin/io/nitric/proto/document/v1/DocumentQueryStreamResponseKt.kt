//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

@kotlin.jvm.JvmName("-initializedocumentQueryStreamResponse")
inline fun documentQueryStreamResponse(block: io.nitric.proto.document.v1.DocumentQueryStreamResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.DocumentQueryStreamResponse =
  io.nitric.proto.document.v1.DocumentQueryStreamResponseKt.Dsl._create(io.nitric.proto.document.v1.DocumentQueryStreamResponse.newBuilder()).apply { block() }._build()
object DocumentQueryStreamResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.document.v1.DocumentQueryStreamResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.document.v1.DocumentQueryStreamResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.document.v1.DocumentQueryStreamResponse = _builder.build()

    /**
     * <pre>
     * The stream document
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    var document: io.nitric.proto.document.v1.Document
      @JvmName("getDocument")
      get() = _builder.getDocument()
      @JvmName("setDocument")
      set(value) {
        _builder.setDocument(value)
      }
    /**
     * <pre>
     * The stream document
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     */
    fun clearDocument() {
      _builder.clearDocument()
    }
    /**
     * <pre>
     * The stream document
     * </pre>
     *
     * <code>.nitric.document.v1.Document document = 1;</code>
     * @return Whether the document field is set.
     */
    fun hasDocument(): kotlin.Boolean {
      return _builder.hasDocument()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.document.v1.DocumentQueryStreamResponse.copy(block: io.nitric.proto.document.v1.DocumentQueryStreamResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.DocumentQueryStreamResponse =
  io.nitric.proto.document.v1.DocumentQueryStreamResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.document.v1.DocumentQueryStreamResponseOrBuilder.documentOrNull: io.nitric.proto.document.v1.Document?
  get() = if (hasDocument()) getDocument() else null

