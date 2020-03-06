package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.WorkExperienceDao;
import com.builder.model.Account;
import com.builder.model.WorkExperience;

@Service
@Transactional
public class WorkExperienceService {

    @Autowired
    WorkExperienceDao workExperienceDao;
    
    public void save(WorkExperience experience) {
        workExperienceDao.save(experience);
    }
    
    public WorkExperience get(Account account) {
        return workExperienceDao.findByAccount(account);
    }
}
