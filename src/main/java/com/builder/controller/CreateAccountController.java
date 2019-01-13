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
import com.builder.model.Auth;
import com.builder.service.AccountService;
import com.builder.service.AddressService;
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
    private AddressService addressService;
    
    @Autowired
    private AuthService authService;
    
    private AccountManager accountManager = new AccountManager();
    
    @PostMapping("/signUp")
    public ModelAndView registration(@Valid String DOB, @Valid String pass, @Valid Address address, @Valid Account account, @Valid Auth auth, BindingResult result, WebRequest webRequest, Error error) {
        account.setAddress(address);
        account.setDateOfBirth(accountManager.dateFormat(DOB));
    
        auth.setPassword(accountManager.hashedPassword(pass));
        auth.setAccount(account);
        
        addressService.save(address);
        accountService.save(account);
        authService.save(auth);
        
        return new ModelAndView("login");
    }
}
