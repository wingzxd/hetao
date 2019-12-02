package com.baxianguohai.hetaodamai.h5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.baixianguohai.hetaodamai.core.client"})
@ComponentScan(basePackages = {"com.baxianguohai.hetaodamai","com.baixianguohai.hetaodamai.core.manager.impl"})
public class HeTaoH5Application {


    public static void main(String[] args) {
        SpringApplication.run(HeTaoH5Application.class, args);
    }

}
