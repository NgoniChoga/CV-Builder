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
public class PersonalReferences extends IdFields {
    
    private Account account;
    private String name;
    private Long cellphone;
    private String company;
    private String workRelationship;
}
