package com.property.comm;

public enum CodeMsg {
    SUCCESS(200,"Success"),
    ERROR(500,"error"),
    SUCCESS_LOGIN(201,"login success"),
    SUCCESS_FIND_ALL(202,"findAll success"),

    ERROR_LOGIN(501,"login error");

    private int code;
    private String msg;

    CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
