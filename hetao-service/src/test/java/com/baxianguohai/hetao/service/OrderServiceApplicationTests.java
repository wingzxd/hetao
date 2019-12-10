package com.baxianguohai.hetao.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baxianguohai.hetao.entity.bo.OrderBO;
import com.baxianguohai.hetao.service.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HeTaoServiceApplication.class)
public class OrderServiceApplicationTests {

    @Autowired
    private OrderService orderService;
    @Test
    public void save(){
        String save = orderService.save("123", "123456");
        System.out.println(save);
    }

    @Test
    public void selectPage(){
        Page<OrderBO> list = orderService.list("123", null);
    }
}
