package com.example.javaspring1.controller.mysql;

import com.example.javaspring1.model.dto.sql.level1.CustomerDto_Ex5_1;
import com.example.javaspring1.model.dto.sql.level2.ActorDto_Ex4_2;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex1_2;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex2_2;
import com.example.javaspring1.model.dto.sql.level2.FilmDto_Ex3_2;
import com.example.javaspring1.services.sql.ActorService;
import com.example.javaspring1.services.sql.CustomerService;
import com.example.javaspring1.services.sql.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lv2")
public class Sql2 {
    @Autowired
    ActorService actorService;
    @Autowired
    CustomerService customerService;
    @Autowired
    FilmService filmService;

    @GetMapping("/ex1")
    public List<CustomerDto_Ex1_2> find10CustomerWhoSpentMostMoney(){
        return customerService.find10CustomerWhoSpentMostMoney();
    }

    @GetMapping("/ex2")
    public List<CustomerDto_Ex2_2> findCustomerRentedAllCategories(){
        return customerService.findCustomerRentedAllCategories();
    }

    @GetMapping("/ex3")
    public List<FilmDto_Ex3_2> findFilmTitleWhichRentedButNeverReturned(){
        return filmService.findFilmTitleWhichRentedButNeverReturned();
    }

    @GetMapping("/ex4")
    public List<ActorDto_Ex4_2> findAllActorsWhoAppearedAtLeastOnceInEachCategory(){
        return actorService.findAllActorsWhoAppearedAtLeastOnceInEachCategory();
    }
}
