package com.baixianguohai.hetaodamai.core.manager.impl;

import com.baixianguohai.hetaodamai.core.manager.TestLogManager;
import com.baixianguohai.hetaodamai.core.client.BackEndClient;
import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author:zdf
 * @date:19-12-2
 */
@Component
public class TestLogManagerImpl implements TestLogManager {

    @Autowired
    private BackEndClient backEndClient;
    @Override
    public String saveLog(String operationData) {
        LogBo logBo = new LogBo();
        logBo.setOperationType("12345");
        logBo.setOperationData(operationData);
        String s = backEndClient.saveLog(logBo);
        return "test core";
    }
}
