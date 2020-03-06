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
public class Hobbies extends IdFields {
    /**
     *
     */
    private static final long serialVersionUID = 6944019500305049141L;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private String nameOfHobbie;
    
    @Column
    private String description;
}
