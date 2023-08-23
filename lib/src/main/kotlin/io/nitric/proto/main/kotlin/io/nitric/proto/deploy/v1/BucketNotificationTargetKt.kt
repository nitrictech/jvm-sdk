//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

@kotlin.jvm.JvmName("-initializebucketNotificationTarget")
inline fun bucketNotificationTarget(block: io.nitric.proto.deploy.v1.BucketNotificationTargetKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.BucketNotificationTarget =
  io.nitric.proto.deploy.v1.BucketNotificationTargetKt.Dsl._create(io.nitric.proto.deploy.v1.BucketNotificationTarget.newBuilder()).apply { block() }._build()
object BucketNotificationTargetKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.deploy.v1.BucketNotificationTarget.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.deploy.v1.BucketNotificationTarget.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.deploy.v1.BucketNotificationTarget = _builder.build()

    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    var config: io.nitric.proto.faas.v1.BucketNotificationConfig
      @JvmName("getConfig")
      get() = _builder.getConfig()
      @JvmName("setConfig")
      set(value) {
        _builder.setConfig(value)
      }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     */
    fun clearConfig() {
      _builder.clearConfig()
    }
    /**
     * <code>.nitric.faas.v1.BucketNotificationConfig config = 1;</code>
     * @return Whether the config field is set.
     */
    fun hasConfig(): kotlin.Boolean {
      return _builder.hasConfig()
    }

    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     */
    var executionUnit: kotlin.String
      @JvmName("getExecutionUnit")
      get() = _builder.getExecutionUnit()
      @JvmName("setExecutionUnit")
      set(value) {
        _builder.setExecutionUnit(value)
      }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     */
    fun clearExecutionUnit() {
      _builder.clearExecutionUnit()
    }
    /**
     * <pre>
     * The name of an execution unit to target
     * </pre>
     *
     * <code>string execution_unit = 2;</code>
     * @return Whether the executionUnit field is set.
     */
    fun hasExecutionUnit(): kotlin.Boolean {
      return _builder.hasExecutionUnit()
    }
    val targetCase: io.nitric.proto.deploy.v1.BucketNotificationTarget.TargetCase
      @JvmName("getTargetCase")
      get() = _builder.getTargetCase()

    fun clearTarget() {
      _builder.clearTarget()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.deploy.v1.BucketNotificationTarget.copy(block: io.nitric.proto.deploy.v1.BucketNotificationTargetKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.BucketNotificationTarget =
  io.nitric.proto.deploy.v1.BucketNotificationTargetKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.deploy.v1.BucketNotificationTargetOrBuilder.configOrNull: io.nitric.proto.faas.v1.BucketNotificationConfig?
  get() = if (hasConfig()) getConfig() else null

