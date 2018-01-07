package com.zhangxf.service;

import java.util.List;

import com.zhangxf.pojo.NIC_Techsupport;

/**
 * 业务信息
 * @author Liar
 *
 */
public interface TechsupportService {
	/**
	 * 查询所有技术支持的业务信息
	 */
	public List<NIC_Techsupport> findAllTechsupport();
//	public  List<NIC_Techsupport> listTechsupport=new ArrayList<NIC_Techsupport>();
	
	
//	public <T> T getObject(Class<T> entityClass, int id);  
////	{  
////	    return getHibernateTemplate().load(entityClass, id);  
////	}  
	/**
	 * 查询业务进度
	 * @return
	 */
	public String findStatusById(int id);
	
	public void updateStatusById(int status_id,int id);
	
}
