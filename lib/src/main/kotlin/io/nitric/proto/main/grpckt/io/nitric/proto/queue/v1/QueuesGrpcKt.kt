package io.nitric.proto.queue.v1

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
import io.nitric.proto.queue.v1.QueueServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.queue.v1.QueueService.
 */
public object QueueServiceGrpcKt {
  public const val SERVICE_NAME: String = QueueServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = QueueServiceGrpc.getServiceDescriptor()

  public val sendMethod: MethodDescriptor<QueueSendRequest, QueueSendResponse>
    @JvmStatic
    get() = QueueServiceGrpc.getSendMethod()

  public val sendBatchMethod: MethodDescriptor<QueueSendBatchRequest, QueueSendBatchResponse>
    @JvmStatic
    get() = QueueServiceGrpc.getSendBatchMethod()

  public val receiveMethod: MethodDescriptor<QueueReceiveRequest, QueueReceiveResponse>
    @JvmStatic
    get() = QueueServiceGrpc.getReceiveMethod()

  public val completeMethod: MethodDescriptor<QueueCompleteRequest, QueueCompleteResponse>
    @JvmStatic
    get() = QueueServiceGrpc.getCompleteMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.queue.v1.QueueService service as suspending coroutines.
   */
  @StubFor(QueueServiceGrpc::class)
  public class QueueServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<QueueServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions): QueueServiceCoroutineStub
        = QueueServiceCoroutineStub(channel, callOptions)

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
    public suspend fun send(request: QueueSendRequest, headers: Metadata = Metadata()):
        QueueSendResponse = unaryRpc(
      channel,
      QueueServiceGrpc.getSendMethod(),
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
    public suspend fun sendBatch(request: QueueSendBatchRequest, headers: Metadata = Metadata()):
        QueueSendBatchResponse = unaryRpc(
      channel,
      QueueServiceGrpc.getSendBatchMethod(),
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
    public suspend fun receive(request: QueueReceiveRequest, headers: Metadata = Metadata()):
        QueueReceiveResponse = unaryRpc(
      channel,
      QueueServiceGrpc.getReceiveMethod(),
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
    public suspend fun complete(request: QueueCompleteRequest, headers: Metadata = Metadata()):
        QueueCompleteResponse = unaryRpc(
      channel,
      QueueServiceGrpc.getCompleteMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.queue.v1.QueueService service based on Kotlin coroutines.
   */
  public abstract class QueueServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.queue.v1.QueueService.Send.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun send(request: QueueSendRequest): QueueSendResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.queue.v1.QueueService.Send is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.queue.v1.QueueService.SendBatch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendBatch(request: QueueSendBatchRequest): QueueSendBatchResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.queue.v1.QueueService.SendBatch is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.queue.v1.QueueService.Receive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun receive(request: QueueReceiveRequest): QueueReceiveResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.queue.v1.QueueService.Receive is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.queue.v1.QueueService.Complete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun complete(request: QueueCompleteRequest): QueueCompleteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.queue.v1.QueueService.Complete is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QueueServiceGrpc.getSendMethod(),
      implementation = ::send
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QueueServiceGrpc.getSendBatchMethod(),
      implementation = ::sendBatch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QueueServiceGrpc.getReceiveMethod(),
      implementation = ::receive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = QueueServiceGrpc.getCompleteMethod(),
      implementation = ::complete
    )).build()
  }
}
