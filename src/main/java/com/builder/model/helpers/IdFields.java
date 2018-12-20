package com.builder.model.helpers;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Getter
@Setter
public abstract class IdFields {
    @Id
    @GeneratedValue
    public long id;
    public Date dateCreated;
}
