package com.apigw.server.client;

import com.apigw.server.GreeterGrpc;
import com.apigw.server.GreeterOuterClass;
import io.grpc.*;
import org.springframework.stereotype.Service;
@Service
public class GrpcClientService{
    ManagedChannel channel = ManagedChannelBuilder
        .forAddress("localhost", 9090)
        .usePlaintext()
        .build();


    private GreeterGrpc.GreeterBlockingStub greeterStub = GreeterGrpc.newBlockingStub(channel);
    public String sendMessage(String name){
        GreeterOuterClass.HalloReply response = greeterStub.greeting(GreeterOuterClass.HalloRequest.newBuilder()
                .setName(name)
                .build());
        return response.getMessage();
    }
}
