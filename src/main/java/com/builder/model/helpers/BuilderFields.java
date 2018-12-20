package com.builder.model.helpers;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Getter
@Setter
public abstract class BuilderFields extends IdFields {
    public boolean show;
    public Date startDate;
    public Date endDate;
}
