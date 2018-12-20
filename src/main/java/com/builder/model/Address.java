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
    
    public String complex;
    public String street;
    public String suburb;
    public String city;
    public String country;
}
