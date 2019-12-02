package com.baxianguohai.hetaodamai.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = { "com.baxianguohai.hetaodamai.biz.dao" })
public class HeTaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeTaoServiceApplication.class, args);
    }

}
