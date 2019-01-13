package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.ArchievementsDao;
import com.builder.model.Archievement;


@Service
@Transactional
public class ArchievementsService {

    @Autowired
    ArchievementsDao archievementsDao;
    
    public void save(Archievement archievement) {
        archievementsDao.save(archievement);
    }
}
