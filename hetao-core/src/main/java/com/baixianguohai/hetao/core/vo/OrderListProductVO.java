package com.baixianguohai.hetao.core.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author:zdf
 * @date:19-12-10
 */
@Data
public class OrderListProductVO {
    /**
     * 订单商品ID
     */
    private String productId;

    /**
     * 订单商品名称
     */
    private String productName;

    /**
     * 订单商品价格
     */
    private BigDecimal productPrice;

    /**
     * 订单商品个数
     */
    private int productNumber;
}
