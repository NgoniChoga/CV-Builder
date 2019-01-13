package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.SkillsDao;
import com.builder.model.Skills;


@Service
@Transactional
public class SkillsService {

    @Autowired
    SkillsDao skillsDao;
    
    public void save(Skills skills) {
        skillsDao.save(skills);
    }
}
