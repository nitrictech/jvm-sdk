//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/storage/v1/storage.proto

package io.nitric.proto.storage.v1;

@kotlin.jvm.JvmName("-initializestorageReadRequest")
inline fun storageReadRequest(block: io.nitric.proto.storage.v1.StorageReadRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.storage.v1.StorageReadRequest =
  io.nitric.proto.storage.v1.StorageReadRequestKt.Dsl._create(io.nitric.proto.storage.v1.StorageReadRequest.newBuilder()).apply { block() }._build()
object StorageReadRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.storage.v1.StorageReadRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.storage.v1.StorageReadRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.storage.v1.StorageReadRequest = _builder.build()

    /**
     * <pre>
     * Nitric name of the bucket to retrieve from
     *  this will be automatically resolved to the provider specific bucket identifier.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     */
    var bucketName: kotlin.String
      @JvmName("getBucketName")
      get() = _builder.getBucketName()
      @JvmName("setBucketName")
      set(value) {
        _builder.setBucketName(value)
      }
    /**
     * <pre>
     * Nitric name of the bucket to retrieve from
     *  this will be automatically resolved to the provider specific bucket identifier.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.validate.rules) = { ... }</code>
     */
    fun clearBucketName() {
      _builder.clearBucketName()
    }

    /**
     * <pre>
     * Key of item to retrieve
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     */
    var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <pre>
     * Key of item to retrieve
     * </pre>
     *
     * <code>string key = 2 [(.validate.rules) = { ... }</code>
     */
    fun clearKey() {
      _builder.clearKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.storage.v1.StorageReadRequest.copy(block: io.nitric.proto.storage.v1.StorageReadRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.storage.v1.StorageReadRequest =
  io.nitric.proto.storage.v1.StorageReadRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

