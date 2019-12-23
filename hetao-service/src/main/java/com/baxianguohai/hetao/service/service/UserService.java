package com.baxianguohai.hetao.service.service;

import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.entity.common.Result;

/**
 * 用户表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public interface UserService {

    /**
     * 用户登陆
     * @param userBO
     * @return
     */
    Result<String> login(UserBO userBO);

    /**
     * 用户注册
     * @param userBO
     * @return
     */
    Result<String> register(UserBO userBO);


}
