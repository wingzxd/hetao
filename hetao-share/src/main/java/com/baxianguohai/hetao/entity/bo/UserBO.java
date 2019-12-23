package com.baxianguohai.hetao.entity.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Data
public class UserBO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 手机号，登录名
     */
    private String phone;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 是否删除；0--否， 1--是
     */
    private Integer isDelete;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 修改时间
     */
    private Date gmtModified;
}
