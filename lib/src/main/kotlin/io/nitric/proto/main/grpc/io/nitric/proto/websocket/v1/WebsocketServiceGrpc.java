package io.nitric.proto.websocket.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: proto/websocket/v1/websocket.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebsocketServiceGrpc {

  private WebsocketServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.websocket.v1.WebsocketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketSendRequest,
      io.nitric.proto.websocket.v1.WebsocketSendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = io.nitric.proto.websocket.v1.WebsocketSendRequest.class,
      responseType = io.nitric.proto.websocket.v1.WebsocketSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketSendRequest,
      io.nitric.proto.websocket.v1.WebsocketSendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketSendRequest, io.nitric.proto.websocket.v1.WebsocketSendResponse> getSendMethod;
    if ((getSendMethod = WebsocketServiceGrpc.getSendMethod) == null) {
      synchronized (WebsocketServiceGrpc.class) {
        if ((getSendMethod = WebsocketServiceGrpc.getSendMethod) == null) {
          WebsocketServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.websocket.v1.WebsocketSendRequest, io.nitric.proto.websocket.v1.WebsocketSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.websocket.v1.WebsocketSendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.websocket.v1.WebsocketSendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebsocketServiceMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketCloseRequest,
      io.nitric.proto.websocket.v1.WebsocketCloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = io.nitric.proto.websocket.v1.WebsocketCloseRequest.class,
      responseType = io.nitric.proto.websocket.v1.WebsocketCloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketCloseRequest,
      io.nitric.proto.websocket.v1.WebsocketCloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.websocket.v1.WebsocketCloseRequest, io.nitric.proto.websocket.v1.WebsocketCloseResponse> getCloseMethod;
    if ((getCloseMethod = WebsocketServiceGrpc.getCloseMethod) == null) {
      synchronized (WebsocketServiceGrpc.class) {
        if ((getCloseMethod = WebsocketServiceGrpc.getCloseMethod) == null) {
          WebsocketServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.websocket.v1.WebsocketCloseRequest, io.nitric.proto.websocket.v1.WebsocketCloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.websocket.v1.WebsocketCloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.websocket.v1.WebsocketCloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebsocketServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebsocketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceStub>() {
        @java.lang.Override
        public WebsocketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebsocketServiceStub(channel, callOptions);
        }
      };
    return WebsocketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebsocketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceBlockingStub>() {
        @java.lang.Override
        public WebsocketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebsocketServiceBlockingStub(channel, callOptions);
        }
      };
    return WebsocketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebsocketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebsocketServiceFutureStub>() {
        @java.lang.Override
        public WebsocketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebsocketServiceFutureStub(channel, callOptions);
        }
      };
    return WebsocketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WebsocketServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Send a messages to a websocket
     * </pre>
     */
    public void send(io.nitric.proto.websocket.v1.WebsocketSendRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketSendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close a websocket connection
     * This can be used to force a client to disconnect
     * </pre>
     */
    public void close(io.nitric.proto.websocket.v1.WebsocketCloseRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketCloseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.websocket.v1.WebsocketSendRequest,
                io.nitric.proto.websocket.v1.WebsocketSendResponse>(
                  this, METHODID_SEND)))
          .addMethod(
            getCloseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.websocket.v1.WebsocketCloseRequest,
                io.nitric.proto.websocket.v1.WebsocketCloseResponse>(
                  this, METHODID_CLOSE)))
          .build();
    }
  }

  /**
   */
  public static final class WebsocketServiceStub extends io.grpc.stub.AbstractAsyncStub<WebsocketServiceStub> {
    private WebsocketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebsocketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebsocketServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a messages to a websocket
     * </pre>
     */
    public void send(io.nitric.proto.websocket.v1.WebsocketSendRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketSendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close a websocket connection
     * This can be used to force a client to disconnect
     * </pre>
     */
    public void close(io.nitric.proto.websocket.v1.WebsocketCloseRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketCloseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebsocketServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WebsocketServiceBlockingStub> {
    private WebsocketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebsocketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebsocketServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a messages to a websocket
     * </pre>
     */
    public io.nitric.proto.websocket.v1.WebsocketSendResponse send(io.nitric.proto.websocket.v1.WebsocketSendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close a websocket connection
     * This can be used to force a client to disconnect
     * </pre>
     */
    public io.nitric.proto.websocket.v1.WebsocketCloseResponse close(io.nitric.proto.websocket.v1.WebsocketCloseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebsocketServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WebsocketServiceFutureStub> {
    private WebsocketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebsocketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebsocketServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a messages to a websocket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.websocket.v1.WebsocketSendResponse> send(
        io.nitric.proto.websocket.v1.WebsocketSendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close a websocket connection
     * This can be used to force a client to disconnect
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.websocket.v1.WebsocketCloseResponse> close(
        io.nitric.proto.websocket.v1.WebsocketCloseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CLOSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebsocketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebsocketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((io.nitric.proto.websocket.v1.WebsocketSendRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketSendResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((io.nitric.proto.websocket.v1.WebsocketCloseRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.websocket.v1.WebsocketCloseResponse>) responseObserver);
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

  private static abstract class WebsocketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebsocketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.websocket.v1.Websockets.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebsocketService");
    }
  }

  private static final class WebsocketServiceFileDescriptorSupplier
      extends WebsocketServiceBaseDescriptorSupplier {
    WebsocketServiceFileDescriptorSupplier() {}
  }

  private static final class WebsocketServiceMethodDescriptorSupplier
      extends WebsocketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebsocketServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WebsocketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebsocketServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCloseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
