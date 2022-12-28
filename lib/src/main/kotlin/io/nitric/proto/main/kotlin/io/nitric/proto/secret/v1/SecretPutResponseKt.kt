//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/secret/v1/secret.proto

package io.nitric.proto.secret.v1;

@kotlin.jvm.JvmName("-initializesecretPutResponse")
inline fun secretPutResponse(block: io.nitric.proto.secret.v1.SecretPutResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.secret.v1.SecretPutResponse =
  io.nitric.proto.secret.v1.SecretPutResponseKt.Dsl._create(io.nitric.proto.secret.v1.SecretPutResponse.newBuilder()).apply { block() }._build()
object SecretPutResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.secret.v1.SecretPutResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.secret.v1.SecretPutResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.secret.v1.SecretPutResponse = _builder.build()

    /**
     * <pre>
     * The id of the secret
     * </pre>
     *
     * <code>.nitric.secret.v1.SecretVersion secret_version = 1;</code>
     */
    var secretVersion: io.nitric.proto.secret.v1.SecretVersion
      @JvmName("getSecretVersion")
      get() = _builder.getSecretVersion()
      @JvmName("setSecretVersion")
      set(value) {
        _builder.setSecretVersion(value)
      }
    /**
     * <pre>
     * The id of the secret
     * </pre>
     *
     * <code>.nitric.secret.v1.SecretVersion secret_version = 1;</code>
     */
    fun clearSecretVersion() {
      _builder.clearSecretVersion()
    }
    /**
     * <pre>
     * The id of the secret
     * </pre>
     *
     * <code>.nitric.secret.v1.SecretVersion secret_version = 1;</code>
     * @return Whether the secretVersion field is set.
     */
    fun hasSecretVersion(): kotlin.Boolean {
      return _builder.hasSecretVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.secret.v1.SecretPutResponse.copy(block: io.nitric.proto.secret.v1.SecretPutResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.secret.v1.SecretPutResponse =
  io.nitric.proto.secret.v1.SecretPutResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.secret.v1.SecretPutResponseOrBuilder.secretVersionOrNull: io.nitric.proto.secret.v1.SecretVersion?
  get() = if (hasSecretVersion()) getSecretVersion() else null

