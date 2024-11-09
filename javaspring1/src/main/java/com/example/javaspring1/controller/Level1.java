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

@Controller
@RequestMapping("/lvl1")
public class Level1 {
    @Autowired
    Service1 service1;

    @PostMapping("/ex1")
    public String ex1(@RequestParam("num1") double a, @RequestParam("num2") double b, RedirectAttributes re){
        double sum = a + b;
        re.addFlashAttribute("result1",sum);
        return "redirect:/lvl1";
    }
    @PostMapping("/ex2")
    public String ex2(@RequestParam("str1") String str1, RedirectAttributes re){
        re.addFlashAttribute("str1", str1);
        re.addFlashAttribute("result2", str1.length());
        return "redirect:/lvl1";
    }

    @PostMapping("/ex3")
    public String ex3(@RequestParam("num3") double a, RedirectAttributes re){
        re.addFlashAttribute("result3", a*a);
        return "redirect:/lvl1";
    }

    @PostMapping("/ex4")
    public String ex4(@RequestParam("elements1") List<Integer> arr, RedirectAttributes re){
        int res = service1.biggestNumber(arr);
        re.addFlashAttribute("result4", res);
        return "redirect:/lvl1";
    }

    @PostMapping("/ex5")
    public String ex5(@RequestParam("elements2") List<String> arr, RedirectAttributes re){
        String res = service1.shortestString(arr);
        re.addFlashAttribute("result5", res);
        return "redirect:/lvl1";
    }

    @PostMapping("/ex6")
    public String ex6(@RequestParam("elements3") List<Integer> arr, RedirectAttributes re){
        arr.sort(Integer::compareTo);
        re.addFlashAttribute("result6", service1.smest2bestINT(arr));
        return "redirect:/lvl1";
    }

    @PostMapping("/ex7")
    public String ex7(@RequestParam("elements4") List<String> arr, RedirectAttributes re){
        arr.sort(String::compareTo);
        re.addFlashAttribute("result7", service1.smest2bestSTRING(arr));
        return "redirect:/lvl1";
    }

    @PostMapping("/ex8")
    public String ex8(@RequestParam("elements5") List<Double> arr, RedirectAttributes re){
        arr.sort(Double::compareTo);
        System.out.println(arr + " " + service1.medianNumber(arr));
        re.addFlashAttribute("result8", service1.medianNumber(arr));
        return "redirect:/lvl1";
    }

    @PostMapping("/ex9")
    public String ex9(@RequestParam("str2") String str2, RedirectAttributes re){
        re.addFlashAttribute("result9", service1.numberOfWords(str2));
        return "redirect:/lvl1";
    }

    @PostMapping("/ex10")
    public String ex10(@RequestParam("elements6") List<String> arr, RedirectAttributes re){
        re.addFlashAttribute("result10", service1.numberOfStrCtnA(arr));
        return "redirect:/lvl1";
    }
}
