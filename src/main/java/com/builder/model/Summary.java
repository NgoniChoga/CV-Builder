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
public class Summary extends IdFields {
    
    private Account account;
    private String title;
    private String summary;
}
