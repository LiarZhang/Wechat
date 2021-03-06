package com.zhangxf.pojo;

import java.util.Date;

public class NIC_Maintenance {
    private Integer maintenanceId;

    private Integer userId;

    private String maintenanceDepartment;

    private String maintenanceDevicename;

    private String maintenanceLocation;

    private String maintenanceDescribe;

    private String maintenancePicture;

    private String maintenanceFeedback;

    private Date maintenanceUptime;

    private Date maintenanceEndtime;

    private Integer statusId;

    private Integer managerId;

    public Integer getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(Integer maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMaintenanceDepartment() {
        return maintenanceDepartment;
    }

    public void setMaintenanceDepartment(String maintenanceDepartment) {
        this.maintenanceDepartment = maintenanceDepartment == null ? null : maintenanceDepartment.trim();
    }

    public String getMaintenanceDevicename() {
        return maintenanceDevicename;
    }

    public void setMaintenanceDevicename(String maintenanceDevicename) {
        this.maintenanceDevicename = maintenanceDevicename == null ? null : maintenanceDevicename.trim();
    }

    public String getMaintenanceLocation() {
        return maintenanceLocation;
    }

    public void setMaintenanceLocation(String maintenanceLocation) {
        this.maintenanceLocation = maintenanceLocation == null ? null : maintenanceLocation.trim();
    }

    public String getMaintenanceDescribe() {
        return maintenanceDescribe;
    }

    public void setMaintenanceDescribe(String maintenanceDescribe) {
        this.maintenanceDescribe = maintenanceDescribe == null ? null : maintenanceDescribe.trim();
    }

    public String getMaintenancePicture() {
        return maintenancePicture;
    }

    public void setMaintenancePicture(String maintenancePicture) {
        this.maintenancePicture = maintenancePicture == null ? null : maintenancePicture.trim();
    }

    public String getMaintenanceFeedback() {
        return maintenanceFeedback;
    }

    public void setMaintenanceFeedback(String maintenanceFeedback) {
        this.maintenanceFeedback = maintenanceFeedback == null ? null : maintenanceFeedback.trim();
    }

    public Date getMaintenanceUptime() {
        return maintenanceUptime;
    }

    public void setMaintenanceUptime(Date maintenanceUptime) {
        this.maintenanceUptime = maintenanceUptime;
    }

    public Date getMaintenanceEndtime() {
        return maintenanceEndtime;
    }

    public void setMaintenanceEndtime(Date maintenanceEndtime) {
        this.maintenanceEndtime = maintenanceEndtime;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}