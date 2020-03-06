package com.builder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.builder.managers.AccountManager;
import com.builder.model.Account;
import com.builder.service.AccountService;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
public class DashboardController {
    
    @Autowired
    AccountService accountService;
    
    AccountManager accountManager = new AccountManager();
    
    Account account;
}
