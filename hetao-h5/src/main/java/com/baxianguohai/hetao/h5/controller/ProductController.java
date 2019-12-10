package com.baxianguohai.hetao.h5.controller;

import com.baixianguohai.hetao.core.manager.ProductManager;
import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品表
 *
 * @author chenyun
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
@RequestMapping("/hetao/product")
public class ProductController {

    @Autowired
    private ProductManager productManager;

        @RequestMapping("/productList")
    public Result<List<ProductBO>> productList(){
        return productManager.productList();
    }
}
