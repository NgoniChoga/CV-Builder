package com.builder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.builder.model.enums.Role;
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
public class Auth extends IdFields {
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
    @Column(nullable = false)
    private Role role = Role.USER;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false)
    private String password;
    
    @Column
    private boolean enable = true;
}
