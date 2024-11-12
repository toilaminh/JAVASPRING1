package com.example.javaspring1.controller.mysql;

import com.example.javaspring1.model.dto.sql.ActorDto;
import com.example.javaspring1.model.dto.sql.FilmDto;
import com.example.javaspring1.model.entity.Film;
import com.example.javaspring1.services.sql.ActorService;
import com.example.javaspring1.services.sql.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Sql1 {

    @Autowired
    ActorService actorService;
    @Autowired
    FilmService filmService;

    @GetMapping("/ex1")
    public List<ActorDto> actorDtoList(){
       return actorService.findAllFirstNameAndLastName();
    }

    @GetMapping("/ex2")
    public List<FilmDto> filmDtoList(){
        return filmService.findAllTitle();
    }
}
