package com.builder.model;

import java.util.Date;

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
public class Archievement extends IdFields {
    /**
     *
     */
    private static final long serialVersionUID = -5774345190959131604L;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private String nameOfAward;
    
    @Column(nullable = false)
    private Date yearOfAward;
}
