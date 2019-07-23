package com.lauvinson.tank.internal.service;

import com.lauvinson.tank.internal.entity.*;

import java.util.ArrayList;

/**
 * TODO 对战实现
 * created by vinson on 2018/11/29
 **/
public class FightService implements Fight {

    @Override
    public Result setInit(String action,RequestInit init) {
        return Result.ok(action);
    }

    @Override
    public FightResult getAction(String action, RequestInit now) {
        final Integer gold = now.getGold();
        final String team = now.getTeam();
        final View view = now.getView();
        final Team tA = now.gettA();
        final Team tB = now.gettB();
        final Team tC = now.gettC();
        return FightResult.ok(action, new ArrayList<>());
    }
}
