package com.builder.model;

import javax.persistence.Entity;
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
    
    private Role role = Role.USER;
    private String username;
    private String password;
    private boolean enable = true;
    
    @OneToOne
    private Account account;
}
