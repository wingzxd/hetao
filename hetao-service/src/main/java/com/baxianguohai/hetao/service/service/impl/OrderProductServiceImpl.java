package com.baxianguohai.hetao.service.service.impl;

import com.baxianguohai.hetao.biz.dal.mapper.OrderMapper;
import com.baxianguohai.hetao.service.service.OrderProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 订单商品表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Service
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderMapper orderMapper;

}
