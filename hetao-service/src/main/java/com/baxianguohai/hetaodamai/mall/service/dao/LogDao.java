package com.baxianguohai.hetaodamai.mall.service.dao;


import com.baxianguohai.hetaodamai.mall.entity.po.LogPo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface LogDao {

    void save(@NotNull @Valid LogPo logPo);

}