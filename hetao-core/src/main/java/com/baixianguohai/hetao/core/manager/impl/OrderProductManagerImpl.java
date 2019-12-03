package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.OrderProductClient;
import com.baixianguohai.hetao.core.manager.OrderProductManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 订单商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Component
public class OrderProductManagerImpl implements OrderProductManager {

    @Autowired
    private OrderProductClient orderProductClient;

}
