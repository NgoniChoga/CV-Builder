package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Archievements;


@Transactional
public interface ArchievementsDao extends CrudRepository<Archievements, Long> {

}
