package com.builder.model;

import javax.persistence.Entity;

import com.builder.model.enums.SkillLevel;
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
public class Skills extends IdFields {
    public String name;
    public SkillLevel skillLevel;
}
