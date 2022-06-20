package com.leo.microservice.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "com.leo.microservice.cartservice.proto.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartsRequest,
      com.leo.microservice.protobuf.CartsResponse> getGetCartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCarts",
      requestType = com.leo.microservice.protobuf.CartsRequest.class,
      responseType = com.leo.microservice.protobuf.CartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartsRequest,
      com.leo.microservice.protobuf.CartsResponse> getGetCartsMethod() {
    io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartsRequest, com.leo.microservice.protobuf.CartsResponse> getGetCartsMethod;
    if ((getGetCartsMethod = CartServiceGrpc.getGetCartsMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartsMethod = CartServiceGrpc.getGetCartsMethod) == null) {
          CartServiceGrpc.getGetCartsMethod = getGetCartsMethod =
              io.grpc.MethodDescriptor.<com.leo.microservice.protobuf.CartsRequest, com.leo.microservice.protobuf.CartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCarts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("getCarts"))
              .build();
        }
      }
    }
    return getGetCartsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getCreateCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCart",
      requestType = com.leo.microservice.protobuf.CartRequest.class,
      responseType = com.leo.microservice.protobuf.CartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getCreateCartMethod() {
    io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse> getCreateCartMethod;
    if ((getCreateCartMethod = CartServiceGrpc.getCreateCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getCreateCartMethod = CartServiceGrpc.getCreateCartMethod) == null) {
          CartServiceGrpc.getCreateCartMethod = getCreateCartMethod =
              io.grpc.MethodDescriptor.<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("createCart"))
              .build();
        }
      }
    }
    return getCreateCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getGetCartByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartById",
      requestType = com.leo.microservice.protobuf.CartRequest.class,
      responseType = com.leo.microservice.protobuf.CartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getGetCartByIdMethod() {
    io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse> getGetCartByIdMethod;
    if ((getGetCartByIdMethod = CartServiceGrpc.getGetCartByIdMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartByIdMethod = CartServiceGrpc.getGetCartByIdMethod) == null) {
          CartServiceGrpc.getGetCartByIdMethod = getGetCartByIdMethod =
              io.grpc.MethodDescriptor.<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("getCartById"))
              .build();
        }
      }
    }
    return getGetCartByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getAddItemToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addItemToCart",
      requestType = com.leo.microservice.protobuf.CartRequest.class,
      responseType = com.leo.microservice.protobuf.CartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getAddItemToCartMethod() {
    io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse> getAddItemToCartMethod;
    if ((getAddItemToCartMethod = CartServiceGrpc.getAddItemToCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddItemToCartMethod = CartServiceGrpc.getAddItemToCartMethod) == null) {
          CartServiceGrpc.getAddItemToCartMethod = getAddItemToCartMethod =
              io.grpc.MethodDescriptor.<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addItemToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("addItemToCart"))
              .build();
        }
      }
    }
    return getAddItemToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getDeleteFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFromCart",
      requestType = com.leo.microservice.protobuf.CartRequest.class,
      responseType = com.leo.microservice.protobuf.CartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest,
      com.leo.microservice.protobuf.CartResponse> getDeleteFromCartMethod() {
    io.grpc.MethodDescriptor<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse> getDeleteFromCartMethod;
    if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
          CartServiceGrpc.getDeleteFromCartMethod = getDeleteFromCartMethod =
              io.grpc.MethodDescriptor.<com.leo.microservice.protobuf.CartRequest, com.leo.microservice.protobuf.CartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.leo.microservice.protobuf.CartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("deleteFromCart"))
              .build();
        }
      }
    }
    return getDeleteFromCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCarts(com.leo.microservice.protobuf.CartsRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartsMethod(), responseObserver);
    }

    /**
     */
    public void createCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCartMethod(), responseObserver);
    }

    /**
     */
    public void getCartById(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartByIdMethod(), responseObserver);
    }

    /**
     */
    public void addItemToCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddItemToCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteFromCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFromCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCartsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.leo.microservice.protobuf.CartsRequest,
                com.leo.microservice.protobuf.CartsResponse>(
                  this, METHODID_GET_CARTS)))
          .addMethod(
            getCreateCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.leo.microservice.protobuf.CartRequest,
                com.leo.microservice.protobuf.CartResponse>(
                  this, METHODID_CREATE_CART)))
          .addMethod(
            getGetCartByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.leo.microservice.protobuf.CartRequest,
                com.leo.microservice.protobuf.CartResponse>(
                  this, METHODID_GET_CART_BY_ID)))
          .addMethod(
            getAddItemToCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.leo.microservice.protobuf.CartRequest,
                com.leo.microservice.protobuf.CartResponse>(
                  this, METHODID_ADD_ITEM_TO_CART)))
          .addMethod(
            getDeleteFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.leo.microservice.protobuf.CartRequest,
                com.leo.microservice.protobuf.CartResponse>(
                  this, METHODID_DELETE_FROM_CART)))
          .build();
    }
  }

  /**
   */
  public static final class CartServiceStub extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCarts(com.leo.microservice.protobuf.CartsRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartById(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addItemToCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddItemToCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFromCart(com.leo.microservice.protobuf.CartRequest request,
        io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.leo.microservice.protobuf.CartsResponse getCarts(com.leo.microservice.protobuf.CartsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leo.microservice.protobuf.CartResponse createCart(com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leo.microservice.protobuf.CartResponse getCartById(com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leo.microservice.protobuf.CartResponse addItemToCart(com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddItemToCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.leo.microservice.protobuf.CartResponse deleteFromCart(com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFromCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leo.microservice.protobuf.CartsResponse> getCarts(
        com.leo.microservice.protobuf.CartsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leo.microservice.protobuf.CartResponse> createCart(
        com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leo.microservice.protobuf.CartResponse> getCartById(
        com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leo.microservice.protobuf.CartResponse> addItemToCart(
        com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddItemToCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.leo.microservice.protobuf.CartResponse> deleteFromCart(
        com.leo.microservice.protobuf.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CARTS = 0;
  private static final int METHODID_CREATE_CART = 1;
  private static final int METHODID_GET_CART_BY_ID = 2;
  private static final int METHODID_ADD_ITEM_TO_CART = 3;
  private static final int METHODID_DELETE_FROM_CART = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CARTS:
          serviceImpl.getCarts((com.leo.microservice.protobuf.CartsRequest) request,
              (io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CART:
          serviceImpl.createCart((com.leo.microservice.protobuf.CartRequest) request,
              (io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse>) responseObserver);
          break;
        case METHODID_GET_CART_BY_ID:
          serviceImpl.getCartById((com.leo.microservice.protobuf.CartRequest) request,
              (io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse>) responseObserver);
          break;
        case METHODID_ADD_ITEM_TO_CART:
          serviceImpl.addItemToCart((com.leo.microservice.protobuf.CartRequest) request,
              (io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse>) responseObserver);
          break;
        case METHODID_DELETE_FROM_CART:
          serviceImpl.deleteFromCart((com.leo.microservice.protobuf.CartRequest) request,
              (io.grpc.stub.StreamObserver<com.leo.microservice.protobuf.CartResponse>) responseObserver);
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

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.leo.microservice.protobuf.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getGetCartsMethod())
              .addMethod(getCreateCartMethod())
              .addMethod(getGetCartByIdMethod())
              .addMethod(getAddItemToCartMethod())
              .addMethod(getDeleteFromCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
