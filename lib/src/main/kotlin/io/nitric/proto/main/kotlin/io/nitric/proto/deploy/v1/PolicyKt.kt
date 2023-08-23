//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

@kotlin.jvm.JvmName("-initializepolicy")
inline fun policy(block: io.nitric.proto.deploy.v1.PolicyKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.Policy =
  io.nitric.proto.deploy.v1.PolicyKt.Dsl._create(io.nitric.proto.deploy.v1.Policy.newBuilder()).apply { block() }._build()
object PolicyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.deploy.v1.Policy.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.deploy.v1.Policy.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.deploy.v1.Policy = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class PrincipalsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     */
     val principals: com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPrincipalsList()
      )
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     * @param value The principals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPrincipals")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.add(value: io.nitric.proto.deploy.v1.Resource) {
      _builder.addPrincipals(value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     * @param value The principals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPrincipals")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.plusAssign(value: io.nitric.proto.deploy.v1.Resource) {
      add(value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     * @param values The principals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPrincipals")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.addAll(values: kotlin.collections.Iterable<io.nitric.proto.deploy.v1.Resource>) {
      _builder.addAllPrincipals(values)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     * @param values The principals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPrincipals")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.plusAssign(values: kotlin.collections.Iterable<io.nitric.proto.deploy.v1.Resource>) {
      addAll(values)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     * @param index The index to set the value at.
     * @param value The principals to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPrincipals")
    operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.set(index: kotlin.Int, value: io.nitric.proto.deploy.v1.Resource) {
      _builder.setPrincipals(index, value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPrincipals")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, PrincipalsProxy>.clear() {
      _builder.clearPrincipals()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ActionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     */
     val actions: com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getActionsList()
      )
    /**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     * @param value The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addActions")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.add(value: io.nitric.proto.resource.v1.Action) {
      _builder.addActions(value)
    }/**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     * @param value The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignActions")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.plusAssign(value: io.nitric.proto.resource.v1.Action) {
      add(value)
    }/**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     * @param values The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllActions")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.addAll(values: kotlin.collections.Iterable<io.nitric.proto.resource.v1.Action>) {
      _builder.addAllActions(values)
    }/**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     * @param values The actions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllActions")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.plusAssign(values: kotlin.collections.Iterable<io.nitric.proto.resource.v1.Action>) {
      addAll(values)
    }/**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     * @param index The index to set the value at.
     * @param value The actions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setActions")
    operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.set(index: kotlin.Int, value: io.nitric.proto.resource.v1.Action) {
      _builder.setActions(index, value)
    }/**
     * <pre>
     * TODO: Split out discrete action definitions from resources
     * Also need to allow custom action types as well
     * Should incorporate action re-use here...
     * </pre>
     *
     * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearActions")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.resource.v1.Action, ActionsProxy>.clear() {
      _builder.clearActions()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class ResourcesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     */
     val resources: com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getResourcesList()
      )
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     * @param value The resources to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addResources")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.add(value: io.nitric.proto.deploy.v1.Resource) {
      _builder.addResources(value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     * @param value The resources to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignResources")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.plusAssign(value: io.nitric.proto.deploy.v1.Resource) {
      add(value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     * @param values The resources to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllResources")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.addAll(values: kotlin.collections.Iterable<io.nitric.proto.deploy.v1.Resource>) {
      _builder.addAllResources(values)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     * @param values The resources to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllResources")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.plusAssign(values: kotlin.collections.Iterable<io.nitric.proto.deploy.v1.Resource>) {
      addAll(values)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     * @param index The index to set the value at.
     * @param value The resources to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setResources")
    operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.set(index: kotlin.Int, value: io.nitric.proto.deploy.v1.Resource) {
      _builder.setResources(index, value)
    }
    /**
     * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearResources")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.deploy.v1.Resource, ResourcesProxy>.clear() {
      _builder.clearResources()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.deploy.v1.Policy.copy(block: io.nitric.proto.deploy.v1.PolicyKt.Dsl.() -> kotlin.Unit): io.nitric.proto.deploy.v1.Policy =
  io.nitric.proto.deploy.v1.PolicyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

