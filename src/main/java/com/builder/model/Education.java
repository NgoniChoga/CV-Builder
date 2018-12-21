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
public class Education extends IdFields {
    
    private Date startDate;
    private Date endDate;
    private String nameOfSchool;
    private String nameOfDegree;
}
