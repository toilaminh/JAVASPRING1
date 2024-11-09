package com.example.javaspring1.controller;

import com.example.javaspring1.services.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.http.converter.FormHttpMessageConverter;
import java.util.List;

@RestController
@RequestMapping("/lvl1")
public class Level1 {
    @Autowired
    Service1 service1;

    @PostMapping("/ex1")
    public double ex1(@RequestParam double a, @RequestParam double b){
        System.out.println(a+b);
        return a+b;
    }
    @PostMapping("/ex2")
    public int ex2(@RequestParam String str1){
        return str1.length();
    }

    @PostMapping("/ex3")
    public double ex3(@RequestParam double a){
        return a*a;
    }

    @PostMapping("/ex4")
    public double ex4(@RequestBody double[] arr){
        return service1.biggestNumber(arr);
    }

    @PostMapping("/ex5")
    public String ex5(@RequestBody String[] arr){
        return service1.shortestString(arr);
    }

    @PostMapping("/ex6")
    public String ex6(@RequestBody int[] arr){
        return service1.smest2bestINT(arr);
    }

    @PostMapping("/ex7")
    public String ex7(@RequestBody String[] arr){
        return service1.smest2bestSTRING(arr);
    }

    @PostMapping("/ex8")
    public Double ex8(@RequestBody double[] arr){
        return service1.medianNumber(arr);
    }

    @PostMapping("/ex9")
    public int ex9(@RequestParam String str2){
        return service1.numberOfWords(str2);
    }

    @PostMapping("/ex10")
    public int ex10(@RequestBody String[] arr){
        return service1.numberOfStrCtnA(arr);
    }
}
