//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

@kotlin.jvm.JvmName("-initializecollection")
inline fun collection(block: io.nitric.proto.document.v1.CollectionKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.Collection =
  io.nitric.proto.document.v1.CollectionKt.Dsl._create(io.nitric.proto.document.v1.Collection.newBuilder()).apply { block() }._build()
object CollectionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.document.v1.Collection.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.document.v1.Collection.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.document.v1.Collection = _builder.build()

    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    fun clearName() {
      _builder.clearName()
    }

    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    var parent: io.nitric.proto.document.v1.Key
      @JvmName("getParent")
      get() = _builder.getParent()
      @JvmName("setParent")
      set(value) {
        _builder.setParent(value)
      }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     */
    fun clearParent() {
      _builder.clearParent()
    }
    /**
     * <pre>
     * Optional parent key, required when the collection is a sub-collection of another document
     * </pre>
     *
     * <code>.nitric.document.v1.Key parent = 2;</code>
     * @return Whether the parent field is set.
     */
    fun hasParent(): kotlin.Boolean {
      return _builder.hasParent()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.document.v1.Collection.copy(block: io.nitric.proto.document.v1.CollectionKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.Collection =
  io.nitric.proto.document.v1.CollectionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.document.v1.CollectionOrBuilder.parentOrNull: io.nitric.proto.document.v1.Key?
  get() = if (hasParent()) getParent() else null

