package com.example.javaspring1.services.core1;

import org.springframework.stereotype.Service;

@Service
public class ServiceJV1_2 {
    public double secLargestNumber(double[] arr){
        int arr_large = arr.length;
        double largest = 0;
        double sec_number = 0;
        for (int i = 0; i < arr_large; i++)
        {
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr_large;i++){
            if(arr[i] > sec_number && arr[i] != largest){
                sec_number = arr[i];
            }
        }
        return sec_number;
    }

    public String longestWord(String[] arr){
        String longest = "";
        String[] top_word = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            String top = "";
            String regex = "[,\\.\\s]";
            String[] word = arr[i].split(regex);
            for(String s : word){
                if(s.length() > top.length()){
                    top = s;
                }
            }
            top_word[i] = top;
        }
        for(String s : top_word){
            System.out.println("Top word: " + s);
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        return longest;
    }

    public String shortestSubString(String[] arr){
        int arr_counter = 0;
        String shortest_string = arr[0];
        String sub_string = "";
        for(String test_string : arr)
        {
            arr_counter += 1;
            if(shortest_string.length() > test_string.length())
            {
                shortest_string = test_string;
            }
        }
        for(int i = 0;i < shortest_string.length(); i++)
        {
            for(int j = i; j <= shortest_string.length(); j++)
            {
                String sub_string_t = shortest_string.substring(i,j);
                int sub_counter = 0;
                for(String test_string : arr)
                {
                    int sub_index = test_string.indexOf(sub_string_t);
                    if(sub_index >= 0)
                    {
                        sub_counter += 1;
                    }

                }
                if(sub_counter == arr_counter)
                {
                    if(sub_string_t.length() > sub_string.length())
                    {
                        sub_string = sub_string_t;
                    }
                }
            }
        }
        return sub_string;
    }

    public double sumAllDiv3and5(double[] arr){
        double sum_tf = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%3 == 0 && arr[i]%5 == 0){
                sum_tf += arr[i];
            }
        }
        return sum_tf;
    }

    public double largestSubArrSum(double[] arr){
        int sub_sum = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(sum > sub_sum){
                    sub_sum = sum;
                }
            }
        }
        return sub_sum;
    }
}
