package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.WorkExperience;


@Transactional
public interface WorkExperienceDao extends CrudRepository<WorkExperience, Long> {

}
