package com.zhangxf.dao;

import com.zhangxf.pojo.NIC_Aboutme;

public interface NIC_AboutmeMapper {
    int insert(NIC_Aboutme record);

    int insertSelective(NIC_Aboutme record);
}