package com.baxianguohai.hetao.service.controller;

import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;
import com.baxianguohai.hetao.service.service.ProductService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public Result<List<ProductBO>> productList(){
        return productService.productList();
    }
}

