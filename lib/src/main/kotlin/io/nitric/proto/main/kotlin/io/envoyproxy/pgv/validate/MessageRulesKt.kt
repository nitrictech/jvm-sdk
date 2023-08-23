//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

@kotlin.jvm.JvmName("-initializemessageRules")
inline fun messageRules(block: io.envoyproxy.pgv.validate.MessageRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.MessageRules =
  io.envoyproxy.pgv.validate.MessageRulesKt.Dsl._create(io.envoyproxy.pgv.validate.Validate.MessageRules.newBuilder()).apply { block() }._build()
object MessageRulesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.envoyproxy.pgv.validate.Validate.MessageRules.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.envoyproxy.pgv.validate.Validate.MessageRules.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.envoyproxy.pgv.validate.Validate.MessageRules = _builder.build()

    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    var skip: kotlin.Boolean
      @JvmName("getSkip")
      get() = _builder.getSkip()
      @JvmName("setSkip")
      set(value) {
        _builder.setSkip(value)
      }
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     */
    fun clearSkip() {
      _builder.clearSkip()
    }
    /**
     * <pre>
     * Skip specifies that the validation rules of this field should not be
     * evaluated
     * </pre>
     *
     * <code>optional bool skip = 1;</code>
     * @return Whether the skip field is set.
     */
    fun hasSkip(): kotlin.Boolean {
      return _builder.hasSkip()
    }

    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    var required: kotlin.Boolean
      @JvmName("getRequired")
      get() = _builder.getRequired()
      @JvmName("setRequired")
      set(value) {
        _builder.setRequired(value)
      }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     */
    fun clearRequired() {
      _builder.clearRequired()
    }
    /**
     * <pre>
     * Required specifies that this field must be set
     * </pre>
     *
     * <code>optional bool required = 2;</code>
     * @return Whether the required field is set.
     */
    fun hasRequired(): kotlin.Boolean {
      return _builder.hasRequired()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.envoyproxy.pgv.validate.Validate.MessageRules.copy(block: io.envoyproxy.pgv.validate.MessageRulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.MessageRules =
  io.envoyproxy.pgv.validate.MessageRulesKt.Dsl._create(this.toBuilder()).apply { block() }._build()

