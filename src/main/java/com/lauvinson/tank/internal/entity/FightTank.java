package com.lauvinson.tank.internal.entity;

/**
 * TODO 开打tank tank操作信息
 * created by vinson on 2018/12/3
 **/
public class FightTank {
    /**
     * tankId
     */
    private String tId;
    /**
     * 移动或攻击方向
     */
    private Direction direction;
    /**
     * 移动或攻击
     */
    private Type type;
    /**
     * 移动或攻击距离
     */
    private Integer length;
    /**
     * 是否使用复活币
     */
    private Boolean useGlod;

    private FightTank(Builder builder) {
        settId(builder.tId);
        setDirection(builder.direction);
        setType(builder.type);
        setLength(builder.length);
        setUseGlod(builder.useGlod);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(FightTank copy) {
        Builder builder = new Builder();
        builder.tId = copy.gettId();
        builder.direction = copy.getDirection();
        builder.type = copy.getType();
        builder.length = copy.getLength();
        builder.useGlod = copy.getUseGlod();
        return builder;
    }

    /**
     * TODO 移动或攻击方向
     * created by vinson on 2018-12-03
     **/
    static enum Direction {
        UP,RIGHT,DOWN,LEFT,WAIT
    }

    /**
     * TODO 攻击或移动
     * created by vinson on 2018-12-03
     **/
    static enum Type {
        MOVE,FIRE
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getUseGlod() {
        return useGlod;
    }

    public void setUseGlod(Boolean useGlod) {
        this.useGlod = useGlod;
    }

    public FightTank(String tId, Direction direction, Type type, Integer length, Boolean useGlod) {
        this.tId = tId;
        this.direction = direction;
        this.type = type;
        this.length = length;
        this.useGlod = useGlod;
    }


    public static final class Builder {
        private String tId;
        private Direction direction;
        private Type type;
        private Integer length;
        private Boolean useGlod;

        private Builder() {
        }

        public Builder tId(String val) {
            tId = val;
            return this;
        }

        public Builder direction(Direction val) {
            direction = val;
            return this;
        }

        public Builder type(Type val) {
            type = val;
            return this;
        }

        public Builder length(Integer val) {
            length = val;
            return this;
        }

        public Builder useGlod(Boolean val) {
            useGlod = val;
            return this;
        }

        public FightTank build() {
            return new FightTank(this);
        }
    }
}
