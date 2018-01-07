package com.zhangxf.dao;

import com.zhangxf.pojo.nic_article;

public interface nic_articleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(nic_article record);

    int insertSelective(nic_article record);

    nic_article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(nic_article record);

    int updateByPrimaryKey(nic_article record);
}