package io.nitric.proto.resource.v1

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
import io.nitric.proto.resource.v1.ResourceServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.resource.v1.ResourceService.
 */
public object ResourceServiceGrpcKt {
  public const val SERVICE_NAME: String = ResourceServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = ResourceServiceGrpc.getServiceDescriptor()

  public val declareMethod: MethodDescriptor<ResourceDeclareRequest, ResourceDeclareResponse>
    @JvmStatic
    get() = ResourceServiceGrpc.getDeclareMethod()

  public val detailsMethod: MethodDescriptor<ResourceDetailsRequest, ResourceDetailsResponse>
    @JvmStatic
    get() = ResourceServiceGrpc.getDetailsMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.resource.v1.ResourceService service as suspending
   * coroutines.
   */
  @StubFor(ResourceServiceGrpc::class)
  public class ResourceServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ResourceServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        ResourceServiceCoroutineStub = ResourceServiceCoroutineStub(channel, callOptions)

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
    public suspend fun declare(request: ResourceDeclareRequest, headers: Metadata = Metadata()):
        ResourceDeclareResponse = unaryRpc(
      channel,
      ResourceServiceGrpc.getDeclareMethod(),
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
    public suspend fun details(request: ResourceDetailsRequest, headers: Metadata = Metadata()):
        ResourceDetailsResponse = unaryRpc(
      channel,
      ResourceServiceGrpc.getDetailsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.resource.v1.ResourceService service based on Kotlin
   * coroutines.
   */
  public abstract class ResourceServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.resource.v1.ResourceService.Declare.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun declare(request: ResourceDeclareRequest): ResourceDeclareResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.resource.v1.ResourceService.Declare is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.resource.v1.ResourceService.Details.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun details(request: ResourceDetailsRequest): ResourceDetailsResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.resource.v1.ResourceService.Details is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ResourceServiceGrpc.getDeclareMethod(),
      implementation = ::declare
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ResourceServiceGrpc.getDetailsMethod(),
      implementation = ::details
    )).build()
  }
}
