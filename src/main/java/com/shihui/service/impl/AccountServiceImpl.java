package com.shihui.service.impl;

import com.shihui.domain.Account;
import com.shihui.mapper.AccountMapper;
import com.shihui.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Map map) {
        accountMapper.save(map);
    }

    @Override
    public Map findAll() {

        return accountMapper.findAll();
    }
}
