package com.sundray.simulation.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-26  22:26
 **/
public class AllDevType {
    private List<DevType> data;
    private Boolean success;
    private Integer total;

    public AllDevType(List<DevType> data, Boolean success, Integer total) {
        this.data = data;
        this.success = success;
        this.total = total;
    }

    public List<DevType> getData() {
        return data;
    }

    public void setData(List<DevType> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
