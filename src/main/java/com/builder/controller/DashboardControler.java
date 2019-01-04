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
public class DashboardControler {
    
    @GetMapping("/personalDetails")
    public String getPersonalDetail(WebRequest webRequest, Model model) {
        model.addAttribute("pd", "current");
        return "personalDetails";
    }
    
    @PostMapping("/personalDetails")
    public ModelAndView savePersonalDetail(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("personalDetails");
    }
    
    @GetMapping("/workExperience")
    public String getWorkExperience(WebRequest webRequest, Model model) {
        model.addAttribute("we", "current");
        return "workExperience";
    }
    
    @PostMapping("/workExperience")
    public ModelAndView saveWorkExperience(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("workExperience");
    }
    
    @GetMapping("/education")
    public String getEducation(WebRequest webRequest, Model model) {
        model.addAttribute("edu", "current");
        return "education";
    }
    
    @PostMapping("/education")
    public ModelAndView saveEducation(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("education");
    }
    
    @GetMapping("/technicalSkills")
    public String getTechnicalSkills(WebRequest webRequest, Model model) {
        model.addAttribute("ts", "current");
        return "technicalSkills";
    }
    
    @PostMapping("/technicalSkills")
    public ModelAndView saveTechnicalSkills(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("technicalSkills");
    }
    
    @GetMapping("/certifications")
    public String getCertifications(WebRequest webRequest, Model model) {
        model.addAttribute("cert", "current");
        return "certifications";
    }
    
    @PostMapping("/certifications")
    public ModelAndView saveCertification(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("certifications");
    }
    
    @GetMapping("/hobbies")
    public String getHobbies(WebRequest webRequest, Model model) {
        model.addAttribute("hobbies", "current");
        return "hobbies";
    }
    
    @PostMapping("/hobbies")
    public ModelAndView saveHobbies(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("hobbies");
    }
    
    @GetMapping("/references")
    public String getReferences(WebRequest webRequest, Model model) {
        model.addAttribute("refs", "current");
        return "references";
    }
    
    @PostMapping("/references")
    public ModelAndView saveReferences(@Valid String dateOfBirth, BindingResult result, WebRequest webRequest, Error error) {
        return new ModelAndView("references");
    }
    
}
