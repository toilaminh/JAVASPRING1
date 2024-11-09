package com.example.javaspring1.controller;

import com.example.javaspring1.services.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lvl2")
public class Level2 {
    @Autowired
    Service2 service2;

    @PostMapping("/ex1")
    public double ex1(@RequestBody double[] arr){
        return service2.secLargestNumber(arr);
    }

    @PostMapping("/ex2")
    public String ex2(@RequestBody String[] arr){
        return service2.longestWord(arr);
    }

    @PostMapping("/ex3")
    public String ex3(@RequestBody String[] arr){
        return service2.shortestSubString(arr);
    }

    @PostMapping("/ex4")
    public double ex4(@RequestBody double[] arr){
        return service2.sumAllDiv3and5(arr);
    }

    @PostMapping("/ex5")
    public double ex5(@RequestBody double[] arr){
        return service2.largestSubArrSum(arr);
    }
}
