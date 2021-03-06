package com.builder.model.enums;

/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public enum SkillLevel {
    BEGINNER("beginner"),
    INTERMEDIATE("intermediate"),
    EXPERT("expert");
    
    private String id;
    
    private SkillLevel(String id) {
        this.id = id;
    }
}
