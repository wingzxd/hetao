package com.baxianguohai.hetao.service.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import java.time.LocalDate;
import java.util.Date;

import javax.xml.crypto.Data;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * mybatis-plus字段自填充设置
 *
 * @author chenjy
 * @date 2019/12/20 16:09
 */
@Component
public class MybatisPlusObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        //新增时填充的字段
        Date now = new Date();
        setFieldValByName("gmtCreated", now, metaObject);
        setFieldValByName("gmtModified", now, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新时 需要填充字段
        setFieldValByName("gmtModified", new Date(), metaObject);
    }
}