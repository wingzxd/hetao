package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.ProductClient;
import com.baixianguohai.hetao.core.manager.ProductManager;
import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 商品表
 *
 * @author chenyun
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Component
public class ProductManagerImpl implements ProductManager {

    @Autowired
    private ProductClient productClient;

    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public Result<List<ProductBO>> productList() {
        return productClient.productList();
    }
}
