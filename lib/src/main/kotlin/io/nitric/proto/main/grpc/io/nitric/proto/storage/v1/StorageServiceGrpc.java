package io.nitric.proto.storage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: proto/storage/v1/storage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.storage.v1.StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageReadRequest,
      io.nitric.proto.storage.v1.StorageReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = io.nitric.proto.storage.v1.StorageReadRequest.class,
      responseType = io.nitric.proto.storage.v1.StorageReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageReadRequest,
      io.nitric.proto.storage.v1.StorageReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageReadRequest, io.nitric.proto.storage.v1.StorageReadResponse> getReadMethod;
    if ((getReadMethod = StorageServiceGrpc.getReadMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getReadMethod = StorageServiceGrpc.getReadMethod) == null) {
          StorageServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StorageReadRequest, io.nitric.proto.storage.v1.StorageReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageWriteRequest,
      io.nitric.proto.storage.v1.StorageWriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = io.nitric.proto.storage.v1.StorageWriteRequest.class,
      responseType = io.nitric.proto.storage.v1.StorageWriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageWriteRequest,
      io.nitric.proto.storage.v1.StorageWriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageWriteRequest, io.nitric.proto.storage.v1.StorageWriteResponse> getWriteMethod;
    if ((getWriteMethod = StorageServiceGrpc.getWriteMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getWriteMethod = StorageServiceGrpc.getWriteMethod) == null) {
          StorageServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StorageWriteRequest, io.nitric.proto.storage.v1.StorageWriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageWriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageWriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageDeleteRequest,
      io.nitric.proto.storage.v1.StorageDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = io.nitric.proto.storage.v1.StorageDeleteRequest.class,
      responseType = io.nitric.proto.storage.v1.StorageDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageDeleteRequest,
      io.nitric.proto.storage.v1.StorageDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageDeleteRequest, io.nitric.proto.storage.v1.StorageDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = StorageServiceGrpc.getDeleteMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getDeleteMethod = StorageServiceGrpc.getDeleteMethod) == null) {
          StorageServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StorageDeleteRequest, io.nitric.proto.storage.v1.StorageDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StoragePreSignUrlRequest,
      io.nitric.proto.storage.v1.StoragePreSignUrlResponse> getPreSignUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreSignUrl",
      requestType = io.nitric.proto.storage.v1.StoragePreSignUrlRequest.class,
      responseType = io.nitric.proto.storage.v1.StoragePreSignUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StoragePreSignUrlRequest,
      io.nitric.proto.storage.v1.StoragePreSignUrlResponse> getPreSignUrlMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StoragePreSignUrlRequest, io.nitric.proto.storage.v1.StoragePreSignUrlResponse> getPreSignUrlMethod;
    if ((getPreSignUrlMethod = StorageServiceGrpc.getPreSignUrlMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getPreSignUrlMethod = StorageServiceGrpc.getPreSignUrlMethod) == null) {
          StorageServiceGrpc.getPreSignUrlMethod = getPreSignUrlMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StoragePreSignUrlRequest, io.nitric.proto.storage.v1.StoragePreSignUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreSignUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StoragePreSignUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StoragePreSignUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("PreSignUrl"))
              .build();
        }
      }
    }
    return getPreSignUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageListFilesRequest,
      io.nitric.proto.storage.v1.StorageListFilesResponse> getListFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFiles",
      requestType = io.nitric.proto.storage.v1.StorageListFilesRequest.class,
      responseType = io.nitric.proto.storage.v1.StorageListFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageListFilesRequest,
      io.nitric.proto.storage.v1.StorageListFilesResponse> getListFilesMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageListFilesRequest, io.nitric.proto.storage.v1.StorageListFilesResponse> getListFilesMethod;
    if ((getListFilesMethod = StorageServiceGrpc.getListFilesMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getListFilesMethod = StorageServiceGrpc.getListFilesMethod) == null) {
          StorageServiceGrpc.getListFilesMethod = getListFilesMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StorageListFilesRequest, io.nitric.proto.storage.v1.StorageListFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageListFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageListFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("ListFiles"))
              .build();
        }
      }
    }
    return getListFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageExistsRequest,
      io.nitric.proto.storage.v1.StorageExistsResponse> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = io.nitric.proto.storage.v1.StorageExistsRequest.class,
      responseType = io.nitric.proto.storage.v1.StorageExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageExistsRequest,
      io.nitric.proto.storage.v1.StorageExistsResponse> getExistsMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.storage.v1.StorageExistsRequest, io.nitric.proto.storage.v1.StorageExistsResponse> getExistsMethod;
    if ((getExistsMethod = StorageServiceGrpc.getExistsMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getExistsMethod = StorageServiceGrpc.getExistsMethod) == null) {
          StorageServiceGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.storage.v1.StorageExistsRequest, io.nitric.proto.storage.v1.StorageExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.storage.v1.StorageExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub>() {
        @java.lang.Override
        public StorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceStub(channel, callOptions);
        }
      };
    return StorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub>() {
        @java.lang.Override
        public StorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub>() {
        @java.lang.Override
        public StorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceFutureStub(channel, callOptions);
        }
      };
    return StorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
   * </pre>
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve an item from a bucket
     * </pre>
     */
    public void read(io.nitric.proto.storage.v1.StorageReadRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Store an item to a bucket
     * </pre>
     */
    public void write(io.nitric.proto.storage.v1.StorageWriteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageWriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an item from a bucket
     * </pre>
     */
    public void delete(io.nitric.proto.storage.v1.StorageDeleteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate a pre-signed URL for direct operations on an item
     * </pre>
     */
    public void preSignUrl(io.nitric.proto.storage.v1.StoragePreSignUrlRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StoragePreSignUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreSignUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * List files currently in the bucket
     * </pre>
     */
    public void listFiles(io.nitric.proto.storage.v1.StorageListFilesRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageListFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Determine is an object exists in a bucket
     * </pre>
     */
    public void exists(io.nitric.proto.storage.v1.StorageExistsRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageExistsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StorageReadRequest,
                io.nitric.proto.storage.v1.StorageReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StorageWriteRequest,
                io.nitric.proto.storage.v1.StorageWriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StorageDeleteRequest,
                io.nitric.proto.storage.v1.StorageDeleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getPreSignUrlMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StoragePreSignUrlRequest,
                io.nitric.proto.storage.v1.StoragePreSignUrlResponse>(
                  this, METHODID_PRE_SIGN_URL)))
          .addMethod(
            getListFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StorageListFilesRequest,
                io.nitric.proto.storage.v1.StorageListFilesResponse>(
                  this, METHODID_LIST_FILES)))
          .addMethod(
            getExistsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.storage.v1.StorageExistsRequest,
                io.nitric.proto.storage.v1.StorageExistsResponse>(
                  this, METHODID_EXISTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
   * </pre>
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageServiceStub> {
    private StorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an item from a bucket
     * </pre>
     */
    public void read(io.nitric.proto.storage.v1.StorageReadRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Store an item to a bucket
     * </pre>
     */
    public void write(io.nitric.proto.storage.v1.StorageWriteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageWriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an item from a bucket
     * </pre>
     */
    public void delete(io.nitric.proto.storage.v1.StorageDeleteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a pre-signed URL for direct operations on an item
     * </pre>
     */
    public void preSignUrl(io.nitric.proto.storage.v1.StoragePreSignUrlRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StoragePreSignUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreSignUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List files currently in the bucket
     * </pre>
     */
    public void listFiles(io.nitric.proto.storage.v1.StorageListFilesRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageListFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Determine is an object exists in a bucket
     * </pre>
     */
    public void exists(io.nitric.proto.storage.v1.StorageExistsRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageExistsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
   * </pre>
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an item from a bucket
     * </pre>
     */
    public io.nitric.proto.storage.v1.StorageReadResponse read(io.nitric.proto.storage.v1.StorageReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Store an item to a bucket
     * </pre>
     */
    public io.nitric.proto.storage.v1.StorageWriteResponse write(io.nitric.proto.storage.v1.StorageWriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an item from a bucket
     * </pre>
     */
    public io.nitric.proto.storage.v1.StorageDeleteResponse delete(io.nitric.proto.storage.v1.StorageDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a pre-signed URL for direct operations on an item
     * </pre>
     */
    public io.nitric.proto.storage.v1.StoragePreSignUrlResponse preSignUrl(io.nitric.proto.storage.v1.StoragePreSignUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreSignUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List files currently in the bucket
     * </pre>
     */
    public io.nitric.proto.storage.v1.StorageListFilesResponse listFiles(io.nitric.proto.storage.v1.StorageListFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Determine is an object exists in a bucket
     * </pre>
     */
    public io.nitric.proto.storage.v1.StorageExistsResponse exists(io.nitric.proto.storage.v1.StorageExistsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
   * </pre>
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an item from a bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StorageReadResponse> read(
        io.nitric.proto.storage.v1.StorageReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Store an item to a bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StorageWriteResponse> write(
        io.nitric.proto.storage.v1.StorageWriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an item from a bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StorageDeleteResponse> delete(
        io.nitric.proto.storage.v1.StorageDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a pre-signed URL for direct operations on an item
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StoragePreSignUrlResponse> preSignUrl(
        io.nitric.proto.storage.v1.StoragePreSignUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreSignUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List files currently in the bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StorageListFilesResponse> listFiles(
        io.nitric.proto.storage.v1.StorageListFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Determine is an object exists in a bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.storage.v1.StorageExistsResponse> exists(
        io.nitric.proto.storage.v1.StorageExistsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_PRE_SIGN_URL = 3;
  private static final int METHODID_LIST_FILES = 4;
  private static final int METHODID_EXISTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((io.nitric.proto.storage.v1.StorageReadRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((io.nitric.proto.storage.v1.StorageWriteRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageWriteResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.nitric.proto.storage.v1.StorageDeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageDeleteResponse>) responseObserver);
          break;
        case METHODID_PRE_SIGN_URL:
          serviceImpl.preSignUrl((io.nitric.proto.storage.v1.StoragePreSignUrlRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StoragePreSignUrlResponse>) responseObserver);
          break;
        case METHODID_LIST_FILES:
          serviceImpl.listFiles((io.nitric.proto.storage.v1.StorageListFilesRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageListFilesResponse>) responseObserver);
          break;
        case METHODID_EXISTS:
          serviceImpl.exists((io.nitric.proto.storage.v1.StorageExistsRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.storage.v1.StorageExistsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.storage.v1.Storages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getPreSignUrlMethod())
              .addMethod(getListFilesMethod())
              .addMethod(getExistsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
