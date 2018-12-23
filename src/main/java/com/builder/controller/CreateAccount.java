package com.builder.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
import com.builder.service.AddressService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class CreateAccount {
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private AddressService addressService;
    
    @Autowired
    private BCryptPasswordEncoder encoder;
    
    private AccountManager manager = new AccountManager();
    
    
    @GetMapping("/signUp")
    public String createSingleAccount(WebRequest webRequest, Model model) {
        return "signUp";
    }
    
    @PostMapping("/signUp")
    public ModelAndView registration(@Valid String dateOfBirth, @Valid String pass, @Valid Address address, @Valid Account account, BindingResult result, WebRequest webRequest, Error error) {
        account.setAddress(address);
        account.setPassword(hashedPassword(pass));
        account.setDateOfBirth(dateFormat(dateOfBirth));
        
        addressService.save(address);
        accountService.save(account);
        
        return new ModelAndView("home");
    }
    
    private String hashedPassword(String password) {
        return encoder.encode(password);
    }
    
    private Date dateFormat(String date) {
        
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            log.error("Could not convert string to date: ", e.getMessage());
        }
        
        return null;
    }
}
