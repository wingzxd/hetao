package com.baxianguohai.hetao.h5.controller;

import com.baixianguohai.hetao.core.manager.UserManager;
import com.baxianguohai.hetao.entity.bo.UserBO;
import com.baxianguohai.hetao.entity.common.Result;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
@RequestMapping("/hetao/user")
public class UserController {

    @Autowired
    private UserManager userManager;

    @PostMapping("/login")
    public Result<String> login(@RequestBody UserBO userBO) {
     return userManager.login(userBO);
    }

    @PostMapping("/register")
    public Result<String> register(@RequestBody UserBO userBO){
     return userManager.register(userBO);
    }



}
