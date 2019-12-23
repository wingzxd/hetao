package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.UserClient;
import com.baixianguohai.hetao.core.manager.UserManager;
import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.entity.common.Result;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

/**
 * 用户表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@Component
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserClient userClient;

    @Override
    public Result<String> login(UserBO userBO) {
        return userClient.login(userBO);
    }

    @Override
    public Result<String> register(UserBO userBO) {
        return userClient.register(userBO);
    }
}
