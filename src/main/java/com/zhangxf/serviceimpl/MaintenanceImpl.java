package com.zhangxf.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangxf.dao.NIC_MaintenanceMapper;
import com.zhangxf.pojo.NIC_Maintenance;
import com.zhangxf.service.MaintenanceService;
@Service("MaintenanceService")
public class MaintenanceImpl implements MaintenanceService{
	@Autowired
	private NIC_MaintenanceMapper MaintenanceDao;
	@Override
	public List<NIC_Maintenance> findAllMaintenance() {
		
		return MaintenanceDao.findAllMaintenance();
	}
	@Override
	public String findStatusById(int id) {
		return MaintenanceDao.findStatusById(id);
	}

}
