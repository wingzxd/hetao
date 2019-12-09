/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.baxianguohai.hetao.h5.Configuration.Sentinel;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sentinel注解支持
 *
 * @author weiyi
 * @version V1.0
 * @since 2019-12-06 10:57
 */
@Configuration
public class SentinelRAspectConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}
