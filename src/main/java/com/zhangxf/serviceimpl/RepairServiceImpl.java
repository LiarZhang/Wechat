package com.zhangxf.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangxf.dao.NIC_RepairMapper;
import com.zhangxf.pojo.NIC_Repair;
import com.zhangxf.service.RepairService;
@Service("RepairService")
@Transactional
public class RepairServiceImpl implements RepairService {
	
	@Autowired
	private NIC_RepairMapper repairDao;
	@Override
	public List<NIC_Repair> findAllRepair() {
		return repairDao.findAllRepair();
	}
	@Override
	public String findStatusById(int id) {
		return repairDao.findStatusById(id);
	}

}
