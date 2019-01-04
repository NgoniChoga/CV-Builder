package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Account;

@Transactional
public interface AccountDao extends CrudRepository<Account, Long> {
    
    public Account getAccountByEmail(String email);
}
