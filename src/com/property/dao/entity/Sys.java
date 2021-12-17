package com.property.dao.entity;

public class Sys {
    private int id;
    private int pid;
    private String title;
    private int spread;
    private String url;
    private String icon;
    private int available;

    public Sys() {
    }

    public Sys(int id, int pid, String title, int spread, String url, String icon, int available) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.spread = spread;
        this.url = url;
        this.icon = icon;
        this.available = available;
    }

    public Sys(int pid, String title, int spread, String url, String icon, int available) {
        this.pid = pid;
        this.title = title;
        this.spread = spread;
        this.url = url;
        this.icon = icon;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSpread() {
        return spread;
    }

    public void setSpread(int spread) {
        this.spread = spread;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Sys_menu{" +
                "id=" + id +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                ", spread=" + spread +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", available=" + available +
                '}';
    }
}
