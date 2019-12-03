package com.baixianguohai.hetao.core.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface OrderProductClient {

}
