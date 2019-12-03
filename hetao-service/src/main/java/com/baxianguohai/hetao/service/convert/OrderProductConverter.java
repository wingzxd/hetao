package com.baxianguohai.hetao.service.convert;



import com.baxianguohai.hetao.biz.dal.model.OrderProductDO;
import com.baxianguohai.hetao.entity.bo.OrderProductBO;

import java.util.Objects;

/**
 * 订单商品表实体类转换器
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public class OrderProductConverter {

    /**
     * Convert OrderProductDO to OrderProductBO
     *
     * @param orderProductDO
     * @return orderProductBO
     */
    public static OrderProductBO convertToDO2BO(OrderProductDO orderProductDO) {
        if (Objects.isNull(orderProductDO)) {
            return null;
        }
        OrderProductBO orderProductBO = new OrderProductBO();
        orderProductBO.setId(orderProductDO.getId());
        orderProductBO.setOrderId(orderProductDO.getOrderId());
        orderProductBO.setOrderSerial(orderProductDO.getOrderSerial());
        orderProductBO.setProductId(orderProductDO.getProductId());
        orderProductBO.setProductName(orderProductDO.getProductName());
        orderProductBO.setProductPrice(orderProductDO.getProductPrice());
        orderProductBO.setProductNumber(orderProductDO.getProductNumber());
        orderProductBO.setProductSmallIcon(orderProductDO.getProductSmallIcon());
        orderProductBO.setIsDelete(orderProductDO.getIsDelete());
        orderProductBO.setGmtCreated(orderProductDO.getGmtCreated());
        orderProductBO.setGmtModified(orderProductDO.getGmtModified());
        return orderProductBO;
    }

    /**
     * Convert OrderProductBO to OrderProductDO
     *
     * @param orderProductBO
     * @return orderProductDO
     */
    public static OrderProductDO convertToBO2DO(OrderProductBO orderProductBO) {
        if (Objects.isNull(orderProductBO)) {
            return null;
        }
        OrderProductDO orderProductDO = new OrderProductDO();
        orderProductDO.setId(orderProductBO.getId());
        orderProductDO.setOrderId(orderProductBO.getOrderId());
        orderProductDO.setOrderSerial(orderProductBO.getOrderSerial());
        orderProductDO.setProductId(orderProductBO.getProductId());
        orderProductDO.setProductName(orderProductBO.getProductName());
        orderProductDO.setProductPrice(orderProductBO.getProductPrice());
        orderProductDO.setProductNumber(orderProductBO.getProductNumber());
        orderProductDO.setProductSmallIcon(orderProductBO.getProductSmallIcon());
        orderProductDO.setIsDelete(orderProductBO.getIsDelete());
        orderProductDO.setGmtCreated(orderProductBO.getGmtCreated());
        orderProductDO.setGmtModified(orderProductBO.getGmtModified());
        return orderProductDO;
    }
}
