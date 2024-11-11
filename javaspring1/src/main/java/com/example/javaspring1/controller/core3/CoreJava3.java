package com.example.javaspring1.controller.core3;

import com.example.javaspring1.services.core3.ServiceJV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jv3")
public class CoreJava3 {
    @Autowired
    ServiceJV3 serviceJV3;

    @PostMapping("/calculator")
    public double jvcore3(@RequestBody String str){
        return serviceJV3.evaluateExpression(str);
    }
}
