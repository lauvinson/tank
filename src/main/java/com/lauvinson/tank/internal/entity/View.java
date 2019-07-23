package com.lauvinson.tank.internal.entity;

import java.util.List;

/**
 * TODO 请求参数中的视野 view
 * created by vinson on 2018/11/30
 **/
public class View {
    private String name;
    private String rowLen;
    private String colLen;
    private List<String []> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRowLen() {
        return rowLen;
    }

    public void setRowLen(String rowLen) {
        this.rowLen = rowLen;
    }

    public String getColLen() {
        return colLen;
    }

    public void setColLen(String colLen) {
        this.colLen = colLen;
    }

    public List<String[]> getMap() {
        return map;
    }

    public void setMap(List<String[]> map) {
        this.map = map;
    }
}
