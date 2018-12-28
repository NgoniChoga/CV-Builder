package com.builder.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {
    
    private static final String[] RESOURCE_LOCATIONS = new String[]{"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/"};
    
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/personalDetails").setViewName("personalDetails");
        registry.addViewController("/workExperience").setViewName("workExperience");
        registry.addViewController("/education").setViewName("education");
        registry.addViewController("/technicalSkills").setViewName("technicalSkills");
        registry.addViewController("/certifications").setViewName("certifications");
        registry.addViewController("/hobbies").setViewName("hobbies");
        registry.addViewController("/references").setViewName("references");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        
        if (!registry.hasMappingForPattern("/webjars/**")) {
            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
        
        if (!registry.hasMappingForPattern("/**")) {
            registry.addResourceHandler("/**")
                    .addResourceLocations(RESOURCE_LOCATIONS);
        }
    }
    
    
}
