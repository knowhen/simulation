package com.sundray.simulation.response;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-27  12:31
 **/
public class DevData {
    private Map<String, String> cloud_state;
    private Map<String, String> sync_state;

    public DevData() {
        this.cloud_state = new HashMap<>();
        this.sync_state = new HashMap<>();
    }

    public DevData(Map<String, String> cloud_state, Map<String, String> sync_state) {
        this.cloud_state = cloud_state;
        this.sync_state = sync_state;
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
