package com.baxianguohai.hetao.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baxianguohai.hetao.biz.dal.mapper.OrderMapper;
import com.baxianguohai.hetao.biz.dal.mapper.OrderProductMapper;
import com.baxianguohai.hetao.biz.dal.model.OrderProductDO;
import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import com.baxianguohai.hetao.service.convert.OrderProductConverter;
import com.baxianguohai.hetao.service.service.OrderProductService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private OrderProductMapper orderProductMapper;

    @Override
    public List<OrderProductBO> selectByOrderId(Integer orderId) {
        QueryWrapper<OrderProductDO> orderProductDOQueryWrapper = new QueryWrapper<>();
        orderProductDOQueryWrapper.lambda().eq(OrderProductDO::getOrderId, orderId);
        List<OrderProductDO> orderProductDOS = orderProductMapper.selectList(orderProductDOQueryWrapper);
        List<OrderProductBO> orderProductBOList = Lists.newArrayList();
        orderProductDOS.stream().forEach(orderProductDO -> orderProductBOList.add(OrderProductConverter.convertToDO2BO(orderProductDO)));
        return orderProductBOList;
    }
}
