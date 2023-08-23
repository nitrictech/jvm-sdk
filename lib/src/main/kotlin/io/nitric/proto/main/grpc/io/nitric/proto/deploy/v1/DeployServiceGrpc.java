package io.nitric.proto.deploy.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Nitric Deloyment Service contract
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: proto/deploy/v1/deploy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeployServiceGrpc {

  private DeployServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.deploy.v1.DeployService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployUpRequest,
      io.nitric.proto.deploy.v1.DeployUpEvent> getUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Up",
      requestType = io.nitric.proto.deploy.v1.DeployUpRequest.class,
      responseType = io.nitric.proto.deploy.v1.DeployUpEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployUpRequest,
      io.nitric.proto.deploy.v1.DeployUpEvent> getUpMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployUpRequest, io.nitric.proto.deploy.v1.DeployUpEvent> getUpMethod;
    if ((getUpMethod = DeployServiceGrpc.getUpMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getUpMethod = DeployServiceGrpc.getUpMethod) == null) {
          DeployServiceGrpc.getUpMethod = getUpMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.deploy.v1.DeployUpRequest, io.nitric.proto.deploy.v1.DeployUpEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Up"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.deploy.v1.DeployUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.deploy.v1.DeployUpEvent.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("Up"))
              .build();
        }
      }
    }
    return getUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployDownRequest,
      io.nitric.proto.deploy.v1.DeployDownEvent> getDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Down",
      requestType = io.nitric.proto.deploy.v1.DeployDownRequest.class,
      responseType = io.nitric.proto.deploy.v1.DeployDownEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployDownRequest,
      io.nitric.proto.deploy.v1.DeployDownEvent> getDownMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.deploy.v1.DeployDownRequest, io.nitric.proto.deploy.v1.DeployDownEvent> getDownMethod;
    if ((getDownMethod = DeployServiceGrpc.getDownMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getDownMethod = DeployServiceGrpc.getDownMethod) == null) {
          DeployServiceGrpc.getDownMethod = getDownMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.deploy.v1.DeployDownRequest, io.nitric.proto.deploy.v1.DeployDownEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Down"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.deploy.v1.DeployDownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.deploy.v1.DeployDownEvent.getDefaultInstance()))
              .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("Down"))
              .build();
        }
      }
    }
    return getDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeployServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceStub>() {
        @java.lang.Override
        public DeployServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceStub(channel, callOptions);
        }
      };
    return DeployServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeployServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceBlockingStub>() {
        @java.lang.Override
        public DeployServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceBlockingStub(channel, callOptions);
        }
      };
    return DeployServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeployServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeployServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeployServiceFutureStub>() {
        @java.lang.Override
        public DeployServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeployServiceFutureStub(channel, callOptions);
        }
      };
    return DeployServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Nitric Deloyment Service contract
   * </pre>
   */
  public static abstract class DeployServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Begins a new deployment
     * Server will stream updates back to the connected client
     * on the status of the deployment
     * </pre>
     */
    public void up(io.nitric.proto.deploy.v1.DeployUpRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployUpEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tears down an existing deployment
     * Server will stream updates back to the connected client
     * on the status of the teardown
     * </pre>
     */
    public void down(io.nitric.proto.deploy.v1.DeployDownRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployDownEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                io.nitric.proto.deploy.v1.DeployUpRequest,
                io.nitric.proto.deploy.v1.DeployUpEvent>(
                  this, METHODID_UP)))
          .addMethod(
            getDownMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                io.nitric.proto.deploy.v1.DeployDownRequest,
                io.nitric.proto.deploy.v1.DeployDownEvent>(
                  this, METHODID_DOWN)))
          .build();
    }
  }

  /**
   * <pre>
   * The Nitric Deloyment Service contract
   * </pre>
   */
  public static final class DeployServiceStub extends io.grpc.stub.AbstractAsyncStub<DeployServiceStub> {
    private DeployServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Begins a new deployment
     * Server will stream updates back to the connected client
     * on the status of the deployment
     * </pre>
     */
    public void up(io.nitric.proto.deploy.v1.DeployUpRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployUpEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tears down an existing deployment
     * Server will stream updates back to the connected client
     * on the status of the teardown
     * </pre>
     */
    public void down(io.nitric.proto.deploy.v1.DeployDownRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployDownEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Nitric Deloyment Service contract
   * </pre>
   */
  public static final class DeployServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeployServiceBlockingStub> {
    private DeployServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Begins a new deployment
     * Server will stream updates back to the connected client
     * on the status of the deployment
     * </pre>
     */
    public java.util.Iterator<io.nitric.proto.deploy.v1.DeployUpEvent> up(
        io.nitric.proto.deploy.v1.DeployUpRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tears down an existing deployment
     * Server will stream updates back to the connected client
     * on the status of the teardown
     * </pre>
     */
    public java.util.Iterator<io.nitric.proto.deploy.v1.DeployDownEvent> down(
        io.nitric.proto.deploy.v1.DeployDownRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Nitric Deloyment Service contract
   * </pre>
   */
  public static final class DeployServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeployServiceFutureStub> {
    private DeployServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeployServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_UP = 0;
  private static final int METHODID_DOWN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeployServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeployServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UP:
          serviceImpl.up((io.nitric.proto.deploy.v1.DeployUpRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployUpEvent>) responseObserver);
          break;
        case METHODID_DOWN:
          serviceImpl.down((io.nitric.proto.deploy.v1.DeployDownRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.deploy.v1.DeployDownEvent>) responseObserver);
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

  private static abstract class DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeployServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.deploy.v1.Deploys.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeployService");
    }
  }

  private static final class DeployServiceFileDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier {
    DeployServiceFileDescriptorSupplier() {}
  }

  private static final class DeployServiceMethodDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeployServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeployServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeployServiceFileDescriptorSupplier())
              .addMethod(getUpMethod())
              .addMethod(getDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
