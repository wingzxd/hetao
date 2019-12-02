package com.baixianguohai.hetaodamai.core.client;

import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface BackEndClient {
    @RequestMapping(value = "/save/log")
    String saveLog(@RequestBody LogBo logBo);
}
