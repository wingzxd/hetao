package com.baxianguohai.hetao.service.service;

import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;

import java.util.List;

/**
 * 商品表
 *
 * @author chenyun
 * @date 2019-12-02 17:44:43
 */
public interface ProductService {

    /**
     * 查询所有商品
     * @return
     */
    public Result<List<ProductBO>> productList();


}
