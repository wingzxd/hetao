package com.baixianguohai.hetao.core.client;

import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface OrderProductClient {

    @RequestMapping("/hetao/orderProduct/listByOrderId")
    List<OrderProductBO> selectByOrderId(@RequestParam("orderId") Integer orderId);
}
