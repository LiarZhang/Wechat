package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_Suggest;

public interface NIC_SuggestMapper {
    int deleteByPrimaryKey(Integer suggestId);

    int insert(NIC_Suggest record);

    int insertSelective(NIC_Suggest record);

    NIC_Suggest selectByPrimaryKey(Integer suggestId);

    int updateByPrimaryKeySelective(NIC_Suggest record);

    int updateByPrimaryKey(NIC_Suggest record);
}