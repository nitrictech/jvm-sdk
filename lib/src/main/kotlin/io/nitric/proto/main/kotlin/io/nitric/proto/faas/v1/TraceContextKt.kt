//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

@kotlin.jvm.JvmName("-initializetraceContext")
inline fun traceContext(block: io.nitric.proto.faas.v1.TraceContextKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.TraceContext =
  io.nitric.proto.faas.v1.TraceContextKt.Dsl._create(io.nitric.proto.faas.v1.TraceContext.newBuilder()).apply { block() }._build()
object TraceContextKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.faas.v1.TraceContext.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.faas.v1.TraceContext.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.faas.v1.TraceContext = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ValuesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
     val values: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getValuesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getValuesMap()
      )
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
    @JvmName("putValues")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      .put(key: kotlin.String, value: kotlin.String) {
         _builder.putValues(key, value)
       }
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setValues")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      .set(key: kotlin.String, value: kotlin.String) {
         put(key, value)
       }
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeValues")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      .remove(key: kotlin.String) {
         _builder.removeValues(key)
       }
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllValues")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.String>) {
         _builder.putAllValues(map)
       }
    /**
     * <code>map&lt;string, string&gt; values = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearValues")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, ValuesProxy>
      .clear() {
         _builder.clearValues()
       }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.faas.v1.TraceContext.copy(block: io.nitric.proto.faas.v1.TraceContextKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.TraceContext =
  io.nitric.proto.faas.v1.TraceContextKt.Dsl._create(this.toBuilder()).apply { block() }._build()

