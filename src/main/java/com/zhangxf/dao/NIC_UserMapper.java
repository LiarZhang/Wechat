package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_User;

public interface NIC_UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(NIC_User record);

    int insertSelective(NIC_User record);

    NIC_User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(NIC_User record);

    int updateByPrimaryKey(NIC_User record);
}