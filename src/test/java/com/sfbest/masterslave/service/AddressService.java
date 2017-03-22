package com.sfbest.masterslave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfbest.masterslave.dao.AddressDao;
import com.sfbest.masterslave.model.Address;

@Service
public class AddressService {

    @Autowired
    private AddressDao addressDao;
    
    public void save(Address address) {
        addressDao.save(address);
    }
    
    public Address findById(int id) {
        return addressDao.findById(id);
    }
}
