package com.builder.controller;

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
import com.builder.model.Account;
import com.builder.model.Address;
import com.builder.service.AccountService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class PersonalDetailController{
    
    @Autowired
    AccountService accountService;
    
    AccountManager accountManager = new AccountManager();
    
    Account account;
    
    @GetMapping("/personalDetails")
    public String getPersonalDetail(WebRequest webRequest, Model model) {
        
        account = accountService.getAccountByUsername(accountManager.getUsername());
        
        model.addAttribute("pd", "current");
        model.addAttribute("account", account);
        
        return "personalDetails";
    }
    
    @PostMapping("/personalDetails")
    public ModelAndView savePersonalDetail(@Valid String dateOfBirth, @Valid Address address, @Valid Account account, BindingResult result, WebRequest webRequest, Error error) {
        
        
        return new ModelAndView("personalDetails");
    }
}
