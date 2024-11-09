package com.example.javaspring1.controller;

import com.example.javaspring1.services.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Level2 {
    @Autowired
    Service2 service2;

    @PostMapping("/lvl2/ex1")
    public String ex1(){

        return "redirect:/lvl2";
    }
}
