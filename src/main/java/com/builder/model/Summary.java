package com.builder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Summary extends IdFields {
    /**
     *
     */
    private static final long serialVersionUID = 7467172032234698949L;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String summary;
}
