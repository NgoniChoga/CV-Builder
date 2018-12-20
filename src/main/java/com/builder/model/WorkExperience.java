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
public class WorkExperience extends BuilderFields {
    public String nameOfCompany;
    public String jobTitle;
}
