//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

@kotlin.jvm.JvmName("-initializeexpressionValue")
inline fun expressionValue(block: io.nitric.proto.document.v1.ExpressionValueKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.ExpressionValue =
  io.nitric.proto.document.v1.ExpressionValueKt.Dsl._create(io.nitric.proto.document.v1.ExpressionValue.newBuilder()).apply { block() }._build()
object ExpressionValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.document.v1.ExpressionValue.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.document.v1.ExpressionValue.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.document.v1.ExpressionValue = _builder.build()

    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     */
    var intValue: kotlin.Long
      @JvmName("getIntValue")
      get() = _builder.getIntValue()
      @JvmName("setIntValue")
      set(value) {
        _builder.setIntValue(value)
      }
    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     */
    fun clearIntValue() {
      _builder.clearIntValue()
    }
    /**
     * <pre>
     * Represents an integer value.
     * </pre>
     *
     * <code>int64 int_value = 1;</code>
     * @return Whether the intValue field is set.
     */
    fun hasIntValue(): kotlin.Boolean {
      return _builder.hasIntValue()
    }

    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     */
    var doubleValue: kotlin.Double
      @JvmName("getDoubleValue")
      get() = _builder.getDoubleValue()
      @JvmName("setDoubleValue")
      set(value) {
        _builder.setDoubleValue(value)
      }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     */
    fun clearDoubleValue() {
      _builder.clearDoubleValue()
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>double double_value = 2;</code>
     * @return Whether the doubleValue field is set.
     */
    fun hasDoubleValue(): kotlin.Boolean {
      return _builder.hasDoubleValue()
    }

    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     */
    var stringValue: kotlin.String
      @JvmName("getStringValue")
      get() = _builder.getStringValue()
      @JvmName("setStringValue")
      set(value) {
        _builder.setStringValue(value)
      }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     */
    fun clearStringValue() {
      _builder.clearStringValue()
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>string string_value = 3;</code>
     * @return Whether the stringValue field is set.
     */
    fun hasStringValue(): kotlin.Boolean {
      return _builder.hasStringValue()
    }

    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     */
    var boolValue: kotlin.Boolean
      @JvmName("getBoolValue")
      get() = _builder.getBoolValue()
      @JvmName("setBoolValue")
      set(value) {
        _builder.setBoolValue(value)
      }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     */
    fun clearBoolValue() {
      _builder.clearBoolValue()
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>bool bool_value = 4;</code>
     * @return Whether the boolValue field is set.
     */
    fun hasBoolValue(): kotlin.Boolean {
      return _builder.hasBoolValue()
    }
    val kindCase: io.nitric.proto.document.v1.ExpressionValue.KindCase
      @JvmName("getKindCase")
      get() = _builder.getKindCase()

    fun clearKind() {
      _builder.clearKind()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.document.v1.ExpressionValue.copy(block: io.nitric.proto.document.v1.ExpressionValueKt.Dsl.() -> kotlin.Unit): io.nitric.proto.document.v1.ExpressionValue =
  io.nitric.proto.document.v1.ExpressionValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

