package com.baxianguohai.hetao.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Data
public class ProductBO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 
     */
    private Integer id;
    /**
     * 商品名
     */
    private String productName;
    /**
     * 数量
     */
    private Integer productNumber;
    /**
     * 价格，元
     */
    private BigDecimal price;
    /**
     * 商品描述
     */
    private String productDescription;
    /**
     * 商品轮播图，存储5张图片
     */
    private String productSlideshow;
    /**
     * 商品小图
     */
    private String productSmallIcon;
    /**
     * 产品介绍，一张图片
     */
    private String productIntroduce;
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
