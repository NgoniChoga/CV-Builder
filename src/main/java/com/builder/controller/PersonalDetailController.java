package com.builder.controller;

import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.builder.managers.AccountManager;
import com.builder.managers.PersonalDetailManager;
import com.builder.model.Account;
import com.builder.model.Auth;
import com.builder.service.AccountService;
import com.builder.service.AuthService;

import org.joda.time.DateTime;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
public class PersonalDetailController{
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private AuthService authService;
    
    PersonalDetailManager personalDetailManager = new PersonalDetailManager();
    private AccountManager accountManager = new AccountManager();
    
    Auth auth;
    Account account;
    
    @GetMapping("/personalDetails")
    public String getPersonalDetail(WebRequest webRequest, Model model) {
        
        auth = authService.getAuthByUsername(personalDetailManager.getUsername());
        account = auth.getAccount();
        
        model.addAttribute("pd", "current");
        model.addAttribute("account", account);
        
        return "personalDetails";
    }
    
    @PostMapping("/personalDetails")
    public ModelAndView savePersonalDetail(@Valid String DOB, @Valid Account newAccount, BindingResult result, WebRequest webRequest, Error error) {
    	
        newAccount.setId(account.getId());
        newAccount.setDateOfBirth(accountManager.dateFormat(DOB));
        
        accountService.save(newAccount);
        
        return new ModelAndView("personalDetails");
    }
}
