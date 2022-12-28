//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

@kotlin.jvm.JvmName("-initializeapiSecurityDefinition")
inline fun apiSecurityDefinition(block: io.nitric.proto.resource.v1.ApiSecurityDefinitionKt.Dsl.() -> kotlin.Unit): io.nitric.proto.resource.v1.ApiSecurityDefinition =
  io.nitric.proto.resource.v1.ApiSecurityDefinitionKt.Dsl._create(io.nitric.proto.resource.v1.ApiSecurityDefinition.newBuilder()).apply { block() }._build()
object ApiSecurityDefinitionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.resource.v1.ApiSecurityDefinition.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.resource.v1.ApiSecurityDefinition.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.resource.v1.ApiSecurityDefinition = _builder.build()

    /**
     * <code>.nitric.resource.v1.ApiSecurityDefinitionJwt jwt = 1;</code>
     */
    var jwt: io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt
      @JvmName("getJwt")
      get() = _builder.getJwt()
      @JvmName("setJwt")
      set(value) {
        _builder.setJwt(value)
      }
    /**
     * <code>.nitric.resource.v1.ApiSecurityDefinitionJwt jwt = 1;</code>
     */
    fun clearJwt() {
      _builder.clearJwt()
    }
    /**
     * <code>.nitric.resource.v1.ApiSecurityDefinitionJwt jwt = 1;</code>
     * @return Whether the jwt field is set.
     */
    fun hasJwt(): kotlin.Boolean {
      return _builder.hasJwt()
    }
    val definitionCase: io.nitric.proto.resource.v1.ApiSecurityDefinition.DefinitionCase
      @JvmName("getDefinitionCase")
      get() = _builder.getDefinitionCase()

    fun clearDefinition() {
      _builder.clearDefinition()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.resource.v1.ApiSecurityDefinition.copy(block: io.nitric.proto.resource.v1.ApiSecurityDefinitionKt.Dsl.() -> kotlin.Unit): io.nitric.proto.resource.v1.ApiSecurityDefinition =
  io.nitric.proto.resource.v1.ApiSecurityDefinitionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.resource.v1.ApiSecurityDefinitionOrBuilder.jwtOrNull: io.nitric.proto.resource.v1.ApiSecurityDefinitionJwt?
  get() = if (hasJwt()) getJwt() else null

