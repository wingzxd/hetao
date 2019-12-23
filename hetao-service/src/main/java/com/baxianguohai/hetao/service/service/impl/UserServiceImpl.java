package com.baxianguohai.hetao.service.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baxianguohai.hetao.biz.dal.mapper.UserMapper;
import com.baxianguohai.hetao.biz.dal.model.UserDO;
import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.entity.common.Result;
import com.baxianguohai.hetao.service.convert.UserConverter;
import com.baxianguohai.hetao.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 用户表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO>
    implements UserService {

    @Override
    public Result<String> login(UserBO userBO) {
        Result<String> result = new Result<>();
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserDO::getPhone,userBO.getPhone());
        queryWrapper.eq(UserDO::getIsDelete,0);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if(userDO == null){
            return result.failure("该用户不存在！");
        }
        if(userBO.getPhone().equals(userDO.getPhone())){
            return result.success("登陆成功!");
        }
        return result.failure("用户名或密码错误！");

    }

    @Override
    public Result<String> register(UserBO userBO) {
        Result<String> result = new Result<>();
        //检查手机号是否已注册
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserDO::getPhone,userBO.getPhone());
        queryWrapper.eq(UserDO::getIsDelete,0);
        if(baseMapper.selectCount(queryWrapper) > 0){
            log.error("该用户已存在！入参={}", JSON.toJSONString(userBO));
           return result.failure("该手机号已存在!");
        }
        UserDO insertDO = UserConverter.convertToBO2DO(userBO);
        baseMapper.insert(insertDO);
        return result.success("注册成功！");
    }
}
