//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

@kotlin.jvm.JvmName("-initializebucketNotification")
inline fun bucketNotification(block: io.nitric.proto.faas.v1.BucketNotificationKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.BucketNotification =
  io.nitric.proto.faas.v1.BucketNotificationKt.Dsl._create(io.nitric.proto.faas.v1.BucketNotification.newBuilder()).apply { block() }._build()
object BucketNotificationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.faas.v1.BucketNotification.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.faas.v1.BucketNotification.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.faas.v1.BucketNotification = _builder.build()

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

    /**
     * <code>.nitric.faas.v1.BucketNotificationType type = 2;</code>
     */
     var type: io.nitric.proto.faas.v1.BucketNotificationType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <code>.nitric.faas.v1.BucketNotificationType type = 2;</code>
     */
    fun clearType() {
      _builder.clearType()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.faas.v1.BucketNotification.copy(block: io.nitric.proto.faas.v1.BucketNotificationKt.Dsl.() -> kotlin.Unit): io.nitric.proto.faas.v1.BucketNotification =
  io.nitric.proto.faas.v1.BucketNotificationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

