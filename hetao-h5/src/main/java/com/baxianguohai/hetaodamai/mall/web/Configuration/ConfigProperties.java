/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.baxianguohai.hetaodamai.mall.web.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * 配置类
 *
 * @author chenjy
 * @version V1.0
 * @since 2019-12-03 17:31
 */
@Configuration
@Data
@RefreshScope
public class ConfigProperties {

    @Value("${spring.application.name}")
    private String applicationName;

}
