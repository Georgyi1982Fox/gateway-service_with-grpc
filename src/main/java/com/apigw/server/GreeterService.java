package com.apigw.server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
@GrpcService
public class GreeterService extends GreeterGrpc.GreeterImplBase{
    @Override
    public void greeting(GreeterOuterClass.HalloRequest request,
                         StreamObserver<GreeterOuterClass.HalloReply> responseObserver){
        System.out.println(request);
        GreeterOuterClass.HalloReply reply = GreeterOuterClass.HalloReply.newBuilder()
                .setMessage("Hello from server" + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
