package com.baxianguohai.hetao.service.convert;



import com.baxianguohai.hetao.biz.dal.model.UserDO;
import com.baxianguohai.hetao.entity.bo.UserBO;

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
     * @param htUserBO
     * @return userDO
     */
    public static UserDO convertToBO2DO(UserBO htUserBO) {
        if (Objects.isNull(htUserBO)) {
            return null;
        }
        UserDO userDO = new UserDO();
        userDO.setId(htUserBO.getId());
        userDO.setName(htUserBO.getName());
        userDO.setPhone(htUserBO.getPhone());
        userDO.setPassword(htUserBO.getPassword());
        userDO.setIsDelete(htUserBO.getIsDelete());
        userDO.setGmtCreated(htUserBO.getGmtCreated());
        userDO.setGmtModified(htUserBO.getGmtModified());
        return userDO;
    }
}
