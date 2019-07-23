package com.lauvinson.tank.internal.entity;

import java.util.List;

/**
 * TODO 开展result
 * created by vinson on 2018/12/3
 **/
public class FightResult<T> {
    private final static String SUCCESS_CODE = "0";
    private final static String SUCCESS_MSG = "succeeded";

    private String code;
    private String action;
    private String msg;
    private Boolean ok;
    private List<FightTank> data;

    public static FightResult ok(String action, List<FightTank> data) {
        return FightResult.newBuilder().action(action).code(SUCCESS_CODE).msg(SUCCESS_MSG).ok(true).data(data).build();
    }

    private FightResult(Builder builder) {
        setCode(builder.code);
        setAction(builder.action);
        setMsg(builder.msg);
        setOk(builder.ok);
        setData(builder.data);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(FightResult copy) {
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

    public List<FightTank> getData() {
        return data;
    }

    public void setData(List<FightTank> data) {
        this.data = data;
    }

    public FightResult(String code, String action, String msg, Boolean ok, List<FightTank> data) {
        this.code = code;
        this.action = action;
        this.msg = msg;
        this.ok = ok;
        this.data = data;
    }


    public static final class Builder {
        private String code;
        private String action;
        private String msg;
        private Boolean ok;
        private List<FightTank> data;

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

        public Builder data(List<FightTank> val) {
            data = val;
            return this;
        }

        public FightResult build() {
            return new FightResult(this);
        }
    }
}
