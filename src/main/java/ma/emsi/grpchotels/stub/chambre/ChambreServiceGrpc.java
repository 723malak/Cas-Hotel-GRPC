package ma.emsi.grpchotels.stub.chambre;

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
    comments = "Source: Chambre.proto")
public final class ChambreServiceGrpc {

  private ChambreServiceGrpc() {}

  public static final String SERVICE_NAME = "ma.emsi.grpchotels.grpc.ChambreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ChambreServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getFindByIdMethod = ChambreServiceGrpc.getFindByIdMethod) == null) {
          ChambreServiceGrpc.getFindByIdMethod = getFindByIdMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("FindById"))
                  .build();
          }
        }
     }
     return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getCreateMethod;
    if ((getCreateMethod = ChambreServiceGrpc.getCreateMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getCreateMethod = ChambreServiceGrpc.getCreateMethod) == null) {
          ChambreServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getUpdateMethod;
    if ((getUpdateMethod = ChambreServiceGrpc.getUpdateMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getUpdateMethod = ChambreServiceGrpc.getUpdateMethod) == null) {
          ChambreServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> getDeleteMethod;
    if ((getDeleteMethod = ChambreServiceGrpc.getDeleteMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getDeleteMethod = ChambreServiceGrpc.getDeleteMethod) == null) {
          ChambreServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest, ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite,
      ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindByDisponibiliteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByDisponibilite",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite,
      ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindByDisponibiliteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite, ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindByDisponibiliteMethod;
    if ((getFindByDisponibiliteMethod = ChambreServiceGrpc.getFindByDisponibiliteMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getFindByDisponibiliteMethod = ChambreServiceGrpc.getFindByDisponibiliteMethod) == null) {
          ChambreServiceGrpc.getFindByDisponibiliteMethod = getFindByDisponibiliteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite, ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "FindByDisponibilite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("FindByDisponibilite"))
                  .build();
          }
        }
     }
     return getFindByDisponibiliteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest.class,
      responseType = ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest,
      ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindAllMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest, ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> getFindAllMethod;
    if ((getFindAllMethod = ChambreServiceGrpc.getFindAllMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getFindAllMethod = ChambreServiceGrpc.getFindAllMethod) == null) {
          ChambreServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest, ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ChambreService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChambreServiceStub newStub(io.grpc.Channel channel) {
    return new ChambreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChambreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChambreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChambreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChambreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChambreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findByDisponibilite(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByDisponibiliteMethod(), responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest,
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest,
                ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindByDisponibiliteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite,
                ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>(
                  this, METHODID_FIND_BY_DISPONIBILITE)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest,
                ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ChambreServiceStub extends io.grpc.stub.AbstractStub<ChambreServiceStub> {
    private ChambreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceStub(channel, callOptions);
    }

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByDisponibilite(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByDisponibiliteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChambreServiceBlockingStub extends io.grpc.stub.AbstractStub<ChambreServiceBlockingStub> {
    private ChambreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse findById(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse create(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse update(ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse delete(ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse findByDisponibilite(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite request) {
      return blockingUnaryCall(
          getChannel(), getFindByDisponibiliteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse findAll(ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChambreServiceFutureStub extends io.grpc.stub.AbstractStub<ChambreServiceFutureStub> {
    private ChambreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> findById(
        ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> create(
        ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> update(
        ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse> delete(
        ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> findByDisponibilite(
        ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByDisponibiliteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse> findAll(
        ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_FIND_BY_DISPONIBILITE = 4;
  private static final int METHODID_FIND_ALL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChambreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChambreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ma.emsi.grpchotels.stub.chambre.Chambre.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_DISPONIBILITE:
          serviceImpl.findByDisponibilite((ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequestbyDisponibilite) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((ma.emsi.grpchotels.stub.chambre.Chambre.FindByRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.chambre.Chambre.FindAllResponse>) responseObserver);
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

  private static abstract class ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChambreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.grpchotels.stub.chambre.Chambre.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChambreService");
    }
  }

  private static final class ChambreServiceFileDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier {
    ChambreServiceFileDescriptorSupplier() {}
  }

  private static final class ChambreServiceMethodDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChambreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChambreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChambreServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindByDisponibiliteMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
