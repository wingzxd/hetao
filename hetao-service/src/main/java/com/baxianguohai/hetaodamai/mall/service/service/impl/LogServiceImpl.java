package com.baxianguohai.hetaodamai.mall.service.service.impl;

import com.baxianguohai.hetaodamai.mall.entity.bo.LogBo;
import com.baxianguohai.hetaodamai.mall.entity.po.LogPo;
import com.baxianguohai.hetaodamai.mall.service.dao.LogDao;
import com.baxianguohai.hetaodamai.mall.service.service.LogService;
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
        LogPo logPo = new LogPo();
        logPo.setOperationType(logBo.getOperationType());
        logPo.setOperator(logBo.getOperator());
        logDao.save(logPo);
        System.out.println("1111111111111111");
    }
}
