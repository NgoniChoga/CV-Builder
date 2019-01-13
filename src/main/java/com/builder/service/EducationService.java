package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.EducationDao;
import com.builder.model.Education;


@Service
@Transactional
public class EducationService {

    @Autowired
    EducationDao educationDao;
    
    public void save(Education education) {
        educationDao.save(education);
    }
}
