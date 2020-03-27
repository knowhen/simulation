package com.sundray.simulation.response;

import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-27  12:42
 **/
public class NormalDevData extends DevData {
    private String DEV_GATEWAY;
    private String DEV_LORADBM;

    public NormalDevData() {
    }

    public NormalDevData(String DEV_GATEWAY, String DEV_LORADBM, Map<String, String> cloud_state,
                         Map<String, String> sync_state) {
        super(cloud_state, sync_state);
        this.DEV_GATEWAY = DEV_GATEWAY;
        this.DEV_LORADBM = DEV_LORADBM;
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
}
