package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.HobbiesDao;
import com.builder.model.Hobbies;


@Service
@Transactional
public class HobbiesService {

    @Autowired
    HobbiesDao hobbiesDao;
    
    public void save(Hobbies hobbies) {
        hobbiesDao.save(hobbies);
    }
}
