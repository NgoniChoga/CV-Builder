package com.builder.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Controller
@Slf4j
public class EducationController {
    @GetMapping("/education")
    public String getEducation(WebRequest webRequest, Model model) {
        model.addAttribute("edu", "current");
        return "education";
    }
    
    @PostMapping("/education")
    public ModelAndView saveEducation(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("education");
    }
}
