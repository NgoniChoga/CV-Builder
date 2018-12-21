package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Education;


@Transactional
public interface EducationDao extends CrudRepository<Education, Long> {

}
