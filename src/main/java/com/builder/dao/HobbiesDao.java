package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Hobbies;


@Transactional
public interface HobbiesDao extends CrudRepository<Hobbies, Long> {

}
