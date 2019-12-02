package com.baxianguohai.hetaodamai.service.service.impl;

import com.baxianguohai.hetaodamai.biz.dao.LogDao;
import com.baxianguohai.hetaodamai.biz.model.LogDo;
import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import com.baxianguohai.hetaodamai.service.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author:zdf
 * @date:19-11-27
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public void save(@NotNull @Valid LogBo logBo) {
        LogDo logPo = new LogDo();
        logPo.setOperationType(logBo.getOperationType());
        logPo.setOperator(logBo.getOperator());
        logDao.save(logPo);
        System.out.println("1111111111111111");
    }
}
