package com.builder.model;

import javax.persistence.Entity;

import com.builder.model.helpers.BuilderFields;
import lombok.Getter;
import lombok.Setter;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Getter
@Setter
@Entity
public class Education extends BuilderFields {
    public String nameOfSchool;
    public String nameOfDegree;
}
