package com.baxianguohai.hetao.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baxianguohai.hetao.biz.dal.mapper.ProductMapper;
import com.baxianguohai.hetao.biz.dal.model.ProductDO;
import com.baxianguohai.hetao.entity.bo.ProductBO;
import com.baxianguohai.hetao.entity.common.Result;
import com.baxianguohai.hetao.service.convert.ProductConverter;
import com.baxianguohai.hetao.service.service.ProductService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public Result<List<ProductBO>> productList() {
        Result<List<ProductBO>> result = new Result<List<ProductBO>>();

        QueryWrapper<ProductDO> queryWrapper = new QueryWrapper<>();
        ProductDO productDO = new ProductDO();
        productDO.setIsDelete(0);
        queryWrapper.setEntity(productDO);

        List<ProductDO> productDOS = productMapper.selectList(queryWrapper);
        return result.success(ProductConverter.convertToDO2BO(productDOS));
    }
}
