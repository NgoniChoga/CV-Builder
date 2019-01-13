package com.builder.managers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public class PersonalDetailManager {
    
    public String getUsername() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ((User)principal).getUsername();
    }
    
}
