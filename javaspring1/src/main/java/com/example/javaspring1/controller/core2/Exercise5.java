package com.example.javaspring1.controller.core2;

import com.example.javaspring1.model.dto.core2.ObjEx5;
import com.example.javaspring1.model.dto.core2.ObjEx5_Res;
import com.example.javaspring1.services.core2.ServiceJV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jv2/ex5")
public class Exercise5 {
    @Autowired
    ServiceJV2 serviceJV2;

    @PostMapping("/add")
    public ObjEx5_Res ex5_add(@RequestBody ObjEx5 objEx5){
        return serviceJV2.sumTarget(objEx5);
    }
}
