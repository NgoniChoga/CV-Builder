package com.builder.model.enums;

/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public enum Title {
    MR("mr"),
    MRS("mrs"),
    MISS("miss"),
    DR("dr"),
    MS("ms"),
    MX("mx");
    
    private String id;
    
    private Title(String id) {
        this.id = id;
    }
}
