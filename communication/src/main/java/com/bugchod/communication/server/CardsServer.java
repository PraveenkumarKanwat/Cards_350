package com.bugchod.communication.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CardsServer {
    public static void main(String[] args) {

        Server server = ServerBuilder.forPort(8080).
                addService(new ServerImpl())
                .build();

        try{
        //start the server
        server.start();

        // Server running in the background
        System.out.println("Server started");

        server.awaitTermination();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
