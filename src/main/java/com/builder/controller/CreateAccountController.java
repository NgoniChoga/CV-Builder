package com.builder.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.builder.managers.AccountManager;
import com.builder.model.Account;
import com.builder.model.Auth;
import com.builder.service.AccountService;
import com.builder.service.AuthService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class CreateAccountController {
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private AuthService authService;
    
    private AccountManager accountManager = new AccountManager();
    
    @PostMapping("/signUp")
    public ModelAndView registration(@Valid String DOB, @Valid String pass, @Valid Account account, @Valid Auth auth, BindingResult result, WebRequest webRequest, Error error) {
        account.setDateOfBirth(accountManager.dateFormat(DOB));
    
        auth.setPassword(accountManager.hashedPassword(pass));
        auth.setAccount(account);
        
        accountService.save(account);
        authService.save(auth);
        
        return new ModelAndView("login");
    }
}
