package com.builder.model;

import javax.persistence.Entity;

import com.builder.model.helpers.IdFields;
import lombok.Getter;
import lombok.Setter;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Getter
@Setter
@Entity
public class Address extends IdFields {
    
    private String complex;
    private String street;
    private String suburb;
    private String city;
    private String country;
}
