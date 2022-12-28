//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

@kotlin.jvm.JvmName("-initializequeueReceiveResponse")
inline fun queueReceiveResponse(block: io.nitric.proto.queue.v1.QueueReceiveResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueReceiveResponse =
  io.nitric.proto.queue.v1.QueueReceiveResponseKt.Dsl._create(io.nitric.proto.queue.v1.QueueReceiveResponse.newBuilder()).apply { block() }._build()
object QueueReceiveResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.queue.v1.QueueReceiveResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.queue.v1.QueueReceiveResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.queue.v1.QueueReceiveResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class TasksProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     */
     val tasks: com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTasksList()
      )
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     * @param value The tasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.add(value: io.nitric.proto.queue.v1.NitricTask) {
      _builder.addTasks(value)
    }
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     * @param value The tasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTasks")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.plusAssign(value: io.nitric.proto.queue.v1.NitricTask) {
      add(value)
    }
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     * @param values The tasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.addAll(values: kotlin.collections.Iterable<io.nitric.proto.queue.v1.NitricTask>) {
      _builder.addAllTasks(values)
    }
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     * @param values The tasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTasks")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.plusAssign(values: kotlin.collections.Iterable<io.nitric.proto.queue.v1.NitricTask>) {
      addAll(values)
    }
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     * @param index The index to set the value at.
     * @param value The tasks to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTasks")
    operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.set(index: kotlin.Int, value: io.nitric.proto.queue.v1.NitricTask) {
      _builder.setTasks(index, value)
    }
    /**
     * <pre>
     * Array of tasks popped off the queue
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.NitricTask tasks = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.NitricTask, TasksProxy>.clear() {
      _builder.clearTasks()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.queue.v1.QueueReceiveResponse.copy(block: io.nitric.proto.queue.v1.QueueReceiveResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueReceiveResponse =
  io.nitric.proto.queue.v1.QueueReceiveResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

