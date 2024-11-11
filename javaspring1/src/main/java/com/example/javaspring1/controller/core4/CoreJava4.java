package com.example.javaspring1.controller.core4;

import com.example.javaspring1.model.dto.core4.EmpData;
import com.example.javaspring1.services.core4.ServiceJV4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/jv4")
public class CoreJava4 {
    @Autowired
    ServiceJV4 serviceJV4;

    @PostMapping(value = "/readfile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<EmpData> jvcore4(@RequestParam("f") MultipartFile f ){
        return serviceJV4.readEXcel(f);
    }
}
