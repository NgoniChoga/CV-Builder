package com.builder.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public class loginController {
    @PostMapping("/loginPage")
    public ModelAndView registration(@Valid String login, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("login");
    }
}
