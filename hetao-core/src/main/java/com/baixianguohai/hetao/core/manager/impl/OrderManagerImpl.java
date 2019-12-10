package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.OrderClient;
import com.baixianguohai.hetao.core.manager.OrderManager;
import com.baixianguohai.hetao.core.vo.OrderListVO;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Component
public class OrderManagerImpl implements OrderManager {

    @Autowired
    private OrderClient orderClient;

    @Override
    public String save(String userId, String productId) {
        String msg = orderClient.save(userId, productId);
        return msg;
    }

    @Override
    public Map<String, Object> list(String userId, int orderStatus) {
        Map<String, Object> result = Maps.newHashMap();
        List<OrderListVO> orderListVOList = orderClient.list(userId, orderStatus);
        result.put("orderListVOList", orderListVOList);
        return result;
    }
}
