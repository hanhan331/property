package com.property.controller.vo;

public class SysVO {

        Integer pid;
        Integer available;
        String title;

    public SysVO( Integer pid, Integer available, String title) {

        this.pid = pid;
        this.available = available;
        this.title = title;
    }

    public SysVO(String title) {
        this.title = title;
    }


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
