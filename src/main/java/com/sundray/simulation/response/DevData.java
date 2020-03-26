package com.sundray.simulation.response;

import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-26  22:56
 **/
public class DevData {
    private String DEV_GATEWAY;
    private String DEV_LORADBM;
    private Map<String, String> cloud_state;
    private Map<String, String> sync_state;

    public DevData() {
    }

    public DevData(String DEV_GATEWAY, String DEV_LORADBM, Map<String, String> cloud_state, Map<String, String> sync_state) {
        this.DEV_GATEWAY = DEV_GATEWAY;
        this.DEV_LORADBM = DEV_LORADBM;
        this.cloud_state = cloud_state;
        this.sync_state = sync_state;
    }

    public String getDEV_GATEWAY() {
        return DEV_GATEWAY;
    }

    public void setDEV_GATEWAY(String DEV_GATEWAY) {
        this.DEV_GATEWAY = DEV_GATEWAY;
    }

    public String getDEV_LORADBM() {
        return DEV_LORADBM;
    }

    public void setDEV_LORADBM(String DEV_LORADBM) {
        this.DEV_LORADBM = DEV_LORADBM;
    }

    public Map<String, String> getCloud_state() {
        return cloud_state;
    }

    public void setCloud_state(Map<String, String> cloud_state) {
        this.cloud_state = cloud_state;
    }

    public Map<String, String> getSync_state() {
        return sync_state;
    }

    public void setSync_state(Map<String, String> sync_state) {
        this.sync_state = sync_state;
    }
}
