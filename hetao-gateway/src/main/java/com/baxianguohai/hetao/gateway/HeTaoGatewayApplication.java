package com.baxianguohai.hetao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HeTaoGatewayApplication {


    public static void main(String[] args) {
        SpringApplication.run(HeTaoGatewayApplication.class, args);
    }

}
