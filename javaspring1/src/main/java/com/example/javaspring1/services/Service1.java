package com.example.javaspring1.services;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Service1 {
    public int biggestNumber(List<Integer> arr){
        int biggest = arr.get(0);
        for(int i : arr){
            if(biggest < i){
                biggest = i;
            }
        }
        return biggest;
    }

    public String shortestString(List<String> arr){
        String shortest = arr.get(0);
        for(int i = 0;i < arr.size();i++){
            if(arr.get(i).length() < shortest.length()){
                shortest = arr.get(i);
            }
        }
        return shortest;
    }

    public String smest2bestINT(List<Integer> arr){
        String res = "";
        for (int i : arr){
            res += i + " ";
        }
        return res;
    }

    public String smest2bestSTRING(List<String> arr){
        String res = "";
        for (String i : arr){
            res += i + " ";
        }
        return res;
    }

    public double medianNumber(List<Double> arr){
        if(arr.size() % 2 == 1){
             return arr.get((arr.size() + 1)/2 - 1);
        }
        else {
            return  (arr.get((arr.size() - 1)/2) + arr.get((arr.size() + 1)/2))/2;
        }
    }

    public int numberOfWords(String str){
        int word_num = 0;
        if(str.charAt(0) != ' ')
        {
            word_num += 1;
        }
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                if(str.charAt(i+1) != ' '){
                    word_num += 1;
                }
            }
        }
        return word_num;
    }

    public int numberOfStrCtnA(List<String> str){
        int str_ca = 0;
        for(String s : str){
            if (s.contains("a")){
                str_ca += 1;
            }
        }
        return str_ca;
    }
}
