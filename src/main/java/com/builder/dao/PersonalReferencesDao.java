package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.PersonalReference;


@Transactional
public interface PersonalReferencesDao extends CrudRepository<PersonalReference, Long> {

}
