package com.example.javaspring1.controller.core1;

import com.example.javaspring1.services.core1.ServiceJV1_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jv1/lvl2")
public class Level2 {
    @Autowired
    ServiceJV1_2 serviceJV12;

    @PostMapping("/ex1")
    public double ex1(@RequestBody double[] arr){
        return serviceJV12.secLargestNumber(arr);
    }

    @PostMapping("/ex2")
    public String ex2(@RequestBody String[] arr){
        return serviceJV12.longestWord(arr);
    }

    @PostMapping("/ex3")
    public String ex3(@RequestBody String[] arr){
        return serviceJV12.shortestSubString(arr);
    }

    @PostMapping("/ex4")
    public double ex4(@RequestBody double[] arr){
        return serviceJV12.sumAllDiv3and5(arr);
    }

    @PostMapping("/ex5")
    public double ex5(@RequestBody double[] arr){
        return serviceJV12.largestSubArrSum(arr);
    }
}
