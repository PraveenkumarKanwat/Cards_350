package com.bugchod.communication;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: HelloMessage.proto")
public final class HelloMessageGrpc {

  private HelloMessageGrpc() {}

  public static final String SERVICE_NAME = "com.bugchod.communication.HelloMessage";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.bugchod.communication.HelloMessageOuterClass.HelloRequest,
      com.bugchod.communication.HelloMessageOuterClass.HelloResponse> METHOD_SEND =
      io.grpc.MethodDescriptor.<com.bugchod.communication.HelloMessageOuterClass.HelloRequest, com.bugchod.communication.HelloMessageOuterClass.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.bugchod.communication.HelloMessage", "send"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bugchod.communication.HelloMessageOuterClass.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.bugchod.communication.HelloMessageOuterClass.HelloResponse.getDefaultInstance()))
          .setSchemaDescriptor(new HelloMessageMethodDescriptorSupplier("send"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloMessageStub newStub(io.grpc.Channel channel) {
    return new HelloMessageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloMessageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloMessageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloMessageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloMessageFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloMessageImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.bugchod.communication.HelloMessageOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.bugchod.communication.HelloMessageOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.bugchod.communication.HelloMessageOuterClass.HelloRequest,
                com.bugchod.communication.HelloMessageOuterClass.HelloResponse>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class HelloMessageStub extends io.grpc.stub.AbstractStub<HelloMessageStub> {
    private HelloMessageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloMessageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloMessageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloMessageStub(channel, callOptions);
    }

    /**
     */
    public void send(com.bugchod.communication.HelloMessageOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.bugchod.communication.HelloMessageOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloMessageBlockingStub extends io.grpc.stub.AbstractStub<HelloMessageBlockingStub> {
    private HelloMessageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloMessageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloMessageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloMessageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bugchod.communication.HelloMessageOuterClass.HelloResponse send(com.bugchod.communication.HelloMessageOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloMessageFutureStub extends io.grpc.stub.AbstractStub<HelloMessageFutureStub> {
    private HelloMessageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloMessageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloMessageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloMessageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bugchod.communication.HelloMessageOuterClass.HelloResponse> send(
        com.bugchod.communication.HelloMessageOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloMessageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloMessageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.bugchod.communication.HelloMessageOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.bugchod.communication.HelloMessageOuterClass.HelloResponse>) responseObserver);
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

  private static abstract class HelloMessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloMessageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bugchod.communication.HelloMessageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloMessage");
    }
  }

  private static final class HelloMessageFileDescriptorSupplier
      extends HelloMessageBaseDescriptorSupplier {
    HelloMessageFileDescriptorSupplier() {}
  }

  private static final class HelloMessageMethodDescriptorSupplier
      extends HelloMessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloMessageMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloMessageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloMessageFileDescriptorSupplier())
              .addMethod(METHOD_SEND)
              .build();
        }
      }
    }
    return result;
  }
}
