package com.baxianguohai.hetao.service.service.impl;

import com.baxianguohai.hetao.biz.dal.mapper.UserMapper;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
