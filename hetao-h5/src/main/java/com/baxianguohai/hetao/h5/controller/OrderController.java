package com.baxianguohai.hetao.h5.controller;

import com.baixianguohai.hetao.core.manager.OrderManager;
import com.baixianguohai.hetao.core.vo.OrderListVO;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.h5.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
@RequestMapping("/hetao/order")
public class OrderController {

    @Autowired
    private OrderManager orderManager;

    @RequestMapping("/save")
    public Object save(@RequestParam String userId, @RequestParam String productId) {
        String msg = orderManager.save(userId, productId);
        return Result.success(msg);
    }

    @RequestMapping("/list")
    public Object list(@RequestParam String userId, @RequestParam(required = false) Integer orderStatus,
                       @RequestParam(defaultValue = "1") int pageNumber) {
        Map<String, Object> result = orderManager.list(userId, orderStatus, pageNumber);
        return Result.success(result);
    }

}
