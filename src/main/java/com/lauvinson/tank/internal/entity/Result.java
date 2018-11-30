package com.lauvinson.tank.internal.entity;

import java.util.List;

/**
 * TODO 返回
 * created by vinson on 2018/11/30
 **/
public class Result<T> {

    private final static String SUCCESS_CODE = "0";
    private final static String SUCCESS_MSG = "succeeded";

    private String code;
    private String action;
    private String msg;
    private Boolean ok;
    private List<T> data;

    private Result(Builder builder) {
        setCode(builder.code);
        setAction(builder.action);
        setMsg(builder.msg);
        setOk(builder.ok);
    }

    public static Result ok(String action) {
        return Result.newBuilder().action(action).code(SUCCESS_CODE).msg(SUCCESS_MSG).ok(true).build();
    }



    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Result copy) {
        Builder builder = new Builder();
        builder.code = copy.getCode();
        builder.action = copy.getAction();
        builder.msg = copy.getMsg();
        builder.ok = copy.getOk();
        builder.data = copy.getData();
        return builder;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }


    public static final class Builder<T> {
        private String code;
        private String action;
        private String msg;
        private Boolean ok;
        private T data;

        private Builder() {
        }

        public Builder code(String val) {
            code = val;
            return this;
        }

        public Builder action(String val) {
            action = val;
            return this;
        }

        public Builder msg(String val) {
            msg = val;
            return this;
        }

        public Builder ok(Boolean val) {
            ok = val;
            return this;
        }

        public Builder data(T val) {
            data = val;
            return this;
        }

        public Result build() {
            return new Result(this);
        }
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
