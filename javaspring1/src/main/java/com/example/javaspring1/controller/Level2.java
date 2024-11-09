package com.example.javaspring1.controller;

import com.example.javaspring1.services.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Level2 {
    @Autowired
    Service2 service2;

    @PostMapping(value = "/lvl2/ex1", consumes = {})
    public String ex1(){

        return "redirect:/lvl2";
    }
}
