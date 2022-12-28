package io.nitric.proto.storage.v1

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
import io.nitric.proto.storage.v1.StorageServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.storage.v1.StorageService.
 */
public object StorageServiceGrpcKt {
  public const val SERVICE_NAME: String = StorageServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = StorageServiceGrpc.getServiceDescriptor()

  public val readMethod: MethodDescriptor<StorageReadRequest, StorageReadResponse>
    @JvmStatic
    get() = StorageServiceGrpc.getReadMethod()

  public val writeMethod: MethodDescriptor<StorageWriteRequest, StorageWriteResponse>
    @JvmStatic
    get() = StorageServiceGrpc.getWriteMethod()

  public val deleteMethod: MethodDescriptor<StorageDeleteRequest, StorageDeleteResponse>
    @JvmStatic
    get() = StorageServiceGrpc.getDeleteMethod()

  public val preSignUrlMethod: MethodDescriptor<StoragePreSignUrlRequest, StoragePreSignUrlResponse>
    @JvmStatic
    get() = StorageServiceGrpc.getPreSignUrlMethod()

  public val listFilesMethod: MethodDescriptor<StorageListFilesRequest, StorageListFilesResponse>
    @JvmStatic
    get() = StorageServiceGrpc.getListFilesMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.storage.v1.StorageService service as suspending
   * coroutines.
   */
  @StubFor(StorageServiceGrpc::class)
  public class StorageServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<StorageServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        StorageServiceCoroutineStub = StorageServiceCoroutineStub(channel, callOptions)

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
    public suspend fun read(request: StorageReadRequest, headers: Metadata = Metadata()):
        StorageReadResponse = unaryRpc(
      channel,
      StorageServiceGrpc.getReadMethod(),
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
    public suspend fun write(request: StorageWriteRequest, headers: Metadata = Metadata()):
        StorageWriteResponse = unaryRpc(
      channel,
      StorageServiceGrpc.getWriteMethod(),
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
    public suspend fun delete(request: StorageDeleteRequest, headers: Metadata = Metadata()):
        StorageDeleteResponse = unaryRpc(
      channel,
      StorageServiceGrpc.getDeleteMethod(),
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
    public suspend fun preSignUrl(request: StoragePreSignUrlRequest, headers: Metadata =
        Metadata()): StoragePreSignUrlResponse = unaryRpc(
      channel,
      StorageServiceGrpc.getPreSignUrlMethod(),
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
    public suspend fun listFiles(request: StorageListFilesRequest, headers: Metadata = Metadata()):
        StorageListFilesResponse = unaryRpc(
      channel,
      StorageServiceGrpc.getListFilesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.storage.v1.StorageService service based on Kotlin
   * coroutines.
   */
  public abstract class StorageServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.storage.v1.StorageService.Read.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun read(request: StorageReadRequest): StorageReadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.storage.v1.StorageService.Read is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.storage.v1.StorageService.Write.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun write(request: StorageWriteRequest): StorageWriteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.storage.v1.StorageService.Write is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.storage.v1.StorageService.Delete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun delete(request: StorageDeleteRequest): StorageDeleteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.storage.v1.StorageService.Delete is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.storage.v1.StorageService.PreSignUrl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun preSignUrl(request: StoragePreSignUrlRequest): StoragePreSignUrlResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.storage.v1.StorageService.PreSignUrl is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.storage.v1.StorageService.ListFiles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listFiles(request: StorageListFilesRequest): StorageListFilesResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.storage.v1.StorageService.ListFiles is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = StorageServiceGrpc.getReadMethod(),
      implementation = ::read
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = StorageServiceGrpc.getWriteMethod(),
      implementation = ::write
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = StorageServiceGrpc.getDeleteMethod(),
      implementation = ::delete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = StorageServiceGrpc.getPreSignUrlMethod(),
      implementation = ::preSignUrl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = StorageServiceGrpc.getListFilesMethod(),
      implementation = ::listFiles
    )).build()
  }
}
