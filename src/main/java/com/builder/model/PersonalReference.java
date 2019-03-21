package com.builder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class PersonalReference extends IdFields {
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private String name;
    
    @Column
    private Long cellphone;
    
    @Column(nullable = false)
    private String company;
    
    @Column(nullable = false)
    private String workRelationship;
}
