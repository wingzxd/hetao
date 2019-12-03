package com.baxianguohai.hetao.biz.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Data
@TableName("ht_product")
public class ProductDO{

    /**
     * 
     */
    @TableId(type = IdType.AUTO)
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
