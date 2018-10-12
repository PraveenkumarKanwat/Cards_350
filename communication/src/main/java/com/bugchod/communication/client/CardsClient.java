package com.bugchod.communication.client;

import com.bugchod.communication.HelloMessageGrpc;
import com.bugchod.communication.HelloMessageGrpc.*;
import com.bugchod.communication.HelloMessageOuterClass;
import com.bugchod.communication.HelloMessageOuterClass.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class CardsClient {
    public static void main(String[] args) {
        // Channel is the used to connect to a service/server endpoint
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext(true)
                .build();

        // connecting stub
        HelloMessageBlockingStub stub = HelloMessageGrpc.newBlockingStub(channel);

        //input msg
        String msg = new Scanner(System.in).nextLine();

        //request build
        HelloRequest request = HelloRequest.newBuilder().setMessageSend(msg).build();
        //receive response
        HelloResponse response = stub.send(request);

        System.out.println(response.getMessageReceive());

        //close channel
        channel.shutdownNow();
    }
}
