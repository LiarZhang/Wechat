package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_Information;

public interface NIC_InformationMapper {
    int deleteByPrimaryKey(Integer informationId);

    int insert(NIC_Information record);

    int insertSelective(NIC_Information record);

    NIC_Information selectByPrimaryKey(Integer informationId);

    int updateByPrimaryKeySelective(NIC_Information record);

    int updateByPrimaryKey(NIC_Information record);
}