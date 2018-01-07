package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_Manager;

public interface NIC_ManagerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(NIC_Manager record);

    int insertSelective(NIC_Manager record);

    NIC_Manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(NIC_Manager record);

    int updateByPrimaryKey(NIC_Manager record);
}