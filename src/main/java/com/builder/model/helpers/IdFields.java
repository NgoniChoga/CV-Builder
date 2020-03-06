package com.builder.model.helpers;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.joda.time.DateTime;

import lombok.Getter;
import lombok.Setter;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/

@Getter
@Setter
@MappedSuperclass
public abstract class IdFields implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8027149337082457701L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private Date dateCreated;
    
    @Column
    private boolean hide;
    
    @Column
    private boolean archive;
    
    @PrePersist
    protected void onCreate() {
        dateCreated = new Date();
    }
}
