package room;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hello.proto")
public final class RoomSignalGrpc {

  private RoomSignalGrpc() {}

  public static final String SERVICE_NAME = "room.RoomSignal";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<room.Hello.Request,
      room.Hello.Reply> getSignalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Signal",
      requestType = room.Hello.Request.class,
      responseType = room.Hello.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<room.Hello.Request,
      room.Hello.Reply> getSignalMethod() {
    io.grpc.MethodDescriptor<room.Hello.Request, room.Hello.Reply> getSignalMethod;
    if ((getSignalMethod = RoomSignalGrpc.getSignalMethod) == null) {
      synchronized (RoomSignalGrpc.class) {
        if ((getSignalMethod = RoomSignalGrpc.getSignalMethod) == null) {
          RoomSignalGrpc.getSignalMethod = getSignalMethod =
              io.grpc.MethodDescriptor.<room.Hello.Request, room.Hello.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Signal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomSignalMethodDescriptorSupplier("Signal"))
              .build();
        }
      }
    }
    return getSignalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomSignalStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomSignalStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomSignalStub>() {
        @java.lang.Override
        public RoomSignalStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomSignalStub(channel, callOptions);
        }
      };
    return RoomSignalStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomSignalBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomSignalBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomSignalBlockingStub>() {
        @java.lang.Override
        public RoomSignalBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomSignalBlockingStub(channel, callOptions);
        }
      };
    return RoomSignalBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomSignalFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomSignalFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomSignalFutureStub>() {
        @java.lang.Override
        public RoomSignalFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomSignalFutureStub(channel, callOptions);
        }
      };
    return RoomSignalFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RoomSignalImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Signal
     * </pre>
     */
    public io.grpc.stub.StreamObserver<room.Hello.Request> signal(
        io.grpc.stub.StreamObserver<room.Hello.Reply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSignalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignalMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                room.Hello.Request,
                room.Hello.Reply>(
                  this, METHODID_SIGNAL)))
          .build();
    }
  }

  /**
   */
  public static final class RoomSignalStub extends io.grpc.stub.AbstractAsyncStub<RoomSignalStub> {
    private RoomSignalStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomSignalStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomSignalStub(channel, callOptions);
    }

    /**
     * <pre>
     * Signal
     * </pre>
     */
    public io.grpc.stub.StreamObserver<room.Hello.Request> signal(
        io.grpc.stub.StreamObserver<room.Hello.Reply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSignalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RoomSignalBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoomSignalBlockingStub> {
    private RoomSignalBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomSignalBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomSignalBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RoomSignalFutureStub extends io.grpc.stub.AbstractFutureStub<RoomSignalFutureStub> {
    private RoomSignalFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomSignalFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomSignalFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SIGNAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomSignalImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomSignalImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGNAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.signal(
              (io.grpc.stub.StreamObserver<room.Hello.Reply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RoomSignalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomSignalBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return room.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomSignal");
    }
  }

  private static final class RoomSignalFileDescriptorSupplier
      extends RoomSignalBaseDescriptorSupplier {
    RoomSignalFileDescriptorSupplier() {}
  }

  private static final class RoomSignalMethodDescriptorSupplier
      extends RoomSignalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomSignalMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomSignalGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomSignalFileDescriptorSupplier())
              .addMethod(getSignalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
