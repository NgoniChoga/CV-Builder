package com.builder.model;

import javax.persistence.*;

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
    /**
     *
     */
    private static final long serialVersionUID = 5461285419660888569L;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
}
