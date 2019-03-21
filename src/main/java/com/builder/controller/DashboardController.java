package com.builder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.builder.managers.AccountManager;
import com.builder.model.Account;
import com.builder.service.AccountService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class DashboardController {
    
    @Autowired
    AccountService accountService;
    
    AccountManager accountManager = new AccountManager();
    
    Account account;
}
