package com.sundray.simulation.request;

/**
 * @author: when
 * @create: 2020-03-26  22:21
 **/
public class Pagination {
    private Integer current;
    private Integer rowCount;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }
}
