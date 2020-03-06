package com.builder.model;

import java.util.Date;

import javax.persistence.Column;
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
public class Account extends IdFields {
    /**
     *static final serialVersionUID
     */
    private static final long serialVersionUID = 7339915910313107543L;

    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String surname;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private Long cellNumber;
    
    @Column(nullable = false)
    private Date dateOfBirth;
    
    @Column(nullable = false)
    private String street;
    
    @Column(nullable = false)
    private String suburb;
    
    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    private String country;
}
