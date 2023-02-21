package com.apigw.server.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class GrpcClientController{
    @Autowired
    private GrpcClientService grpcClientService;
    @GetMapping
    public String printMessage(@RequestParam(defaultValue = "Georgyi") String name){
        return grpcClientService.sendMessage(name);
    }
}
