package com.baxianguohai.hetao.service.service;

import com.baxianguohai.hetao.entity.bo.OrderProductBO;

import java.util.List;

/**
 * 订单商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public interface OrderProductService {
    List<OrderProductBO> selectByOrderId(Integer orderId);
}
