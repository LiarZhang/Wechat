package com.zhangxf.dao;

import java.util.List;

import com.zhangxf.pojo.NIC_Repair;

public interface NIC_RepairMapper {
    int deleteByPrimaryKey(Integer repairId);

    int insert(NIC_Repair record);

    int insertSelective(NIC_Repair record);

    NIC_Repair selectByPrimaryKey(Integer repairId);

    int updateByPrimaryKeySelective(NIC_Repair record);

    int updateByPrimaryKey(NIC_Repair record);
    /**
     *查询所有设备报修业务 
     */
    public List<NIC_Repair> findAllRepair();
    /**
     * 查询某个业务的状态信息
     */
    public String findStatusById(int id);
}