package com.zhangxf.pojo;

public class NIC_Manager {
    private Integer managerId;

    private String managerName;

    private String managerTelephone;

    private String managerDuty;

    private Integer managerTyp;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerTelephone() {
        return managerTelephone;
    }

    public void setManagerTelephone(String managerTelephone) {
        this.managerTelephone = managerTelephone == null ? null : managerTelephone.trim();
    }

    public String getManagerDuty() {
        return managerDuty;
    }

    public void setManagerDuty(String managerDuty) {
        this.managerDuty = managerDuty == null ? null : managerDuty.trim();
    }

    public Integer getManagerTyp() {
        return managerTyp;
    }

    public void setManagerTyp(Integer managerTyp) {
        this.managerTyp = managerTyp;
    }
}