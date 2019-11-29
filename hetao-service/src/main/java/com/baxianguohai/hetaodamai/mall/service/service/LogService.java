package com.baxianguohai.hetaodamai.mall.service.service;

import com.baxianguohai.hetaodamai.mall.entity.bo.LogBo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface LogService {
    void save(@NotNull @Valid LogBo logBo);
}
