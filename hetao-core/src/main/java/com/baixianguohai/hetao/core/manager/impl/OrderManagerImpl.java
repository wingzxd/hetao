package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.OrderClient;
import com.baixianguohai.hetao.core.client.OrderProductClient;
import com.baixianguohai.hetao.core.manager.OrderManager;
import com.baixianguohai.hetao.core.vo.OrderListProductVO;
import com.baixianguohai.hetao.core.vo.OrderListVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

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
    @Autowired
    private OrderProductClient orderProductClient;

    @Override
    public String save(String userId, String productId) {
        String msg = orderClient.save(userId, productId);
        return msg;
    }

    @Override
    public Map<String, Object> list(String userId, Integer orderStatus, int pageNumber) {
        Map<String, Object> result = Maps.newHashMap();
        Page<OrderBO> orderBOPage = orderClient.list(userId, orderStatus, pageNumber);
        List<OrderListVO> orderListVOList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(orderBOPage.getRecords())) {
            List<OrderBO> orderBOList = orderBOPage.getRecords();
            for (OrderBO orderBO : orderBOList) {
                OrderListVO orderListVO = new OrderListVO();
                List<OrderProductBO> orderProductBOList = orderProductClient.selectByOrderId(orderBO.getId());
                List<OrderListProductVO> orderListProductVOList = Lists.newArrayList();
                if (!CollectionUtils.isEmpty(orderProductBOList)) {
                    for (OrderProductBO orderProductBO : orderProductBOList){
                        OrderListProductVO orderListProductVO = new OrderListProductVO();
                        orderListProductVO.setProductId(orderProductBO.getProductId());
                        orderListProductVO.setProductName(orderProductBO.getProductName());
                        orderListProductVO.setProductNumber(orderProductBO.getProductNumber());
                        orderListProductVO.setProductPrice(orderProductBO.getProductPrice());
                        orderListProductVOList.add(orderListProductVO);
                    }
                }
                orderListVO.setOrderSerial(orderBO.getOrderSerial());
                orderListVO.setOrderPrice(orderBO.getOrderPrice());
                orderListVO.setOrderListProductVOList(orderListProductVOList);
                orderListVOList.add(orderListVO);
            }
        }
        Page<OrderListVO> orderListVOPage = new Page<>();
        orderListVOPage.setRecords(orderListVOList);
        orderListVOPage.setCurrent(orderBOPage.getCurrent());
        orderListVOPage.setTotal(orderBOPage.getTotal());
        orderListVOPage.setSize(orderBOPage.getSize());
        orderListVOPage.setPages(orderBOPage.getPages());
        result.put("orderListVOPage", orderListVOPage);
        return result;
    }
}
