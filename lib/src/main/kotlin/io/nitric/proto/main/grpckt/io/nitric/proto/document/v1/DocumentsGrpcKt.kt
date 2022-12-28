package io.nitric.proto.document.v1

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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.nitric.proto.document.v1.DocumentServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for nitric.document.v1.DocumentService.
 */
public object DocumentServiceGrpcKt {
  public const val SERVICE_NAME: String = DocumentServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = DocumentServiceGrpc.getServiceDescriptor()

  public val getMethod: MethodDescriptor<DocumentGetRequest, DocumentGetResponse>
    @JvmStatic
    get() = DocumentServiceGrpc.getGetMethod()

  public val setMethod: MethodDescriptor<DocumentSetRequest, DocumentSetResponse>
    @JvmStatic
    get() = DocumentServiceGrpc.getSetMethod()

  public val deleteMethod: MethodDescriptor<DocumentDeleteRequest, DocumentDeleteResponse>
    @JvmStatic
    get() = DocumentServiceGrpc.getDeleteMethod()

  public val queryMethod: MethodDescriptor<DocumentQueryRequest, DocumentQueryResponse>
    @JvmStatic
    get() = DocumentServiceGrpc.getQueryMethod()

  public val queryStreamMethod:
      MethodDescriptor<DocumentQueryStreamRequest, DocumentQueryStreamResponse>
    @JvmStatic
    get() = DocumentServiceGrpc.getQueryStreamMethod()

  /**
   * A stub for issuing RPCs to a(n) nitric.document.v1.DocumentService service as suspending
   * coroutines.
   */
  @StubFor(DocumentServiceGrpc::class)
  public class DocumentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DocumentServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        DocumentServiceCoroutineStub = DocumentServiceCoroutineStub(channel, callOptions)

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
    public suspend fun `get`(request: DocumentGetRequest, headers: Metadata = Metadata()):
        DocumentGetResponse = unaryRpc(
      channel,
      DocumentServiceGrpc.getGetMethod(),
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
    public suspend fun `set`(request: DocumentSetRequest, headers: Metadata = Metadata()):
        DocumentSetResponse = unaryRpc(
      channel,
      DocumentServiceGrpc.getSetMethod(),
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
    public suspend fun delete(request: DocumentDeleteRequest, headers: Metadata = Metadata()):
        DocumentDeleteResponse = unaryRpc(
      channel,
      DocumentServiceGrpc.getDeleteMethod(),
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
    public suspend fun query(request: DocumentQueryRequest, headers: Metadata = Metadata()):
        DocumentQueryResponse = unaryRpc(
      channel,
      DocumentServiceGrpc.getQueryMethod(),
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
    public fun queryStream(request: DocumentQueryStreamRequest, headers: Metadata = Metadata()):
        Flow<DocumentQueryStreamResponse> = serverStreamingRpc(
      channel,
      DocumentServiceGrpc.getQueryStreamMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the nitric.document.v1.DocumentService service based on Kotlin
   * coroutines.
   */
  public abstract class DocumentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for nitric.document.v1.DocumentService.Get.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun `get`(request: DocumentGetRequest): DocumentGetResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.document.v1.DocumentService.Get is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.document.v1.DocumentService.Set.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun `set`(request: DocumentSetRequest): DocumentSetResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.document.v1.DocumentService.Set is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.document.v1.DocumentService.Delete.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun delete(request: DocumentDeleteRequest): DocumentDeleteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.document.v1.DocumentService.Delete is unimplemented"))

    /**
     * Returns the response to an RPC for nitric.document.v1.DocumentService.Query.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun query(request: DocumentQueryRequest): DocumentQueryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.document.v1.DocumentService.Query is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for nitric.document.v1.DocumentService.QueryStream.
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
    public open fun queryStream(request: DocumentQueryStreamRequest):
        Flow<DocumentQueryStreamResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method nitric.document.v1.DocumentService.QueryStream is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DocumentServiceGrpc.getGetMethod(),
      implementation = ::`get`
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DocumentServiceGrpc.getSetMethod(),
      implementation = ::`set`
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DocumentServiceGrpc.getDeleteMethod(),
      implementation = ::delete
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DocumentServiceGrpc.getQueryMethod(),
      implementation = ::query
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = DocumentServiceGrpc.getQueryStreamMethod(),
      implementation = ::queryStream
    )).build()
  }
}
