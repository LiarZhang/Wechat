package com.zhangxf.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangxf.dao.NIC_TechsupportMapper;
import com.zhangxf.pojo.NIC_Techsupport;
import com.zhangxf.service.TechsupportService;
@Service("techsupportService")  
@Transactional  //注入事务管理 
public class TechsupportServiceImpl implements TechsupportService {
	
	@Autowired
	private NIC_TechsupportMapper techsupportMapper;
	

	@Override
	public String findStatusById(int id) {
		System.out.println("此时的id="+id);
		System.out.println("此时业务的状态信息为："+techsupportMapper+"   "+techsupportMapper.selectByPrimaryKey(id).getStatusId());
		//return 
		System.out.println(techsupportMapper.selectByPrimaryKey(id).getStatusId());
		System.out.println(techsupportMapper.findStatusById(id));
		return techsupportMapper.findStatusById(id);
	}

	@Override
	public List<NIC_Techsupport> findAllTechsupport() {
		List<NIC_Techsupport> listTechsupport=new ArrayList<NIC_Techsupport>();
		System.out.println("findall====");
		System.out.println(techsupportMapper);
		System.out.println(techsupportMapper.findAllTechsupport());
		listTechsupport=techsupportMapper.findAllTechsupport();
		for (NIC_Techsupport nic_Techsupport : listTechsupport) {
			System.out.println("对象内容："+nic_Techsupport);
			System.out.println("nishi===="+nic_Techsupport.getTechsupportUptime());
			System.out.println("nishi===="+nic_Techsupport.getTechsupportDescribe());
		}
		return techsupportMapper.findAllTechsupport();
	}

	@Override
	public void updateStatusById( int status_id,int id) {
		techsupportMapper.updateStatusById(status_id,id);
	}

}
