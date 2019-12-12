package com.baxianguohai.hetao.service.controller;

import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import com.baxianguohai.hetao.service.service.OrderProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
@RequestMapping("/hetao/orderProduct")
public class OrderProductController {

    @Autowired
    private OrderProductService orderProductService;

    @RequestMapping("/listByOrderId")
    public List<OrderProductBO> selectByOrderId(Integer orderId) {
        List<OrderProductBO> orderProductBOList = orderProductService.selectByOrderId(orderId);
        return orderProductBOList;
    }
}
