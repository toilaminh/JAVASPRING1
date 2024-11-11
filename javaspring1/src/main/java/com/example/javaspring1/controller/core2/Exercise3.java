package com.example.javaspring1.controller.core2;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.HashSet;

@RestController
@RequestMapping("/jv2/ex3")
public class Exercise3 {
    HashMap<String, Integer> globalAge = new HashMap<>();
    @PostMapping("/add")
    public HashMap<String,Integer> ex3_add(@RequestBody HashMap<String,Integer> hm){
        globalAge.putAll(hm);
        return globalAge;
    }

    @GetMapping("/display")
    public HashMap<String, Integer> ex3_display(){
        return globalAge;
    }

    @PostMapping("/agebname")
    public int ex3_searchAge(@RequestBody String name){
        return globalAge.get(name);
    }

    @PostMapping("/del")
    public HashMap<String,Integer> ex3_del(@RequestBody String name){
        globalAge.remove(name);
        return globalAge;
    }

    @PostMapping("/check")
    public boolean is_exist(@RequestBody String str){
        return globalAge.containsKey(str);
    }
}
