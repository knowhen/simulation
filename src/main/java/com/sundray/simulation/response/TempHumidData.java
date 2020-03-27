package com.sundray.simulation.response;

import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-27  09:12
 **/
public class TempHumidData extends NormalDevData {
    private String DEV_LUX;
    private String DEV_MOISTURE;
    private String DEV_SOC;
    private String DEV_TEMPRATURE;

    public TempHumidData(String DEV_GATEWAY, String DEV_LORADBM, Map<String, String> cloud_state,
                         Map<String, String> sync_state) {
        super(DEV_GATEWAY, DEV_LORADBM, cloud_state, sync_state);
    }

    public String getDEV_LUX() {
        return DEV_LUX;
    }

    public void setDEV_LUX(String DEV_LUX) {
        this.DEV_LUX = DEV_LUX;
    }

    public String getDEV_MOISTURE() {
        return DEV_MOISTURE;
    }

    public void setDEV_MOISTURE(String DEV_MOISTURE) {
        this.DEV_MOISTURE = DEV_MOISTURE;
    }

    public String getDEV_SOC() {
        return DEV_SOC;
    }

    public void setDEV_SOC(String DEV_SOC) {
        this.DEV_SOC = DEV_SOC;
    }

    public String getDEV_TEMPRATURE() {
        return DEV_TEMPRATURE;
    }

    public void setDEV_TEMPRATURE(String DEV_TEMPRATURE) {
        this.DEV_TEMPRATURE = DEV_TEMPRATURE;
    }
}
