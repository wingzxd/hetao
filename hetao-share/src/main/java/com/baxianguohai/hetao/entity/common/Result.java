package com.baxianguohai.hetao.entity.common;

import java.io.Serializable;

public class Result<T> implements Serializable, Cloneable {

    private static final long serialVersionUID = 8000349409315221668L;
    private  T data;
    private String errorMessage;
    private boolean success;

    public  Result failure(String errorMessage) {
        Result result = new Result();
        result.errorMessage = errorMessage;
        result.success = false;
        return result;
    }

    public  Result success(T data) {
        Result result = new Result();
        result.errorMessage = "";
        result.data = data;
        result.success = true;
        return result;
    }

    public  Result success() {
        Result result = new Result();
        result.errorMessage = "";
        result.data = "success";
        result.success = true;
        return result;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
