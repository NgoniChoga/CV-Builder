package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.AccountDao;
import com.builder.model.Account;


@Service
@Transactional
public class AccountService {
    
    @Autowired
    private AccountDao accountDao;
    
    public void save(final Account account) {
        accountDao.save(account);
    }
    
    public Account getAccountByUsername(String email) {
        return accountDao.getAccountByUsername(email);
    }
}
