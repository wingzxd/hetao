package com.baxianguohai.hetaodamai.mall.web.controller;

import com.baxianguohai.hetaodamai.mall.web.Configuration.ConfigProperties;
import com.baxianguohai.hetaodamai.mall.web.client.BackEndClient;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zdf
 * @date:19-11-27
 */
@RestController
public class FeignClientController {
    @Autowired
    private BackEndClient backEndClient;
    @Resource
    private ConfigProperties configProperties;

    @RequestMapping(value = "/client/save/log")
    public String clentSaveLog() {
        String msg = backEndClient.saveLog();
        return msg;
    }

    /**
     * 测试读取配置信息
     * @return
     */
    @GetMapping("/getname")
    public String getName(){
        return configProperties.getApplicationName();
    }
}
