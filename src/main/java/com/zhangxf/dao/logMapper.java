package com.zhangxf.dao;

import com.zhangxf.pojo.log;

public interface logMapper {
    int deleteByPrimaryKey(Long id);

    int insert(log record);

    int insertSelective(log record);

    log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(log record);

    int updateByPrimaryKey(log record);
}