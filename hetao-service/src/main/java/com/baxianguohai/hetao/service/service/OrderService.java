package com.baxianguohai.hetao.service.service;

import com.baxianguohai.hetao.entity.bo.OrderBO;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public interface OrderService {
    String save(String userId, String productId);
}
