package com.baxianguohai.hetaodamai.service.service;

import com.baxianguohai.hetaodamai.entity.bo.LogBo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface LogService {
    void save(LogBo logBo);
}
