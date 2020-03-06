package com.builder.managers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Slf4j
public class AccountManager {
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    public String hashedPassword(String password) {
        return encoder.encode(password);
    }
    
    public Date dateFormat(String date) {
        
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            log.error("Could not convert string to date: ", e.getMessage());
        }
        
        return null;
    }
}
