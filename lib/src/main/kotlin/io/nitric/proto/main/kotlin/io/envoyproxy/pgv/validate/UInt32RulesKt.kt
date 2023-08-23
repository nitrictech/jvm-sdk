//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: validate/validate.proto

package io.envoyproxy.pgv.validate;

@kotlin.jvm.JvmName("-initializeuInt32Rules")
inline fun uInt32Rules(block: io.envoyproxy.pgv.validate.UInt32RulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.UInt32Rules =
  io.envoyproxy.pgv.validate.UInt32RulesKt.Dsl._create(io.envoyproxy.pgv.validate.Validate.UInt32Rules.newBuilder()).apply { block() }._build()
object UInt32RulesKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.envoyproxy.pgv.validate.Validate.UInt32Rules.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.envoyproxy.pgv.validate.Validate.UInt32Rules.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.envoyproxy.pgv.validate.Validate.UInt32Rules = _builder.build()

    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional uint32 const = 1;</code>
     */
    var const: kotlin.Int
      @JvmName("getConst")
      get() = _builder.getConst()
      @JvmName("setConst")
      set(value) {
        _builder.setConst(value)
      }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional uint32 const = 1;</code>
     */
    fun clearConst() {
      _builder.clearConst()
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional uint32 const = 1;</code>
     * @return Whether the const field is set.
     */
    fun hasConst(): kotlin.Boolean {
      return _builder.hasConst()
    }

    /**
     * <pre>
     * Lt specifies that this field must be less than the specified value,
     * exclusive
     * </pre>
     *
     * <code>optional uint32 lt = 2;</code>
     */
    var lt: kotlin.Int
      @JvmName("getLt")
      get() = _builder.getLt()
      @JvmName("setLt")
      set(value) {
        _builder.setLt(value)
      }
    /**
     * <pre>
     * Lt specifies that this field must be less than the specified value,
     * exclusive
     * </pre>
     *
     * <code>optional uint32 lt = 2;</code>
     */
    fun clearLt() {
      _builder.clearLt()
    }
    /**
     * <pre>
     * Lt specifies that this field must be less than the specified value,
     * exclusive
     * </pre>
     *
     * <code>optional uint32 lt = 2;</code>
     * @return Whether the lt field is set.
     */
    fun hasLt(): kotlin.Boolean {
      return _builder.hasLt()
    }

    /**
     * <pre>
     * Lte specifies that this field must be less than or equal to the
     * specified value, inclusive
     * </pre>
     *
     * <code>optional uint32 lte = 3;</code>
     */
    var lte: kotlin.Int
      @JvmName("getLte")
      get() = _builder.getLte()
      @JvmName("setLte")
      set(value) {
        _builder.setLte(value)
      }
    /**
     * <pre>
     * Lte specifies that this field must be less than or equal to the
     * specified value, inclusive
     * </pre>
     *
     * <code>optional uint32 lte = 3;</code>
     */
    fun clearLte() {
      _builder.clearLte()
    }
    /**
     * <pre>
     * Lte specifies that this field must be less than or equal to the
     * specified value, inclusive
     * </pre>
     *
     * <code>optional uint32 lte = 3;</code>
     * @return Whether the lte field is set.
     */
    fun hasLte(): kotlin.Boolean {
      return _builder.hasLte()
    }

    /**
     * <pre>
     * Gt specifies that this field must be greater than the specified value,
     * exclusive. If the value of Gt is larger than a specified Lt or Lte, the
     * range is reversed.
     * </pre>
     *
     * <code>optional uint32 gt = 4;</code>
     */
    var gt: kotlin.Int
      @JvmName("getGt")
      get() = _builder.getGt()
      @JvmName("setGt")
      set(value) {
        _builder.setGt(value)
      }
    /**
     * <pre>
     * Gt specifies that this field must be greater than the specified value,
     * exclusive. If the value of Gt is larger than a specified Lt or Lte, the
     * range is reversed.
     * </pre>
     *
     * <code>optional uint32 gt = 4;</code>
     */
    fun clearGt() {
      _builder.clearGt()
    }
    /**
     * <pre>
     * Gt specifies that this field must be greater than the specified value,
     * exclusive. If the value of Gt is larger than a specified Lt or Lte, the
     * range is reversed.
     * </pre>
     *
     * <code>optional uint32 gt = 4;</code>
     * @return Whether the gt field is set.
     */
    fun hasGt(): kotlin.Boolean {
      return _builder.hasGt()
    }

    /**
     * <pre>
     * Gte specifies that this field must be greater than or equal to the
     * specified value, inclusive. If the value of Gte is larger than a
     * specified Lt or Lte, the range is reversed.
     * </pre>
     *
     * <code>optional uint32 gte = 5;</code>
     */
    var gte: kotlin.Int
      @JvmName("getGte")
      get() = _builder.getGte()
      @JvmName("setGte")
      set(value) {
        _builder.setGte(value)
      }
    /**
     * <pre>
     * Gte specifies that this field must be greater than or equal to the
     * specified value, inclusive. If the value of Gte is larger than a
     * specified Lt or Lte, the range is reversed.
     * </pre>
     *
     * <code>optional uint32 gte = 5;</code>
     */
    fun clearGte() {
      _builder.clearGte()
    }
    /**
     * <pre>
     * Gte specifies that this field must be greater than or equal to the
     * specified value, inclusive. If the value of Gte is larger than a
     * specified Lt or Lte, the range is reversed.
     * </pre>
     *
     * <code>optional uint32 gte = 5;</code>
     * @return Whether the gte field is set.
     */
    fun hasGte(): kotlin.Boolean {
      return _builder.hasGte()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class In_Proxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     */
     val in_: com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInList()
      )
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     * @param value The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIn_")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.add(value: kotlin.Int) {
      _builder.addIn(value)
    }/**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     * @param value The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIn_")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     * @param values The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIn_")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllIn(values)
    }/**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     * @param values The in to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIn_")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     * @param index The index to set the value at.
     * @param value The in to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIn_")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setIn(index, value)
    }/**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 in = 6;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIn_")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, In_Proxy>.clear() {
      _builder.clearIn()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class NotInProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     */
     val notIn: com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNotInList()
      )
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     * @param value The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNotIn")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.add(value: kotlin.Int) {
      _builder.addNotIn(value)
    }/**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     * @param value The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNotIn")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     * @param values The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNotIn")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllNotIn(values)
    }/**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     * @param values The notIn to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNotIn")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     * @param index The index to set the value at.
     * @param value The notIn to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNotIn")
    operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setNotIn(index, value)
    }/**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated uint32 not_in = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNotIn")
    fun com.google.protobuf.kotlin.DslList<kotlin.Int, NotInProxy>.clear() {
      _builder.clearNotIn()
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 8;</code>
     */
    var ignoreEmpty: kotlin.Boolean
      @JvmName("getIgnoreEmpty")
      get() = _builder.getIgnoreEmpty()
      @JvmName("setIgnoreEmpty")
      set(value) {
        _builder.setIgnoreEmpty(value)
      }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 8;</code>
     */
    fun clearIgnoreEmpty() {
      _builder.clearIgnoreEmpty()
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 8;</code>
     * @return Whether the ignoreEmpty field is set.
     */
    fun hasIgnoreEmpty(): kotlin.Boolean {
      return _builder.hasIgnoreEmpty()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.envoyproxy.pgv.validate.Validate.UInt32Rules.copy(block: io.envoyproxy.pgv.validate.UInt32RulesKt.Dsl.() -> kotlin.Unit): io.envoyproxy.pgv.validate.Validate.UInt32Rules =
  io.envoyproxy.pgv.validate.UInt32RulesKt.Dsl._create(this.toBuilder()).apply { block() }._build()

