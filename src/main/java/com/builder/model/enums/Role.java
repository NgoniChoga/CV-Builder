package com.builder.model.enums;

/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public enum Role {
    USER("user"),
    ADMIN("admin");
    
    private String id;
    
    private Role(String id) {
        this.id = id;
    }
}
