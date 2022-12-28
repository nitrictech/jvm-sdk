package io.nitric.proto.secret.v1

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
import io.nitric.proto.secret.v1.SecretServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.secret.v1.SecretService.
 */
public object SecretServiceGrpcKt {
  public const val SERVICE_NAME: String = SecretServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = SecretServiceGrpc.getServiceDescriptor()

  public val putMethod: MethodDescriptor<SecretPutRequest, SecretPutResponse>
    @JvmStatic
    get() = SecretServiceGrpc.getPutMethod()

  public val accessMethod: MethodDescriptor<SecretAccessRequest, SecretAccessResponse>
    @JvmStatic
    get() = SecretServiceGrpc.getAccessMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.secret.v1.SecretService service as suspending
   * coroutines.
   */
  @StubFor(SecretServiceGrpc::class)
  public class SecretServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SecretServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        SecretServiceCoroutineStub = SecretServiceCoroutineStub(channel, callOptions)

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
    public suspend fun put(request: SecretPutRequest, headers: Metadata = Metadata()):
        SecretPutResponse = unaryRpc(
      channel,
      SecretServiceGrpc.getPutMethod(),
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
    public suspend fun access(request: SecretAccessRequest, headers: Metadata = Metadata()):
        SecretAccessResponse = unaryRpc(
      channel,
      SecretServiceGrpc.getAccessMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.secret.v1.SecretService service based on Kotlin
   * coroutines.
   */
  public abstract class SecretServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.secret.v1.SecretService.Put.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun put(request: SecretPutRequest): SecretPutResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.secret.v1.SecretService.Put is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.secret.v1.SecretService.Access.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun access(request: SecretAccessRequest): SecretAccessResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.secret.v1.SecretService.Access is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SecretServiceGrpc.getPutMethod(),
      implementation = ::put
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SecretServiceGrpc.getAccessMethod(),
      implementation = ::access
    )).build()
  }
}
