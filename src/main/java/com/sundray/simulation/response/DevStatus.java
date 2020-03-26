package com.sundray.simulation.response;

/**
 * @author: when
 * @create: 2020-03-26  22:53
 **/
public class DevStatus {
    private Integer app_id;
    private String app_name;
    private DevData data;
    private Integer group_id;
    private String group_name;
    private String hardVer;
    private String lastTime;
    private String name;
    private String onlineTime;
    private Integer root_group_id;
    private String root_group_name;
    private String softVer;
    private String states;
    private Boolean success;

    public Integer getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public DevData getData() {
        return data;
    }

    public void setData(DevData data) {
        this.data = data;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getHardVer() {
        return hardVer;
    }

    public void setHardVer(String hardVer) {
        this.hardVer = hardVer;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Integer getRoot_group_id() {
        return root_group_id;
    }

    public void setRoot_group_id(Integer root_group_id) {
        this.root_group_id = root_group_id;
    }

    public String getRoot_group_name() {
        return root_group_name;
    }

    public void setRoot_group_name(String root_group_name) {
        this.root_group_name = root_group_name;
    }

    public String getSoftVer() {
        return softVer;
    }

    public void setSoftVer(String softVer) {
        this.softVer = softVer;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
