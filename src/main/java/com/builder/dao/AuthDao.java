package com.builder.dao;

import org.springframework.data.repository.CrudRepository;

import com.builder.model.Auth;


/**
 * @author nicholaschoga
 * @project CV-Builder
 **/
public interface AuthDao extends CrudRepository<Auth, Long>{
    
    Auth getAuthByUsername(String username);
    
}
