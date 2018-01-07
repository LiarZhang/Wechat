package com.zhangxf.dao;

import java.util.List;

import com.zhangxf.pojo.NIC_Maintenance;

public interface NIC_MaintenanceMapper {
    int deleteByPrimaryKey(Integer maintenanceId);

    int insert(NIC_Maintenance record);

    int insertSelective(NIC_Maintenance record);

    NIC_Maintenance selectByPrimaryKey(Integer maintenanceId);

    int updateByPrimaryKeySelective(NIC_Maintenance record);

    int updateByPrimaryKey(NIC_Maintenance record);
    /**
	 * 查询所有日常运维的业务
	 */
	public  List<NIC_Maintenance> findAllMaintenance();
	/**
	 * 查询业务的状态
	 */
	public String findStatusById(int id);
}