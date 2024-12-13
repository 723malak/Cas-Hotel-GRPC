package ma.emsi.grpchotels.stub.client;

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
    comments = "Source: Client.proto")
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ma.emsi.grpchotels.grpc.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = ma.emsi.grpchotels.stub.client.Client.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.clientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse> getFindByIdMethod;
    if ((getFindByIdMethod = ClientServiceGrpc.getFindByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getFindByIdMethod = ClientServiceGrpc.getFindByIdMethod) == null) {
          ClientServiceGrpc.getFindByIdMethod = getFindByIdMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("FindById"))
                  .build();
          }
        }
     }
     return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = ma.emsi.grpchotels.stub.client.Client.clientRequest.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.clientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse> getCreateMethod;
    if ((getCreateMethod = ClientServiceGrpc.getCreateMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateMethod = ClientServiceGrpc.getCreateMethod) == null) {
          ClientServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.clientRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequestUpd,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = ma.emsi.grpchotels.stub.client.Client.clientRequestUpd.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.clientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequestUpd,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.clientRequestUpd, ma.emsi.grpchotels.stub.client.Client.clientResponse> getUpdateMethod;
    if ((getUpdateMethod = ClientServiceGrpc.getUpdateMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateMethod = ClientServiceGrpc.getUpdateMethod) == null) {
          ClientServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.clientRequestUpd, ma.emsi.grpchotels.stub.client.Client.clientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientRequestUpd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = ma.emsi.grpchotels.stub.client.Client.FindByIdRequest.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.clientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
      ma.emsi.grpchotels.stub.client.Client.clientResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse> getDeleteMethod;
    if ((getDeleteMethod = ClientServiceGrpc.getDeleteMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteMethod = ClientServiceGrpc.getDeleteMethod) == null) {
          ClientServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.FindByIdRequest, ma.emsi.grpchotels.stub.client.Client.clientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.clientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom,
      ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindByemailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByemail",
      requestType = ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom,
      ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindByemailMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom, ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindByemailMethod;
    if ((getFindByemailMethod = ClientServiceGrpc.getFindByemailMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getFindByemailMethod = ClientServiceGrpc.getFindByemailMethod) == null) {
          ClientServiceGrpc.getFindByemailMethod = getFindByemailMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom, ma.emsi.grpchotels.stub.client.Client.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "FindByemail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("FindByemail"))
                  .build();
          }
        }
     }
     return getFindByemailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequest,
      ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = ma.emsi.grpchotels.stub.client.Client.FindByRequest.class,
      responseType = ma.emsi.grpchotels.stub.client.Client.FindAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequest,
      ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindAllMethod() {
    io.grpc.MethodDescriptor<ma.emsi.grpchotels.stub.client.Client.FindByRequest, ma.emsi.grpchotels.stub.client.Client.FindAllResponse> getFindAllMethod;
    if ((getFindAllMethod = ClientServiceGrpc.getFindAllMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getFindAllMethod = ClientServiceGrpc.getFindAllMethod) == null) {
          ClientServiceGrpc.getFindAllMethod = getFindAllMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.grpchotels.stub.client.Client.FindByRequest, ma.emsi.grpchotels.stub.client.Client.FindAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ma.emsi.grpchotels.grpc.ClientService", "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindByRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.grpchotels.stub.client.Client.FindAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("FindAll"))
                  .build();
          }
        }
     }
     return getFindAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.client.Client.clientRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.client.Client.clientRequestUpd request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void findByemail(ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByemailMethod(), responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.client.Client.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
                ma.emsi.grpchotels.stub.client.Client.clientResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.clientRequest,
                ma.emsi.grpchotels.stub.client.Client.clientResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.clientRequestUpd,
                ma.emsi.grpchotels.stub.client.Client.clientResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.FindByIdRequest,
                ma.emsi.grpchotels.stub.client.Client.clientResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getFindByemailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom,
                ma.emsi.grpchotels.stub.client.Client.FindAllResponse>(
                  this, METHODID_FIND_BYEMAIL)))
          .addMethod(
            getFindAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.grpchotels.stub.client.Client.FindByRequest,
                ma.emsi.grpchotels.stub.client.Client.FindAllResponse>(
                  this, METHODID_FIND_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void findById(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(ma.emsi.grpchotels.stub.client.Client.clientRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(ma.emsi.grpchotels.stub.client.Client.clientRequestUpd request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByemail(ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByemailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(ma.emsi.grpchotels.stub.client.Client.FindByRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.clientResponse findById(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.clientResponse create(ma.emsi.grpchotels.stub.client.Client.clientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.clientResponse update(ma.emsi.grpchotels.stub.client.Client.clientRequestUpd request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.clientResponse delete(ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.FindAllResponse findByemail(ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom request) {
      return blockingUnaryCall(
          getChannel(), getFindByemailMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.emsi.grpchotels.stub.client.Client.FindAllResponse findAll(ma.emsi.grpchotels.stub.client.Client.FindByRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.clientResponse> findById(
        ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.clientResponse> create(
        ma.emsi.grpchotels.stub.client.Client.clientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.clientResponse> update(
        ma.emsi.grpchotels.stub.client.Client.clientRequestUpd request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.clientResponse> delete(
        ma.emsi.grpchotels.stub.client.Client.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> findByemail(
        ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByemailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.grpchotels.stub.client.Client.FindAllResponse> findAll(
        ma.emsi.grpchotels.stub.client.Client.FindByRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_FIND_BYEMAIL = 4;
  private static final int METHODID_FIND_ALL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((ma.emsi.grpchotels.stub.client.Client.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((ma.emsi.grpchotels.stub.client.Client.clientRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((ma.emsi.grpchotels.stub.client.Client.clientRequestUpd) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ma.emsi.grpchotels.stub.client.Client.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.clientResponse>) responseObserver);
          break;
        case METHODID_FIND_BYEMAIL:
          serviceImpl.findByemail((ma.emsi.grpchotels.stub.client.Client.FindByRequestbyemailornom) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((ma.emsi.grpchotels.stub.client.Client.FindByRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.grpchotels.stub.client.Client.FindAllResponse>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.grpchotels.stub.client.Client.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getFindByemailMethod())
              .addMethod(getFindAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
