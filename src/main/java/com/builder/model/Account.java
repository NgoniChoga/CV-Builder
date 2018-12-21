package com.builder.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.builder.model.enums.Title;
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
public class Account extends IdFields {
    
    private String firstName;
    private Title title;
    private String surname;
    private Long cellphone;
    private Date dateOfBirth;
    @OneToOne
    private Address address;
}
