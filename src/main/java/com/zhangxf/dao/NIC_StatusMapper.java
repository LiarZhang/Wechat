package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_Status;

public interface NIC_StatusMapper {
    int deleteByPrimaryKey(Integer statusId);

    int insert(NIC_Status record);

    int insertSelective(NIC_Status record);

    NIC_Status selectByPrimaryKey(Integer statusId);

    int updateByPrimaryKeySelective(NIC_Status record);

    int updateByPrimaryKey(NIC_Status record);
}