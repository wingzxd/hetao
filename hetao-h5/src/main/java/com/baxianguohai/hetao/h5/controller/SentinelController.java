/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.baxianguohai.hetao.h5.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sentinel 熔断示例
 *
 * @author yinhz
 * @version V1.0
 * @since 2019-12-06 10:52
 */
@RestController
@RequestMapping(value = "/trysentinel")
public class SentinelController {

    @RequestMapping("/limitQps")
    public String limitQps(){
        //资源名称，与配置中保持一致，可以共用
        String resourceName = "hetao_sentinel_limit_qps";
        try (Entry entry = SphU.entry(resourceName)){
            // 被保护的业务逻辑
            // do something here...
            System.out.println("请求正常"+System.currentTimeMillis());
            return "请求正常";

        }catch (BlockException ex){
            // 资源访问阻止，被限流或被降级
            // 在此处进行相应的处理操作
            System.out.println("超过每秒请求数，限制流量"+System.currentTimeMillis());
            return "当前请求人数较多、请稍后再试";
        }
    }

    @GetMapping("/limitEx")
    @SentinelResource(value = "hetao_sentinel_limit_ex_ratio",fallback = "fallbacklimitEx")
    public String limitEx(){
        long time  = System.currentTimeMillis();
        System.out.println("开始请求");
        if(time%2==0){
            throw  new RuntimeException("异常了");
        }
        return "请求正常";


    }

    public String fallbacklimitEx(){
        System.out.println("熔断返回"+System.currentTimeMillis());
        return "服务器异常";
    }
}
