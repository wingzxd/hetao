package com.baxianguohai.hetaodamai.mall.service.controller;


import com.baxianguohai.hetaodamai.mall.entity.bo.LogBo;
import com.baxianguohai.hetaodamai.mall.service.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zdf
 * @date:19-11-26
 */
@RestController
class BackEndController {
    @Autowired
    private LogService logService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello spring cloud";
    }

    @RequestMapping(value = "/save/log")
    public String saveLog() {
        LogBo logBo = new LogBo();
        logBo.setOperator("test spring cloud");
        logBo.setOperationType("123");
        logService.save(logBo);
        return "success";
    }
}
