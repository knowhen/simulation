package com.sundray.simulation.request;

import java.util.List;

/**
 * @author: when
 * @create: 2020-03-26  22:46
 **/
public class QueryParam {
    private Boolean all;
    private List<Integer> group_ids;
    private List<String> device_ids;

    public QueryParam() {
    }

    public QueryParam(Boolean all, List<Integer> group_ids, List<String> device_ids) {
        this.all = all;
        this.group_ids = group_ids;
        this.device_ids = device_ids;
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public List<Integer> getGroup_ids() {
        return group_ids;
    }

    public void setGroup_ids(List<Integer> group_ids) {
        this.group_ids = group_ids;
    }

    public List<String> getDevice_ids() {
        return device_ids;
    }

    public void setDevice_ids(List<String> device_ids) {
        this.device_ids = device_ids;
    }
}
