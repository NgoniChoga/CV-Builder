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
public class References extends BuilderFields {
    public String name;
    public long cellphone;
    public String company;
    public String workRelationship;
}
