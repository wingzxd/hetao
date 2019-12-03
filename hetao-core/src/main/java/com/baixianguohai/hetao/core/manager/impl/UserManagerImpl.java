package com.baixianguohai.hetao.core.manager.impl;

import com.baixianguohai.hetao.core.client.UserClient;
import com.baixianguohai.hetao.core.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

}
