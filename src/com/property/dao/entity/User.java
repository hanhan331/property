package com.property.dao.entity;

public class User {
    private int id;
    private String username;
    private String password;
    private int pri;

    public User() {
    }

    public User(int id, String username, String password, int pri) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.pri = pri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }
}
