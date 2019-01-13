package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.PersonalReferencesDao;
import com.builder.model.PersonalReference;


@Service
@Transactional
public class PersonalReferencesService {

    @Autowired
    PersonalReferencesDao personalReferencesDao;
    
    public void save(PersonalReference reference) {
        personalReferencesDao.save(reference);
    }
}
