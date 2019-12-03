package com.baixianguohai.hetao.core.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface OrderClient {

    @RequestMapping(value = "/order/save")
    String save(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
}
