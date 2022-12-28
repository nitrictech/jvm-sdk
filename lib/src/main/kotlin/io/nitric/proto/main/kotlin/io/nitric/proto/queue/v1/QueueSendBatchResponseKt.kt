//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

@kotlin.jvm.JvmName("-initializequeueSendBatchResponse")
inline fun queueSendBatchResponse(block: io.nitric.proto.queue.v1.QueueSendBatchResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueSendBatchResponse =
  io.nitric.proto.queue.v1.QueueSendBatchResponseKt.Dsl._create(io.nitric.proto.queue.v1.QueueSendBatchResponse.newBuilder()).apply { block() }._build()
object QueueSendBatchResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.queue.v1.QueueSendBatchResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.queue.v1.QueueSendBatchResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.queue.v1.QueueSendBatchResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class FailedTasksProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
     val failedTasks: com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFailedTasksList()
      )
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     * @param value The failedTasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFailedTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.add(value: io.nitric.proto.queue.v1.FailedTask) {
      _builder.addFailedTasks(value)
    }
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     * @param value The failedTasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFailedTasks")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.plusAssign(value: io.nitric.proto.queue.v1.FailedTask) {
      add(value)
    }
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     * @param values The failedTasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFailedTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.addAll(values: kotlin.collections.Iterable<io.nitric.proto.queue.v1.FailedTask>) {
      _builder.addAllFailedTasks(values)
    }
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     * @param values The failedTasks to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFailedTasks")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.plusAssign(values: kotlin.collections.Iterable<io.nitric.proto.queue.v1.FailedTask>) {
      addAll(values)
    }
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     * @param index The index to set the value at.
     * @param value The failedTasks to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFailedTasks")
    operator fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.set(index: kotlin.Int, value: io.nitric.proto.queue.v1.FailedTask) {
      _builder.setFailedTasks(index, value)
    }
    /**
     * <pre>
     * A list of tasks that failed to be queued
     * </pre>
     *
     * <code>repeated .nitric.queue.v1.FailedTask failedTasks = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFailedTasks")
    fun com.google.protobuf.kotlin.DslList<io.nitric.proto.queue.v1.FailedTask, FailedTasksProxy>.clear() {
      _builder.clearFailedTasks()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.queue.v1.QueueSendBatchResponse.copy(block: io.nitric.proto.queue.v1.QueueSendBatchResponseKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueSendBatchResponse =
  io.nitric.proto.queue.v1.QueueSendBatchResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

