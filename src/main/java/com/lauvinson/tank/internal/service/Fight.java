package com.lauvinson.tank.internal.service;

import com.lauvinson.tank.internal.entity.FightResult;
import com.lauvinson.tank.internal.entity.RequestInit;
import com.lauvinson.tank.internal.entity.Result;

/**
 * TODO 对战接口
 * created by vinson on 2018/11/29
 **/
public interface Fight {
    Result setInit(String action, RequestInit init);

    FightResult getAction(String action, RequestInit now);
}
