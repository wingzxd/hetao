package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.ProductClient;
import com.baixianguohai.hetao.core.manager.ProductManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Component
public class ProductManagerImpl implements ProductManager {

    @Autowired
    private ProductClient productClient;

}
