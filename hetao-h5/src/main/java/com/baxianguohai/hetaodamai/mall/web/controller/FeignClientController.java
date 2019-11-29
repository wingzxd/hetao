package com.baxianguohai.hetaodamai.mall.web.controller;

import com.baxianguohai.hetaodamai.mall.web.client.BackEndClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/client/save/log")
    public String clentSaveLog() {
        String msg = backEndClient.saveLog();
        return msg;
    }
}
