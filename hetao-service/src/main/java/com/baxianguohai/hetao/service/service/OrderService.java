package com.baxianguohai.hetao.service.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.entity.bo.OrderBO;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public interface OrderService {
    String save(String userId, String productId);

    Page<OrderBO> list(String userId, Integer orderStatus, Integer pageNumber);
}
