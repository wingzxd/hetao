package com.baxianguohai.hetao.service.convert;



import com.baxianguohai.hetao.biz.dal.model.UserDO;
import com.baxianguohai.hetao.entity.bo.UserBO;

import java.util.Date;
import java.util.Objects;

/**
 * 用户表实体类转换器
 * 
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
public class UserConverter {

    /**
     * Convert UserDO to UserBO
     *
     * @param userDO
     * @return htUserBO
     */
    public static UserBO convertToDO2BO(UserDO userDO) {
        if (Objects.isNull(userDO)) {
            return null;
        }
        UserBO htUserBO = new UserBO();
        htUserBO.setId(userDO.getId());
        htUserBO.setName(userDO.getName());
        htUserBO.setPhone(userDO.getPhone());
        htUserBO.setPassword(userDO.getPassword());
        htUserBO.setIsDelete(userDO.getIsDelete());
        htUserBO.setGmtCreated(userDO.getGmtCreated());
        htUserBO.setGmtModified(userDO.getGmtModified());
        return htUserBO;
    }

    /**
     * Convert UserBO to UserDO
     *
     * @param userBO
     * @return userDO
     */
    public static UserDO convertToBO2DO(UserBO userBO) {
        if (Objects.isNull(userBO)) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setId(userBO.getId());
        userDO.setName(userBO.getName());
        userDO.setPhone(userBO.getPhone());
        userDO.setPassword(userBO.getPassword());
        userDO.setIsDelete(userBO.getIsDelete());
        userDO.setGmtCreated(new Date());
        userDO.setGmtModified(new Date());
        return userDO;
    }
}
