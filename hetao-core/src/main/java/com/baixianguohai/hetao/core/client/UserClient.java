package com.baixianguohai.hetao.core.client;

import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.entity.common.Result;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface UserClient {

    @PostMapping("/user/login")
    Result<String> login(@RequestBody UserBO userBO);

    @PostMapping("/user/register")
    Result<String> register(@RequestBody UserBO userBO);


}
