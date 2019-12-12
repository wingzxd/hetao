package com.baixianguohai.hetao.core.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author:zdf
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface OrderClient {

    @RequestMapping(value = "/hetao/order/save")
    String save(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    @RequestMapping(value = "/hetao/order/list")
    Page<OrderBO> list(@RequestParam("userId") String userId, @RequestParam("orderStatus") Integer orderStatus,
                       @RequestParam("pageNumber") Integer pageNumber);
}
