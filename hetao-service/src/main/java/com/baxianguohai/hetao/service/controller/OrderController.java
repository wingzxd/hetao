package com.baxianguohai.hetao.service.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.service.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private OrderService orderService;

    @RequestMapping(value = "/save")
    public String save(String userId, String productId) {
        String save = orderService.save(userId, productId);
        return save;
    }

    @RequestMapping(value = "/list")
    public Page<OrderBO> list(String userId, Integer orderStatus, Integer pageNumber) {
        Page<OrderBO> orderBOPage = orderService.list(userId, orderStatus, pageNumber);
        return orderBOPage;
    }
}
