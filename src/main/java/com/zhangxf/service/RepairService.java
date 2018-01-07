package com.zhangxf.service;

import java.util.List;

import com.zhangxf.pojo.NIC_Repair;

public interface RepairService {
	
	/**
	 * 查询所有设备报修的业务
	 */
	public  List<NIC_Repair> findAllRepair();
	/**
	 * 查询业务的状态信息
	 */
	public String findStatusById(int id);
}
