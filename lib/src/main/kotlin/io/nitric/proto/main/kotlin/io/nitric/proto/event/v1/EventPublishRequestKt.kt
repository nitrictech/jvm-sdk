//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

@kotlin.jvm.JvmName("-initializeeventPublishRequest")
inline fun eventPublishRequest(block: io.nitric.proto.event.v1.EventPublishRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.event.v1.EventPublishRequest =
  io.nitric.proto.event.v1.EventPublishRequestKt.Dsl._create(io.nitric.proto.event.v1.EventPublishRequest.newBuilder()).apply { block() }._build()
object EventPublishRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.event.v1.EventPublishRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.event.v1.EventPublishRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.event.v1.EventPublishRequest = _builder.build()

    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1 [(.validate.rules) = { ... }</code>
     */
    var topic: kotlin.String
      @JvmName("getTopic")
      get() = _builder.getTopic()
      @JvmName("setTopic")
      set(value) {
        _builder.setTopic(value)
      }
    /**
     * <pre>
     * The name of the topic to publish the event to
     * </pre>
     *
     * <code>string topic = 1 [(.validate.rules) = { ... }</code>
     */
    fun clearTopic() {
      _builder.clearTopic()
    }

    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    var event: io.nitric.proto.event.v1.NitricEvent
      @JvmName("getEvent")
      get() = _builder.getEvent()
      @JvmName("setEvent")
      set(value) {
        _builder.setEvent(value)
      }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     */
    fun clearEvent() {
      _builder.clearEvent()
    }
    /**
     * <pre>
     * The event to be published
     * </pre>
     *
     * <code>.nitric.event.v1.NitricEvent event = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the event field is set.
     */
    fun hasEvent(): kotlin.Boolean {
      return _builder.hasEvent()
    }

    /**
     * <pre>
     * An optional delay specified in seconds (minimum 10 seconds)
     * </pre>
     *
     * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
     */
    var delay: kotlin.Int
      @JvmName("getDelay")
      get() = _builder.getDelay()
      @JvmName("setDelay")
      set(value) {
        _builder.setDelay(value)
      }
    /**
     * <pre>
     * An optional delay specified in seconds (minimum 10 seconds)
     * </pre>
     *
     * <code>uint32 delay = 3 [(.validate.rules) = { ... }</code>
     */
    fun clearDelay() {
      _builder.clearDelay()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.event.v1.EventPublishRequest.copy(block: io.nitric.proto.event.v1.EventPublishRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.event.v1.EventPublishRequest =
  io.nitric.proto.event.v1.EventPublishRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val io.nitric.proto.event.v1.EventPublishRequestOrBuilder.eventOrNull: io.nitric.proto.event.v1.NitricEvent?
  get() = if (hasEvent()) getEvent() else null

