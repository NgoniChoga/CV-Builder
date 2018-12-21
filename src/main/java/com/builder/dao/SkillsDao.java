package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Skills;


@Transactional
public interface SkillsDao extends CrudRepository<Skills, Long> {

}
