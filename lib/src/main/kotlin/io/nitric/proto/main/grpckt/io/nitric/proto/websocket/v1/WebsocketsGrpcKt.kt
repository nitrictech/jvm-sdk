package io.nitric.proto.websocket.v1

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
import io.nitric.proto.websocket.v1.WebsocketServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * nitric.websocket.v1.WebsocketService.
 */
public object WebsocketServiceGrpcKt {
  public const val SERVICE_NAME: String = WebsocketServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = WebsocketServiceGrpc.getServiceDescriptor()

  public val sendMethod: MethodDescriptor<WebsocketSendRequest, WebsocketSendResponse>
    @JvmStatic
    get() = WebsocketServiceGrpc.getSendMethod()

  public val closeMethod: MethodDescriptor<WebsocketCloseRequest, WebsocketCloseResponse>
    @JvmStatic
    get() = WebsocketServiceGrpc.getCloseMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.websocket.v1.WebsocketService service as suspending
   * coroutines.
   */
  @StubFor(WebsocketServiceGrpc::class)
  public class WebsocketServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<WebsocketServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        WebsocketServiceCoroutineStub = WebsocketServiceCoroutineStub(channel, callOptions)

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
    public suspend fun send(request: WebsocketSendRequest, headers: Metadata = Metadata()):
        WebsocketSendResponse = unaryRpc(
      channel,
      WebsocketServiceGrpc.getSendMethod(),
      request,
      callOptions,
      headers
    )

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
    public suspend fun close(request: WebsocketCloseRequest, headers: Metadata = Metadata()):
        WebsocketCloseResponse = unaryRpc(
      channel,
      WebsocketServiceGrpc.getCloseMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.websocket.v1.WebsocketService service based on Kotlin
   * coroutines.
   */
  public abstract class WebsocketServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.websocket.v1.WebsocketService.Send.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun send(request: WebsocketSendRequest): WebsocketSendResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.websocket.v1.WebsocketService.Send is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.websocket.v1.WebsocketService.Close.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun close(request: WebsocketCloseRequest): WebsocketCloseResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.websocket.v1.WebsocketService.Close is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WebsocketServiceGrpc.getSendMethod(),
      implementation = ::send
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WebsocketServiceGrpc.getCloseMethod(),
      implementation = ::close
    )).build()
  }
}
