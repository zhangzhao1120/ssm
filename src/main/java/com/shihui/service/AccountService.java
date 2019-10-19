package com.shihui.service;

import com.shihui.domain.Account;

import java.util.List;
import java.util.Map;

public interface AccountService {
    //保存方法
    public void save(Map map);
    ///查找所有方法
    public Map findAll();
}
