/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.baxianguohai.hetao.entity.bo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

/**
 * 创建订单
 *
 * @author weiyi
 * @version V1.0
 * @since 2019-12-09 15:14
 */
@Data
public class CreateOrderBO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货人
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货地址
     */
    private String receiverAddress;

    /**
     * 运费
     */
    private BigDecimal expressPrice;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 单个商品数量
     */
    private Integer quantity;

    /**
     * 用户ID
     */
    private Integer userId;
}
