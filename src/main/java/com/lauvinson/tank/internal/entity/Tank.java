package com.lauvinson.tank.internal.entity;

/**
 * TODO 坦克
 * created by vinson on 2018/11/30
 **/
public class Tank {
    private String tId;
    private String name;
    private String gongji;
    private Integer shengming;
    private Integer shengyushengming;
    private Integer yidong;
    private Integer shecheng;
    private Integer shiye;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGongji() {
        return gongji;
    }

    public void setGongji(String gongji) {
        this.gongji = gongji;
    }

    public Integer getShengming() {
        return shengming;
    }

    public void setShengming(Integer shengming) {
        this.shengming = shengming;
    }

    public Integer getShengyushengming() {
        return shengyushengming;
    }

    public void setShengyushengming(Integer shengyushengming) {
        this.shengyushengming = shengyushengming;
    }

    public Integer getYidong() {
        return yidong;
    }

    public void setYidong(Integer yidong) {
        this.yidong = yidong;
    }

    public Integer getShecheng() {
        return shecheng;
    }

    public void setShecheng(Integer shecheng) {
        this.shecheng = shecheng;
    }

    public Integer getShiye() {
        return shiye;
    }

    public void setShiye(Integer shiye) {
        this.shiye = shiye;
    }
}
