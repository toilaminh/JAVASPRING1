package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.FilmDto;
import com.example.javaspring1.model.entity.Film;
import com.example.javaspring1.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public List<FilmDto> findAllTitle(){
        List<FilmDto> filmDtos = new ArrayList<>();
        for(Film a : filmRepository.findAll()){
            filmDtos.add(new FilmDto(a.getTitle(), a.getRentalRate(), a.getReplacementCost(), a.getRating()));
        }
        return filmDtos;
    }
}
