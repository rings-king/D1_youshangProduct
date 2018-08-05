package com.lanou.util;

import java.io.Serializable;

public class ServerResponse<T> implements Serializable {
    private int errorCode;
    private String msg;
    private T data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ServerResponse() {
    }

    private ServerResponse(int errorCode,String msg,T data){
        this.data = data;
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public static<T> ServerResponse creatSuccess(String msg,T data){
        return new ServerResponse(0,msg,data);
    }

    private ServerResponse (int errorCode,String msg){
        this.msg = msg;
        this.errorCode = errorCode;
    }

    public static  ServerResponse creatError(int errorCode,String msg){
        return new ServerResponse(errorCode,msg);
    }


}
