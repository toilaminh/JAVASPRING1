package com.example.javaspring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/lvl1")
    public String lvl1(){
        return "lvl1";
    }

    @GetMapping("/lvl2")
    public String lvl2(){
        return "lvl2";
    }

    @GetMapping("/lvl3")
    public String lvl3(){
        return "lvl3";
    }

    @GetMapping("/lvl4")
    public String lvl4(){
        return "lvl4";
    }
}
