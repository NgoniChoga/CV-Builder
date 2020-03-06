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
import com.builder.managers.PersonalDetailManager;
import com.builder.model.Account;
import com.builder.model.Auth;
import com.builder.model.WorkExperience;
import com.builder.service.AuthService;
import com.builder.service.WorkExperienceService;

import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class WorkExperienceController {
	
	@Autowired
    private AuthService authService;
	
	@Autowired
	private WorkExperienceService workExperienceService;
	
	private PersonalDetailManager personalDetailManager = new PersonalDetailManager();
	private AccountManager accountManager = new AccountManager();
	
	Auth auth;
	Account account;
	WorkExperience workExperience;
	
    @GetMapping("/workExperience")
    public String getWorkExperience(WebRequest webRequest, Model model) {
    	
    	 auth = authService.getAuthByUsername(personalDetailManager.getUsername());
         account = auth.getAccount();
         workExperience = workExperienceService.get(account);
    	
        model.addAttribute("we", "current");
        model.addAttribute("workExperience", workExperience);
        return "workExperience";
    }
    
    @PostMapping("/workExperience")
    public ModelAndView saveWorkExperience(@Valid String startDate, @Valid String endDate, @Valid WorkExperience workExperience, BindingResult result, WebRequest webRequest, Error error) {
        
    	workExperience.setAccount(account);
    	workExperience.setStartDate(accountManager.dateFormat(startDate));
    	workExperience.setEndDate(accountManager.dateFormat(endDate));
    	workExperienceService.save(workExperience);
    	
    	return new ModelAndView("workExperience");
    }
}
