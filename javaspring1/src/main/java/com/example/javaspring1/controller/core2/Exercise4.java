package com.example.javaspring1.controller.core2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/jv2/ex4")
public class Exercise4 {
    ArrayList<Integer> arr = new ArrayList<>();
    @PostMapping("/add")
    public ArrayList<Integer> ex4_add(@RequestBody int[] int_arr){
        for (int i : int_arr){
            arr.add(i);
        }
        return arr;
    }

    @GetMapping("/increase")
    public ArrayList<Integer> ex4_increase(){
        arr.sort(Integer::compareTo);
        return arr;
    }

    @GetMapping("/decrease")
    public ArrayList<Integer> ex4_decrease(){
        Collections.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
