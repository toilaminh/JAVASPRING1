package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.level1.CustomerDto_Ex5_1;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex1_2;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex2_2;
import com.example.javaspring1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    //Level1
    public List<CustomerDto_Ex5_1> findAllCustomerWhoRentedFilmIn2022(){
        return customerRepository.findAllCustomerWhoRentedFilmIn2022(LocalDate.parse("2005-05-01"),LocalDate.parse("2005-05-31"));
    }

    //Level2
    public List<CustomerDto_Ex1_2> find10CustomerWhoSpentMostMoney(){
        return customerRepository.find10CustomerWhoSpentMostMoney();
    }

    public List<CustomerDto_Ex2_2> findCustomerRentedAllCategories(){
        return customerRepository.findCustomerRentedAllCategories();
    }
}
