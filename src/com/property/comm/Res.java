package com.property.comm;

public class Res<T> {
    private int code;
    private String msg;
    private T data;

    public static Res success(){
        return new Res(CodeMsg.SUCCESS);
    }
    public static  Res success(CodeMsg cm){
        return new Res(cm);

    }
    public static Res error(){
        return new Res(CodeMsg.ERROR);
    }
    public static  Res error(CodeMsg cm){
        return new Res(cm);

    }
    public static<T> Res<T> success(CodeMsg cm,T data){
        return new Res(cm,data);
    }
    private Res(CodeMsg cm) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    private Res(CodeMsg cm, T data) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


}
