package com.baixianguohai.hetao.core.manager;

import java.util.Map;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public interface OrderManager {
    String save(String userId, String productId);

    Map<String, Object> list(String userId, Integer orderStatus, int pageNumber);
}
