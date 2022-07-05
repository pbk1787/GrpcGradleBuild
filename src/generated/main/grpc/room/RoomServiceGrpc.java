package room;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: hello.proto")
public final class RoomServiceGrpc {

  private RoomServiceGrpc() {}

  public static final String SERVICE_NAME = "room.RoomService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<room.Hello.CreateRoomRequest,
      room.Hello.CreateRoomReply> getCreateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoom",
      requestType = room.Hello.CreateRoomRequest.class,
      responseType = room.Hello.CreateRoomReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.CreateRoomRequest,
      room.Hello.CreateRoomReply> getCreateRoomMethod() {
    io.grpc.MethodDescriptor<room.Hello.CreateRoomRequest, room.Hello.CreateRoomReply> getCreateRoomMethod;
    if ((getCreateRoomMethod = RoomServiceGrpc.getCreateRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getCreateRoomMethod = RoomServiceGrpc.getCreateRoomMethod) == null) {
          RoomServiceGrpc.getCreateRoomMethod = getCreateRoomMethod =
              io.grpc.MethodDescriptor.<room.Hello.CreateRoomRequest, room.Hello.CreateRoomReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.CreateRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.CreateRoomReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("CreateRoom"))
              .build();
        }
      }
    }
    return getCreateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.UpdateRoomRequest,
      room.Hello.UpdateRoomReply> getUpdateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoom",
      requestType = room.Hello.UpdateRoomRequest.class,
      responseType = room.Hello.UpdateRoomReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.UpdateRoomRequest,
      room.Hello.UpdateRoomReply> getUpdateRoomMethod() {
    io.grpc.MethodDescriptor<room.Hello.UpdateRoomRequest, room.Hello.UpdateRoomReply> getUpdateRoomMethod;
    if ((getUpdateRoomMethod = RoomServiceGrpc.getUpdateRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getUpdateRoomMethod = RoomServiceGrpc.getUpdateRoomMethod) == null) {
          RoomServiceGrpc.getUpdateRoomMethod = getUpdateRoomMethod =
              io.grpc.MethodDescriptor.<room.Hello.UpdateRoomRequest, room.Hello.UpdateRoomReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.UpdateRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.UpdateRoomReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("UpdateRoom"))
              .build();
        }
      }
    }
    return getUpdateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.EndRoomRequest,
      room.Hello.EndRoomReply> getEndRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndRoom",
      requestType = room.Hello.EndRoomRequest.class,
      responseType = room.Hello.EndRoomReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.EndRoomRequest,
      room.Hello.EndRoomReply> getEndRoomMethod() {
    io.grpc.MethodDescriptor<room.Hello.EndRoomRequest, room.Hello.EndRoomReply> getEndRoomMethod;
    if ((getEndRoomMethod = RoomServiceGrpc.getEndRoomMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getEndRoomMethod = RoomServiceGrpc.getEndRoomMethod) == null) {
          RoomServiceGrpc.getEndRoomMethod = getEndRoomMethod =
              io.grpc.MethodDescriptor.<room.Hello.EndRoomRequest, room.Hello.EndRoomReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.EndRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.EndRoomReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("EndRoom"))
              .build();
        }
      }
    }
    return getEndRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.GetRoomsRequest,
      room.Hello.GetRoomsReply> getGetRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRooms",
      requestType = room.Hello.GetRoomsRequest.class,
      responseType = room.Hello.GetRoomsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.GetRoomsRequest,
      room.Hello.GetRoomsReply> getGetRoomsMethod() {
    io.grpc.MethodDescriptor<room.Hello.GetRoomsRequest, room.Hello.GetRoomsReply> getGetRoomsMethod;
    if ((getGetRoomsMethod = RoomServiceGrpc.getGetRoomsMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getGetRoomsMethod = RoomServiceGrpc.getGetRoomsMethod) == null) {
          RoomServiceGrpc.getGetRoomsMethod = getGetRoomsMethod =
              io.grpc.MethodDescriptor.<room.Hello.GetRoomsRequest, room.Hello.GetRoomsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.GetRoomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.GetRoomsReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("GetRooms"))
              .build();
        }
      }
    }
    return getGetRoomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.AddPeerRequest,
      room.Hello.AddPeerReply> getAddPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPeer",
      requestType = room.Hello.AddPeerRequest.class,
      responseType = room.Hello.AddPeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.AddPeerRequest,
      room.Hello.AddPeerReply> getAddPeerMethod() {
    io.grpc.MethodDescriptor<room.Hello.AddPeerRequest, room.Hello.AddPeerReply> getAddPeerMethod;
    if ((getAddPeerMethod = RoomServiceGrpc.getAddPeerMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getAddPeerMethod = RoomServiceGrpc.getAddPeerMethod) == null) {
          RoomServiceGrpc.getAddPeerMethod = getAddPeerMethod =
              io.grpc.MethodDescriptor.<room.Hello.AddPeerRequest, room.Hello.AddPeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.AddPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.AddPeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("AddPeer"))
              .build();
        }
      }
    }
    return getAddPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.UpdatePeerRequest,
      room.Hello.UpdatePeerReply> getUpdatePeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePeer",
      requestType = room.Hello.UpdatePeerRequest.class,
      responseType = room.Hello.UpdatePeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.UpdatePeerRequest,
      room.Hello.UpdatePeerReply> getUpdatePeerMethod() {
    io.grpc.MethodDescriptor<room.Hello.UpdatePeerRequest, room.Hello.UpdatePeerReply> getUpdatePeerMethod;
    if ((getUpdatePeerMethod = RoomServiceGrpc.getUpdatePeerMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getUpdatePeerMethod = RoomServiceGrpc.getUpdatePeerMethod) == null) {
          RoomServiceGrpc.getUpdatePeerMethod = getUpdatePeerMethod =
              io.grpc.MethodDescriptor.<room.Hello.UpdatePeerRequest, room.Hello.UpdatePeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.UpdatePeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.UpdatePeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("UpdatePeer"))
              .build();
        }
      }
    }
    return getUpdatePeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.RemovePeerRequest,
      room.Hello.RemovePeerReply> getRemovePeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePeer",
      requestType = room.Hello.RemovePeerRequest.class,
      responseType = room.Hello.RemovePeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.RemovePeerRequest,
      room.Hello.RemovePeerReply> getRemovePeerMethod() {
    io.grpc.MethodDescriptor<room.Hello.RemovePeerRequest, room.Hello.RemovePeerReply> getRemovePeerMethod;
    if ((getRemovePeerMethod = RoomServiceGrpc.getRemovePeerMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getRemovePeerMethod = RoomServiceGrpc.getRemovePeerMethod) == null) {
          RoomServiceGrpc.getRemovePeerMethod = getRemovePeerMethod =
              io.grpc.MethodDescriptor.<room.Hello.RemovePeerRequest, room.Hello.RemovePeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.RemovePeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.RemovePeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("RemovePeer"))
              .build();
        }
      }
    }
    return getRemovePeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<room.Hello.GetPeersRequest,
      room.Hello.GetPeersReply> getGetPeersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeers",
      requestType = room.Hello.GetPeersRequest.class,
      responseType = room.Hello.GetPeersReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<room.Hello.GetPeersRequest,
      room.Hello.GetPeersReply> getGetPeersMethod() {
    io.grpc.MethodDescriptor<room.Hello.GetPeersRequest, room.Hello.GetPeersReply> getGetPeersMethod;
    if ((getGetPeersMethod = RoomServiceGrpc.getGetPeersMethod) == null) {
      synchronized (RoomServiceGrpc.class) {
        if ((getGetPeersMethod = RoomServiceGrpc.getGetPeersMethod) == null) {
          RoomServiceGrpc.getGetPeersMethod = getGetPeersMethod =
              io.grpc.MethodDescriptor.<room.Hello.GetPeersRequest, room.Hello.GetPeersReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.GetPeersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  room.Hello.GetPeersReply.getDefaultInstance()))
              .setSchemaDescriptor(new RoomServiceMethodDescriptorSupplier("GetPeers"))
              .build();
        }
      }
    }
    return getGetPeersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoomServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceStub>() {
        @java.lang.Override
        public RoomServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceStub(channel, callOptions);
        }
      };
    return RoomServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoomServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceBlockingStub>() {
        @java.lang.Override
        public RoomServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceBlockingStub(channel, callOptions);
        }
      };
    return RoomServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoomServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RoomServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RoomServiceFutureStub>() {
        @java.lang.Override
        public RoomServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RoomServiceFutureStub(channel, callOptions);
        }
      };
    return RoomServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RoomServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Manager API
     * Room API
     * </pre>
     */
    public void createRoom(room.Hello.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.CreateRoomReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoomMethod(), responseObserver);
    }

    /**
     */
    public void updateRoom(room.Hello.UpdateRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.UpdateRoomReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoomMethod(), responseObserver);
    }

    /**
     */
    public void endRoom(room.Hello.EndRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.EndRoomReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndRoomMethod(), responseObserver);
    }

    /**
     */
    public void getRooms(room.Hello.GetRoomsRequest request,
        io.grpc.stub.StreamObserver<room.Hello.GetRoomsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Peer API
     * </pre>
     */
    public void addPeer(room.Hello.AddPeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.AddPeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPeerMethod(), responseObserver);
    }

    /**
     */
    public void updatePeer(room.Hello.UpdatePeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.UpdatePeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePeerMethod(), responseObserver);
    }

    /**
     */
    public void removePeer(room.Hello.RemovePeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.RemovePeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePeerMethod(), responseObserver);
    }

    /**
     */
    public void getPeers(room.Hello.GetPeersRequest request,
        io.grpc.stub.StreamObserver<room.Hello.GetPeersReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.CreateRoomRequest,
                room.Hello.CreateRoomReply>(
                  this, METHODID_CREATE_ROOM)))
          .addMethod(
            getUpdateRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.UpdateRoomRequest,
                room.Hello.UpdateRoomReply>(
                  this, METHODID_UPDATE_ROOM)))
          .addMethod(
            getEndRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.EndRoomRequest,
                room.Hello.EndRoomReply>(
                  this, METHODID_END_ROOM)))
          .addMethod(
            getGetRoomsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.GetRoomsRequest,
                room.Hello.GetRoomsReply>(
                  this, METHODID_GET_ROOMS)))
          .addMethod(
            getAddPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.AddPeerRequest,
                room.Hello.AddPeerReply>(
                  this, METHODID_ADD_PEER)))
          .addMethod(
            getUpdatePeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.UpdatePeerRequest,
                room.Hello.UpdatePeerReply>(
                  this, METHODID_UPDATE_PEER)))
          .addMethod(
            getRemovePeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.RemovePeerRequest,
                room.Hello.RemovePeerReply>(
                  this, METHODID_REMOVE_PEER)))
          .addMethod(
            getGetPeersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                room.Hello.GetPeersRequest,
                room.Hello.GetPeersReply>(
                  this, METHODID_GET_PEERS)))
          .build();
    }
  }

  /**
   */
  public static final class RoomServiceStub extends io.grpc.stub.AbstractAsyncStub<RoomServiceStub> {
    private RoomServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Manager API
     * Room API
     * </pre>
     */
    public void createRoom(room.Hello.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.CreateRoomReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoom(room.Hello.UpdateRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.UpdateRoomReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endRoom(room.Hello.EndRoomRequest request,
        io.grpc.stub.StreamObserver<room.Hello.EndRoomReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRooms(room.Hello.GetRoomsRequest request,
        io.grpc.stub.StreamObserver<room.Hello.GetRoomsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Peer API
     * </pre>
     */
    public void addPeer(room.Hello.AddPeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.AddPeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePeer(room.Hello.UpdatePeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.UpdatePeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePeer(room.Hello.RemovePeerRequest request,
        io.grpc.stub.StreamObserver<room.Hello.RemovePeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeers(room.Hello.GetPeersRequest request,
        io.grpc.stub.StreamObserver<room.Hello.GetPeersReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoomServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RoomServiceBlockingStub> {
    private RoomServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Manager API
     * Room API
     * </pre>
     */
    public room.Hello.CreateRoomReply createRoom(room.Hello.CreateRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.UpdateRoomReply updateRoom(room.Hello.UpdateRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.EndRoomReply endRoom(room.Hello.EndRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.GetRoomsReply getRooms(room.Hello.GetRoomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Peer API
     * </pre>
     */
    public room.Hello.AddPeerReply addPeer(room.Hello.AddPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.UpdatePeerReply updatePeer(room.Hello.UpdatePeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.RemovePeerReply removePeer(room.Hello.RemovePeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public room.Hello.GetPeersReply getPeers(room.Hello.GetPeersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoomServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RoomServiceFutureStub> {
    private RoomServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoomServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RoomServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Manager API
     * Room API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.CreateRoomReply> createRoom(
        room.Hello.CreateRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.UpdateRoomReply> updateRoom(
        room.Hello.UpdateRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.EndRoomReply> endRoom(
        room.Hello.EndRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.GetRoomsReply> getRooms(
        room.Hello.GetRoomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Peer API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.AddPeerReply> addPeer(
        room.Hello.AddPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.UpdatePeerReply> updatePeer(
        room.Hello.UpdatePeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.RemovePeerReply> removePeer(
        room.Hello.RemovePeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<room.Hello.GetPeersReply> getPeers(
        room.Hello.GetPeersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ROOM = 0;
  private static final int METHODID_UPDATE_ROOM = 1;
  private static final int METHODID_END_ROOM = 2;
  private static final int METHODID_GET_ROOMS = 3;
  private static final int METHODID_ADD_PEER = 4;
  private static final int METHODID_UPDATE_PEER = 5;
  private static final int METHODID_REMOVE_PEER = 6;
  private static final int METHODID_GET_PEERS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoomServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoomServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ROOM:
          serviceImpl.createRoom((room.Hello.CreateRoomRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.CreateRoomReply>) responseObserver);
          break;
        case METHODID_UPDATE_ROOM:
          serviceImpl.updateRoom((room.Hello.UpdateRoomRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.UpdateRoomReply>) responseObserver);
          break;
        case METHODID_END_ROOM:
          serviceImpl.endRoom((room.Hello.EndRoomRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.EndRoomReply>) responseObserver);
          break;
        case METHODID_GET_ROOMS:
          serviceImpl.getRooms((room.Hello.GetRoomsRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.GetRoomsReply>) responseObserver);
          break;
        case METHODID_ADD_PEER:
          serviceImpl.addPeer((room.Hello.AddPeerRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.AddPeerReply>) responseObserver);
          break;
        case METHODID_UPDATE_PEER:
          serviceImpl.updatePeer((room.Hello.UpdatePeerRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.UpdatePeerReply>) responseObserver);
          break;
        case METHODID_REMOVE_PEER:
          serviceImpl.removePeer((room.Hello.RemovePeerRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.RemovePeerReply>) responseObserver);
          break;
        case METHODID_GET_PEERS:
          serviceImpl.getPeers((room.Hello.GetPeersRequest) request,
              (io.grpc.stub.StreamObserver<room.Hello.GetPeersReply>) responseObserver);
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

  private static abstract class RoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoomServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return room.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoomService");
    }
  }

  private static final class RoomServiceFileDescriptorSupplier
      extends RoomServiceBaseDescriptorSupplier {
    RoomServiceFileDescriptorSupplier() {}
  }

  private static final class RoomServiceMethodDescriptorSupplier
      extends RoomServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoomServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoomServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoomServiceFileDescriptorSupplier())
              .addMethod(getCreateRoomMethod())
              .addMethod(getUpdateRoomMethod())
              .addMethod(getEndRoomMethod())
              .addMethod(getGetRoomsMethod())
              .addMethod(getAddPeerMethod())
              .addMethod(getUpdatePeerMethod())
              .addMethod(getRemovePeerMethod())
              .addMethod(getGetPeersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
