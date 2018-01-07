package com.zhangxf.service;

import java.util.List;

import com.zhangxf.pojo.NIC_Maintenance;

public interface MaintenanceService {
	/**
	 * 查询所有日常运维的业务
	 */
	public  List<NIC_Maintenance> findAllMaintenance();
	/**
	 * 查询业务的状态
	 */
	public String findStatusById(int id);
}
