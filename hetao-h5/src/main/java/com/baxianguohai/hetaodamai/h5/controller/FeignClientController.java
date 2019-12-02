package com.baxianguohai.hetaodamai.h5.controller;

import com.baixianguohai.hetaodamai.core.manager.TestLogManager;
import com.baixianguohai.hetaodamai.core.vo.LogVo;
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
    private TestLogManager testLogManager;

    @RequestMapping(value = "/client/save/log")
    public String clentSaveLog(String operationData) {
        String msg = testLogManager.saveLog(operationData);
        LogVo logVo = new LogVo();
        return msg;
    }
}
