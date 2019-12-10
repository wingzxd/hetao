package com.baxianguohai.hetao.service.service.impl;

import com.baxianguohai.hetao.biz.dal.mapper.OrderMapper;
import com.baxianguohai.hetao.biz.dal.mapper.OrderProductMapper;
import com.baxianguohai.hetao.biz.dal.mapper.ProductMapper;
import com.baxianguohai.hetao.biz.dal.mapper.UserMapper;
import com.baxianguohai.hetao.biz.dal.model.OrderDO;
import com.baxianguohai.hetao.biz.dal.model.ProductDO;
import com.baxianguohai.hetao.biz.dal.model.UserDO;
import com.baxianguohai.hetao.entity.bo.CreateOrderBO;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.service.convert.OrderConverter;
import com.baxianguohai.hetao.service.service.OrderProductService;
import com.baxianguohai.hetao.service.service.OrderService;
import lombok.extern.slf4j.Slf4j;

import org.apache.ibatis.annotations.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotBlank;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderProductMapper orderProductMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public String save(@NotBlank CreateOrderBO createOrderBO) {


        //1:检查库存


        ProductDO productDO = productMapper.selectById(createOrderBO.getProductId()) ;
        //产品
        if(productDO == null){
            return null;
        }
        //验证库存
        if(productDO.getProductNumber()==null || productDO.getProductNumber() < createOrderBO.getQuantity()){
            return null;
        }
        //用户
        UserDO userDO = userMapper.selectById(createOrderBO.getUserId());
        if(userDO==null){
            return null;
        }

        //lock

        //再次判断库存
        //扣减库存


        //保存订单主信息

        //保存订单商品信息
        //unlock








        OrderBO orderBO = new OrderBO();
        orderBO.setExpressPrice(new BigDecimal(10));
        orderBO.setReceiverName("test");
        orderBO.setGmtCreated(new Date());
        orderBO.setGmtModified(new Date());
        orderBO.setIsDelete(0);
        orderBO.setOrderPrice(new BigDecimal(10));
        orderBO.setOrderStatus(1);
        orderBO.setOrderSerial("1234567890");
        orderBO.setReceiverAddress("test");
        orderBO.setReceiverPhone("15555555555");
        orderBO.setTotalProductPrice(new BigDecimal(10));
        int insert = orderMapper.insert(OrderConverter.convertToBO2DO(orderBO));
        OrderProductBO orderProductBO = new OrderProductBO();

        return insert > 0 ? "成功" : "失败";
    }
}
