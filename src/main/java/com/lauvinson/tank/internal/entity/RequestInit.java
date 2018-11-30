package com.lauvinson.tank.internal.entity;

/**
 * TODO 初始化请求参数
 * created by vinson on 2018/11/30
 **/
public class RequestInit {
    /**
     * 春哥数量
     */
    private Integer gold;
    /**
     * 所在队伍 tB(红队),tC(蓝队)
     */
    private String team;
    /**
     * 视野 jsonString
     */
    private View view;
    /**
     * 大龙 明细 jsonString
     */
    private Team tA;
    /**
     * B 红队 明细 jsonString
     */
    private Team tB;
    /**
     * C 蓝队 明细 jsonString
     */
    private Team tC;

    public RequestInit() {
    }

    public RequestInit(Integer gold, String team, View view, Team tA, Team tB, Team tC) {
        this.gold = gold;
        this.team = team;
        this.view = view;
        this.tA = tA;
        this.tB = tB;
        this.tC = tC;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Team gettA() {
        return tA;
    }

    public void settA(Team tA) {
        this.tA = tA;
    }

    public Team gettB() {
        return tB;
    }

    public void settB(Team tB) {
        this.tB = tB;
    }

    public Team gettC() {
        return tC;
    }

    public void settC(Team tC) {
        this.tC = tC;
    }
}
