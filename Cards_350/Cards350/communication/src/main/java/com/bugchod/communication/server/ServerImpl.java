package com.bugchod.communication.server;

import com.bugchod.communication.HelloMessageGrpc;
import io.grpc.stub.StreamObserver;
import com.bugchod.communication.HelloMessageOuterClass.*;

import java.util.Scanner;

public class ServerImpl extends HelloMessageGrpc.HelloMessageImplBase {
    @Override
    public void send(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        //print received message
        System.out.println(request.getMessageSend());

        //read message from terminal
        String msg = new Scanner(System.in).nextLine();

        //buid response
        HelloResponse response = HelloResponse.newBuilder().setMessageReceive(msg).build();

        //send response
        responseObserver.onNext(response);

        //response sending complete
        responseObserver.onCompleted();
    }
}
