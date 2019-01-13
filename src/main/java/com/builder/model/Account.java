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
    
    private String title;
    private String firstName;
    private String surname;
    private String email;
    private Long cellNumber;
    private Date dateOfBirth;
    
    @OneToOne
    private Address address;
}
