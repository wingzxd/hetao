package com.baxianguohai.hetaodamai.mall.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service-zdf")
public interface BackEndClient {
    @RequestMapping(value = "/save/log")
    String saveLog();
}
