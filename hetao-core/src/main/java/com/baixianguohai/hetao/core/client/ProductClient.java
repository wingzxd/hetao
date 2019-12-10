package com.baixianguohai.hetao.core.client;

import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:chenyun
 * @date:19-11-27
 */
@FeignClient(value = "hetao-service")
public interface ProductClient {

    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping("/product/productList")
     Result<List<ProductBO>> productList();

}
