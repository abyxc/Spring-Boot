package com.demo.api;


import java.io.Serializable;

/**
 * 返回封装类
 * @param <T>
 */
public class CtrlResult<T> implements Serializable {
    private static final long serialVersionUID = 8943262103820053429L;
//    处理状态 true表成功；false表失败
    private boolean state;
    private int code;
    private String msg;
    private T data;


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
