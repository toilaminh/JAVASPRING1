package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.entity.Address;
import com.example.javaspring1.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    //Level4
    @Transactional
    public void updateNewAddressName(){
        List<Address> addresses = addressRepository.listAddressesUpdate8();
        addresses.forEach(c -> c.setAddress( c.getAddress() + "samecity"));
        addressRepository.saveAll(addresses);
    }
}
