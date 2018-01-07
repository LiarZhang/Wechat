package com.zhangxf.dao;

import com.zhangxf.pojo.article;
import com.zhangxf.pojo.articleWithBLOBs;

public interface articleMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(articleWithBLOBs record);

	int insertSelective(articleWithBLOBs record);

	articleWithBLOBs selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(articleWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(articleWithBLOBs record);

	int updateByPrimaryKey(article record);

	int deleteByPrimaryKey(Integer id);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);
}