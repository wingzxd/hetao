package com.baxianguohai.hetaodamai.biz.dao;



import com.baxianguohai.hetaodamai.biz.model.LogDo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface LogDao {

    void save(@NotNull @Valid LogDo logPo);

}