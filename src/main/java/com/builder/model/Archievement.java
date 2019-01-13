package com.builder.model;

import java.util.Date;

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
public class Archievement extends IdFields {
    
    private Account account;
    private String nameOfAward;
    private Date yearOfAward;
}
