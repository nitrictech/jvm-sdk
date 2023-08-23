package io.nitric.proto.deploy.v1

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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.nitric.proto.deploy.v1.DeployServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.deploy.v1.DeployService.
 */
public object DeployServiceGrpcKt {
  public const val SERVICE_NAME: String = DeployServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = DeployServiceGrpc.getServiceDescriptor()

  public val upMethod: MethodDescriptor<DeployUpRequest, DeployUpEvent>
    @JvmStatic
    get() = DeployServiceGrpc.getUpMethod()

  public val downMethod: MethodDescriptor<DeployDownRequest, DeployDownEvent>
    @JvmStatic
    get() = DeployServiceGrpc.getDownMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.deploy.v1.DeployService service as suspending
   * coroutines.
   */
  @StubFor(DeployServiceGrpc::class)
  public class DeployServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DeployServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        DeployServiceCoroutineStub = DeployServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun up(request: DeployUpRequest, headers: Metadata = Metadata()): Flow<DeployUpEvent> =
        serverStreamingRpc(
      channel,
      DeployServiceGrpc.getUpMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun down(request: DeployDownRequest, headers: Metadata = Metadata()):
        Flow<DeployDownEvent> = serverStreamingRpc(
      channel,
      DeployServiceGrpc.getDownMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.deploy.v1.DeployService service based on Kotlin
   * coroutines.
   */
  public abstract class DeployServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for nitric.deploy.v1.DeployService.Up.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun up(request: DeployUpRequest): Flow<DeployUpEvent> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.deploy.v1.DeployService.Up is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for nitric.deploy.v1.DeployService.Down.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun down(request: DeployDownRequest): Flow<DeployDownEvent> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.deploy.v1.DeployService.Down is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = DeployServiceGrpc.getUpMethod(),
      implementation = ::up
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = DeployServiceGrpc.getDownMethod(),
      implementation = ::down
    )).build()
  }
}
