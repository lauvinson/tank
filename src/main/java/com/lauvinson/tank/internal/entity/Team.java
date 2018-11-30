package com.lauvinson.tank.internal.entity;

import java.util.List;

/**
 * TODO 红队
 * created by vinson on 2018/11/30
 **/
public class Team {
    private String name;
    private List<Tank> tanks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(List<Tank> tanks) {
        this.tanks = tanks;
    }
}
