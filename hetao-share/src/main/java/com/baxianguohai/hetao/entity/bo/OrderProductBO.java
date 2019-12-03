package com.baxianguohai.hetao.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单商品表
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Data
public class OrderProductBO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 
     */
    private Integer id;
    /**
     * 订单主表id
     */
    private Integer orderId;
    /**
     * 订单主表序列号
     */
    private String orderSerial;
    /**
     * 商品id
     */
    private Integer productId;
    /**
     * 商品名
     */
    private String productName;
    /**
     * 商品单价，元
     */
    private BigDecimal productPrice;
    /**
     * 商品数量
     */
    private Integer productNumber;
    /**
     * 商品小图
     */
    private String productSmallIcon;
    /**
     * 是否删除；0--否， 1--是
     */
    private Integer isDelete;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 修改时间
     */
    private Date gmtModified;
}
