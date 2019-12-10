package com.baxianguohai.hetao.service.convert;

import com.baxianguohai.hetao.biz.dal.model.OrderDO;
import com.baxianguohai.hetao.entity.bo.OrderBO;

import java.util.Objects;

/**
 * 订单主表实体类转换器
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public class OrderConverter {

    /**
     * Convert OrderDO to OrderBO
     *
     * @param orderDO
     * @return orderBO
     */
    public static OrderBO convertToDO2BO(OrderDO orderDO) {
        if (Objects.isNull(orderDO)) {
            return null;
        }
        OrderBO orderBO = new OrderBO();
        orderBO.setId(orderDO.getId());
        orderBO.setOrderSerial(orderDO.getOrderSerial());
        orderBO.setReceiverName(orderDO.getReceiverName());
        orderBO.setReceiverPhone(orderDO.getReceiverPhone());
        orderBO.setReceiverAddress(orderDO.getReceiverAddress());
        orderBO.setTotalProductPrice(orderDO.getTotalProductPrice());
        orderBO.setExpressPrice(orderDO.getExpressPrice());
        orderBO.setOrderPrice(orderDO.getOrderPrice());
        orderBO.setPayStatus(orderDO.getPayStatus());
        orderBO.setOrderStatus(orderDO.getOrderStatus());
        orderBO.setIsDelete(orderDO.getIsDelete());
        orderBO.setGmtCreated(orderDO.getGmtCreated());
        orderBO.setGmtModified(orderDO.getGmtModified());
        orderBO.setUserId(orderDO.getUserId());
        return orderBO;
    }

    /**
     * Convert OrderBO to OrderDO
     *
     * @param orderBO
     * @return orderDO
     */
    public static OrderDO convertToBO2DO(OrderBO orderBO) {
        if (Objects.isNull(orderBO)) {
            return null;
        }
        OrderDO orderDO = new OrderDO();
        orderDO.setId(orderBO.getId());
        orderDO.setOrderSerial(orderBO.getOrderSerial());
        orderDO.setReceiverName(orderBO.getReceiverName());
        orderDO.setReceiverPhone(orderBO.getReceiverPhone());
        orderDO.setReceiverAddress(orderBO.getReceiverAddress());
        orderDO.setTotalProductPrice(orderBO.getTotalProductPrice());
        orderDO.setExpressPrice(orderBO.getExpressPrice());
        orderDO.setOrderPrice(orderBO.getOrderPrice());
        orderDO.setPayStatus(orderBO.getPayStatus());
        orderDO.setOrderStatus(orderBO.getOrderStatus());
        orderDO.setIsDelete(orderBO.getIsDelete());
        orderDO.setGmtCreated(orderBO.getGmtCreated());
        orderDO.setGmtModified(orderBO.getGmtModified());
        orderDO.setUserId(orderBO.getUserId());
        return orderDO;
    }
}
