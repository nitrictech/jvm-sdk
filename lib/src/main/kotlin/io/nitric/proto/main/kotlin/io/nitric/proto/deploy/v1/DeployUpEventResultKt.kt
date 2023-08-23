//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

@kotlin.jvm.JvmName("-initializedeployUpEventResult")
inline fun deployUpEventResult(block: io.nitric.proto.deploy.v1.DeployUpEventResultKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.DeployUpEventResult =
  io.nitric.proto.deploy.v1.DeployUpEventResultKt.Dsl._create(io.nitric.proto.deploy.v1.DeployUpEventResult.newBuilder()).apply { block() }._build()
object DeployUpEventResultKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.deploy.v1.DeployUpEventResult.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.deploy.v1.DeployUpEventResult.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.deploy.v1.DeployUpEventResult = _builder.build()

    /**
     * <pre>
     * Indicate the success status
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    var success: kotlin.Boolean
      @JvmName("getSuccess")
      get() = _builder.getSuccess()
      @JvmName("setSuccess")
      set(value) {
        _builder.setSuccess(value)
      }
    /**
     * <pre>
     * Indicate the success status
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    fun clearSuccess() {
      _builder.clearSuccess()
    }

    /**
     * <pre>
     * Output state as a struct, this can be provided as an output file
     * or pretty printed for CLI output
     * </pre>
     *
     * <code>.nitric.deploy.v1.UpResult result = 2;</code>
     */
    var result: io.nitric.proto.deploy.v1.UpResult
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <pre>
     * Output state as a struct, this can be provided as an output file
     * or pretty printed for CLI output
     * </pre>
     *
     * <code>.nitric.deploy.v1.UpResult result = 2;</code>
     */
    fun clearResult() {
      _builder.clearResult()
    }
    /**
     * <pre>
     * Output state as a struct, this can be provided as an output file
     * or pretty printed for CLI output
     * </pre>
     *
     * <code>.nitric.deploy.v1.UpResult result = 2;</code>
     * @return Whether the result field is set.
     */
    fun hasResult(): kotlin.Boolean {
      return _builder.hasResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.deploy.v1.DeployUpEventResult.copy(block: io.nitric.proto.deploy.v1.DeployUpEventResultKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.DeployUpEventResult =
  io.nitric.proto.deploy.v1.DeployUpEventResultKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.deploy.v1.DeployUpEventResultOrBuilder.resultOrNull: io.nitric.proto.deploy.v1.UpResult?
  get() = if (hasResult()) getResult() else null

