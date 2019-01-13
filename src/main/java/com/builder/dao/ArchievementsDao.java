package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Archievement;


@Transactional
public interface ArchievementsDao extends CrudRepository<Archievement, Long> {
    
    Archievement getArchievementsByAccount_Id(Long id);
    
}
