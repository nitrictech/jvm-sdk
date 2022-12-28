package io.nitric.proto.event.v1

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.nitric.proto.event.v1.EventServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.event.v1.EventService.
 */
public object EventServiceGrpcKt {
  public const val SERVICE_NAME: String = EventServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = EventServiceGrpc.getServiceDescriptor()

  public val publishMethod: MethodDescriptor<EventPublishRequest, EventPublishResponse>
    @JvmStatic
    get() = EventServiceGrpc.getPublishMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.event.v1.EventService service as suspending coroutines.
   */
  @StubFor(EventServiceGrpc::class)
  public class EventServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EventServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): EventServiceCoroutineStub
        = EventServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun publish(request: EventPublishRequest, headers: Metadata = Metadata()):
        EventPublishResponse = unaryRpc(
      channel,
      EventServiceGrpc.getPublishMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.event.v1.EventService service based on Kotlin coroutines.
   */
  public abstract class EventServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.event.v1.EventService.Publish.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publish(request: EventPublishRequest): EventPublishResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.event.v1.EventService.Publish is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getPublishMethod(),
      implementation = ::publish
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.event.v1.TopicService.
 */
public object TopicServiceGrpcKt {
  public const val SERVICE_NAME: String = TopicServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = TopicServiceGrpc.getServiceDescriptor()

  public val listMethod: MethodDescriptor<TopicListRequest, TopicListResponse>
    @JvmStatic
    get() = TopicServiceGrpc.getListMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.event.v1.TopicService service as suspending coroutines.
   */
  @StubFor(TopicServiceGrpc::class)
  public class TopicServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TopicServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): TopicServiceCoroutineStub
        = TopicServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun list(request: TopicListRequest, headers: Metadata = Metadata()):
        TopicListResponse = unaryRpc(
      channel,
      TopicServiceGrpc.getListMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.event.v1.TopicService service based on Kotlin coroutines.
   */
  public abstract class TopicServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.event.v1.TopicService.List.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun list(request: TopicListRequest): TopicListResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.event.v1.TopicService.List is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(TopicServiceGrpc.getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TopicServiceGrpc.getListMethod(),
      implementation = ::list
    )).build()
  }
}
