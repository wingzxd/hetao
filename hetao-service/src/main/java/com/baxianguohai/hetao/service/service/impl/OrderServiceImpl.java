package com.baxianguohai.hetao.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.biz.dal.mapper.OrderMapper;
import com.baxianguohai.hetao.biz.dal.mapper.OrderProductMapper;
import com.baxianguohai.hetao.biz.dal.model.OrderDO;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.entity.bo.OrderProductBO;
import com.baxianguohai.hetao.service.convert.OrderConverter;
import com.baxianguohai.hetao.service.service.OrderProductService;
import com.baxianguohai.hetao.service.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

    @Override
    @Transactional
    public String save(String userId, String productId) {
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

    @Override
    public Page<OrderBO> list(String userId, Integer orderStatus) {
        QueryWrapper<OrderDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(OrderDO::getOrderStatus, orderStatus);
        Page<OrderDO> page = new Page<>();
        page.setDesc("gmt_created");
        IPage<OrderDO> orderDOPage = orderMapper.selectPage(page, queryWrapper);
        Page<OrderBO> pageResult = new Page<>();
        pageResult.setSize(page.getSize());
        pageResult.setCurrent(page.getCurrent());
        pageResult.setTotal(page.getTotal());
        List<OrderBO> orderBOList = Lists.newArrayList();
        orderDOPage.getRecords().stream().forEach(orderDO -> orderBOList.add(OrderConverter.convertToDO2BO(orderDO)));
        pageResult.setRecords(orderBOList);
        return pageResult;
    }
}
