package com.example.javaspring1.controller;

import com.example.javaspring1.services.Service4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lvl4")
public class Level4 {
    @Autowired
    Service4 service4;

    @PostMapping("/ex2")
    public int ex2(@RequestBody List<Integer> arr, @RequestParam int a){
//        List<Integer> arr1 = arr.get(0);
//        List<Integer> arr2 = arr.get(1);
//        System.out.println(arr1 + " " + arr2);
        return service4.totalSumINT2(arr, a);
    }
}
