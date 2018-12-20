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
    
    public String firstName;
    public Title title;
    public boolean archive;
    public String surname;
    public long cellphone;
    public Date dateOfBirth;
    @OneToOne
    public Address address;
}
