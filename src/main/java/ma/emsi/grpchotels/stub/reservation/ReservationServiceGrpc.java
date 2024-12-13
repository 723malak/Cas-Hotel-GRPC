package ma.emsi.grpchotels.stub.reservation;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ma.emsi.grpchotels.grpc.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ReservationServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getFindByIdMethod = ReservationServiceGrpc.getFindByIdMethod) == null) {
          ReservationServiceGrpc.getFindByIdMethod = getFindByIdMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ReservationService", "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("FindById"))
                  .build();
          }
        }
     }
     return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest.class,
      responseType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getCreateMethod;
    if ((getCreateMethod = ReservationServiceGrpc.getCreateMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateMethod = ReservationServiceGrpc.getCreateMethod) == null) {
          ReservationServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ReservationService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd.class,
      responseType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getUpdateMethod;
    if ((getUpdateMethod = ReservationServiceGrpc.getUpdateMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateMethod = ReservationServiceGrpc.getUpdateMethod) == null) {
          ReservationServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ReservationService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> getDeleteMethod;
    if ((getDeleteMethod = ReservationServiceGrpc.getDeleteMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteMethod = ReservationServiceGrpc.getDeleteMethod) == null) {
          ReservationServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest, ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ReservationService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest.class,
      responseType = ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest,
      ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> getFindAllMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest, ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> getFindAllMethod;
    if ((getFindAllMethod = ReservationServiceGrpc.getFindAllMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getFindAllMethod = ReservationServiceGrpc.getFindAllMethod) == null) {
          ReservationServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest, ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ReservationService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest,
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd,
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest,
                ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest,
                ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse findById(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse create(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse update(ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse delete(ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse findAll(ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> findById(
        ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> create(
        ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> update(
        ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse> delete(
        ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse> findAll(
        ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_FIND_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequestUpd) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ma.emsi.grpchotels.stub.reservation.Reservation.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((ma.emsi.grpchotels.stub.reservation.Reservation.FindByRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.reservation.Reservation.FindAllResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.grpchotels.stub.reservation.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
