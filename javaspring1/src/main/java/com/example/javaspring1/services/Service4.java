package com.example.javaspring1.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service4 {
    public int totalSumINT1(List<Integer> arr1, List<Integer> arr2){
        int counter = 0;
        int totalSubsets = 1 << arr1.size();
        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            int currentSum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    currentSum += arr1.get(i);
                }
            }
            if(currentSum == arr2.getFirst()){
                counter += 1;
            }
        }
        return counter;
    }

    public int totalSumINT2(List<Integer> arr1, int a){
        int counter = 0;
        int totalSubsets = 1 << arr1.size();
        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            int currentSum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    currentSum += arr1.get(i);
                }
            }
            if(currentSum == a){
                counter += 1;
            }
        }
        return counter;
    }
}
