/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.baxianguohai.hetao.h5.Configuration.Sentinel;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置熔断规则
 *
 * @author yinhz
 * @version V1.0
 * @since 2019-12-06 11:05
 */
public class SentinelRuleConfig {

    /**
     * 流量限制
     */
    public static void initFlowRules(){
        //配置熔断规则
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        //对应资源名称
        rule.setResource("hetao_sentinel_limit_qps");

        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //Set limit QPS to 10.每秒请求处理量
        rule.setCount(1);
        //并发线程数模式
        //rule.setGrade((RuleConstant.FLOW_GRADE_THREAD));
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }


    public static void initDegradeRule() {
        String resourceName="hetao_sentinel_limit_ex_ratio";
        List<DegradeRule> rules = new ArrayList<DegradeRule>();
        DegradeRule rule = new DegradeRule();
        //超时规则
        //        rule.setResource(resourceName);
        //        // set threshold rt, 10 ms
        //        rule.setCount(10);
        //        rule.setGrade(RuleConstant.DEGRADE_GRADE_RT);
        //        rule.setTimeWindow(10);
        //        rules.add(rule);

        //异常比例规则
        rule = new DegradeRule();
        rule.setResource(resourceName);
        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_RATIO);
        //异常比率的阈值范围是 [0.0, 1.0]，代表 0% - 100%
        rule.setCount(0.2);
        rule.setTimeWindow(60);
        rules.add(rule);
        DegradeRuleManager.loadRules(rules);
    }
}
