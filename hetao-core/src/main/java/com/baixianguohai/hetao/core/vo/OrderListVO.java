package com.baixianguohai.hetao.core.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author:zdf
 * @date:19-12-10
 */
@Data
public class OrderListVO {
    /**
     * 订单序列号
     */
    private String orderSerial;

    /**
     * 创建订单时间
     */
    private String orderTime;

    /**
     * 订单商品列表
     */
    private List<OrderListProductVO> orderListProductVOList;

    /**
     * 订单金额
     */
    private BigDecimal orderPrice;
}
