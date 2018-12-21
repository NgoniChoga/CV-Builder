package com.builder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.builder.dao.AddressDao;
import com.builder.model.Address;


@Service
@Transactional
public class AddressService {
    
    @Autowired
    private AddressDao addressDao;
    
    public void save(final Address address) {
        addressDao.save(address);
    }
}
