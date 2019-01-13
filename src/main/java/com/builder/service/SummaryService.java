package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.SummaryDao;
import com.builder.model.Summary;


@Service
@Transactional
public class SummaryService {

    @Autowired
    SummaryDao summaryDao;
    
    public void save(Summary summary) {
        summaryDao.save(summary);
    }
}
