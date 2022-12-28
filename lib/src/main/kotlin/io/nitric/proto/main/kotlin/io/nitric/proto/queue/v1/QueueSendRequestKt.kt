//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

@kotlin.jvm.JvmName("-initializequeueSendRequest")
inline fun queueSendRequest(block: io.nitric.proto.queue.v1.QueueSendRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueSendRequest =
  io.nitric.proto.queue.v1.QueueSendRequestKt.Dsl._create(io.nitric.proto.queue.v1.QueueSendRequest.newBuilder()).apply { block() }._build()
object QueueSendRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.queue.v1.QueueSendRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.queue.v1.QueueSendRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.queue.v1.QueueSendRequest = _builder.build()

    /**
     * <pre>
     * The Nitric name for the queue
     * this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1 [(.validate.rules) = { ... }</code>
     */
    var queue: kotlin.String
      @JvmName("getQueue")
      get() = _builder.getQueue()
      @JvmName("setQueue")
      set(value) {
        _builder.setQueue(value)
      }
    /**
     * <pre>
     * The Nitric name for the queue
     * this will automatically be resolved to the provider specific queue identifier.
     * </pre>
     *
     * <code>string queue = 1 [(.validate.rules) = { ... }</code>
     */
    fun clearQueue() {
      _builder.clearQueue()
    }

    /**
     * <pre>
     * The task to push to the queue
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
     */
    var task: io.nitric.proto.queue.v1.NitricTask
      @JvmName("getTask")
      get() = _builder.getTask()
      @JvmName("setTask")
      set(value) {
        _builder.setTask(value)
      }
    /**
     * <pre>
     * The task to push to the queue
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
     */
    fun clearTask() {
      _builder.clearTask()
    }
    /**
     * <pre>
     * The task to push to the queue
     * </pre>
     *
     * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the task field is set.
     */
    fun hasTask(): kotlin.Boolean {
      return _builder.hasTask()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.queue.v1.QueueSendRequest.copy(block: io.nitric.proto.queue.v1.QueueSendRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.queue.v1.QueueSendRequest =
  io.nitric.proto.queue.v1.QueueSendRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.queue.v1.QueueSendRequestOrBuilder.taskOrNull: io.nitric.proto.queue.v1.NitricTask?
  get() = if (hasTask()) getTask() else null

