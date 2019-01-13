package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.AuthDao;
import com.builder.model.Auth;


@Service
@Transactional
public class AuthService {
    
    @Autowired
    private AuthDao authDao;
    
    public void save(final Auth auth) {
        authDao.save(auth);
    }
    
    public Auth getAuthByUsername(String username) {
        return authDao.getAuthByUsername(username);
    }
}
