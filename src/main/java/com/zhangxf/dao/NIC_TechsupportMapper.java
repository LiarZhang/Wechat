package com.zhangxf.dao;

import java.util.List;

import com.zhangxf.pojo.NIC_Techsupport;

public interface NIC_TechsupportMapper {
    int deleteByPrimaryKey(Integer techsupportId);

    int insert(NIC_Techsupport record);

    int insertSelective(NIC_Techsupport record);

    NIC_Techsupport selectByPrimaryKey(Integer techsupportId);

    int updateByPrimaryKeySelective(NIC_Techsupport record);

    int updateByPrimaryKey(NIC_Techsupport record);
    /**
     *查询所有技术支持业务 
     */
    public List<NIC_Techsupport> findAllTechsupport();
    /**
	 * 查询业务进度
	 * @return 进度信息
	 */
	public String findStatusById(int id);
	/**
	 * 修改业务进度
	 * @param id 业务id
	 * @param status_id 状态id
	 */
	public void updateStatusById(int status_id,int id);
}