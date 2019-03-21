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
public class Education extends IdFields {
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private Date startDate;
    
    @Column
    private Date endDate;
    
    @Column(nullable = false)
    private String nameOfSchool;
    
    @Column(nullable = false)
    private String nameOfDegree;
}
