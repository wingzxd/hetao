package com.baxianguohai.hetao.biz.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单主表
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Data
@TableName("ht_order")
public class OrderDO{

    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 订单序列号
     */
    private String orderSerial;
    /**
     * 收货人
     */
    private String receiverName;
    /**
     * 收货人手机号
     */
    private String receiverPhone;
    /**
     * 收货人地址
     */
    private String receiverAddress;
    /**
     * 商品总价，元
     */
    private BigDecimal totalProductPrice;
    /**
     * 快递费,元
     */
    private BigDecimal expressPrice;
    /**
     * 订单总金额，元
     */
    private BigDecimal orderPrice;
    /**
     * 支付状态：0待支付，1已支付
     */
    private Integer payStatus;
    /**
     * 订单状态：0待发货，1待收货，3完成
     */
    private Integer orderStatus;
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

    /**
     * 用户id
     */
    private String userId;
}
