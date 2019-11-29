package com.baxianguohai.hetaodamai.mall.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class LogBo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    Long id;

    /**
     * 操作人
     */
    String operator;

    /**
     * 操作类型
     */
    String operationType;

    /**
     * 操作数据
     */
    String operationData;

    /**
     * 创建时间
     */
    LocalDateTime gmtCreated;

    /**
     * 最后修改时间
     */
    LocalDateTime gmtModified;

    /**
     * 是否删除；0--否，1--是
     */
    Integer isDelete;
}
