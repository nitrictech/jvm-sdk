//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

@kotlin.jvm.JvmName("-initializetopicListRequest")
inline fun topicListRequest(block: io.nitric.proto.event.v1.TopicListRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.event.v1.TopicListRequest =
  io.nitric.proto.event.v1.TopicListRequestKt.Dsl._create(io.nitric.proto.event.v1.TopicListRequest.newBuilder()).apply { block() }._build()
object TopicListRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: io.nitric.proto.event.v1.TopicListRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.nitric.proto.event.v1.TopicListRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.nitric.proto.event.v1.TopicListRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun io.nitric.proto.event.v1.TopicListRequest.copy(block: io.nitric.proto.event.v1.TopicListRequestKt.Dsl.() -> kotlin.Unit): io.nitric.proto.event.v1.TopicListRequest =
  io.nitric.proto.event.v1.TopicListRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

