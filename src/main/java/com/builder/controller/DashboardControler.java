package com.builder.controller;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author nicholaschoga
 * @project CV-Builder
 **/


public class DashboardControler {
    
    @GetMapping("/personalDetails")
    public String getPersonalDetail(WebRequest webRequest, Model model) {
        return "personalDetail";
    }
    
    @PostMapping("/personalDetails")
    public ModelAndView savePersonalDetail(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("personalDetails");
    }
    
    @GetMapping("/workExperience")
    public String getWorkExperience(WebRequest webRequest, Model model) {
        return "workExperience";
    }
    
    @PostMapping("/workExperience")
    public ModelAndView saveWorkExperience(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("workExperience");
    }
    
    @GetMapping("/education")
    public String getEducation(WebRequest webRequest, Model model) {
        return "education";
    }
    
    @PostMapping("/education")
    public ModelAndView saveEducation(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("education");
    }
    
    @GetMapping("/technicalSkills")
    public String getTechnicalSkills(WebRequest webRequest, Model model) {
        return "technicalSkills";
    }
    
    @PostMapping("/technicalSkills")
    public ModelAndView saveTechnicalSkills(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("technicalSkills");
    }
    
    @GetMapping("/certifications")
    public String getCertifications(WebRequest webRequest, Model model) {
        return "certifications";
    }
    
    @PostMapping("/certifications")
    public ModelAndView saveCertification(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("certifications");
    }
    
    @GetMapping("/hobbies")
    public String getHobbies(WebRequest webRequest, Model model) {
        return "hobbies";
    }
    
    @PostMapping("/hobbies")
    public ModelAndView saveHobbies(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("hobbies");
    }
    
    @GetMapping("/references")
    public String getReferences(WebRequest webRequest, Model model) {
        return "references";
    }
    
    @PostMapping("/references")
    public ModelAndView saveReferences(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("references");
    }
    
}
