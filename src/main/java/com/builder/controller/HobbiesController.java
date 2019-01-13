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
public class HobbiesController {
    @GetMapping("/hobbies")
    public String getHobbies(WebRequest webRequest, Model model) {
        model.addAttribute("hobbies", "current");
        return "hobbies";
    }
    
    @PostMapping("/hobbies")
    public ModelAndView saveHobbies(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("hobbies");
    }
}
