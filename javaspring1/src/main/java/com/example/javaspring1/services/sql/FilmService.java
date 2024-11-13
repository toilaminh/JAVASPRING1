package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex2_1;
import com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex3_1;
import com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex8_1;
import com.example.javaspring1.model.dto.sql.level2.FilmDto_Ex3_2;
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

    //Level1
    public List<FilmDto_Ex2_1> findAllTitle(){
        List<FilmDto_Ex2_1> filmDtoLevel1Ex2s = new ArrayList<>();
        for(Film a : filmRepository.findAllTitle()){
            FilmDto_Ex2_1 filmDtoLevel1Ex2 = new FilmDto_Ex2_1();
            filmDtoLevel1Ex2.setTitle(a.getTitle());
//            filmDto.setRating(a.getRating());
            filmDtoLevel1Ex2.setRentalRate(a.getRentalRate());
            filmDtoLevel1Ex2.setReplacementCost(a.getReplacementCost());
            filmDtoLevel1Ex2s.add(filmDtoLevel1Ex2);
        }
        return filmDtoLevel1Ex2s;
    }

    public List<FilmDto_Ex3_1> findTop5MostRentedFilms(){
        return filmRepository.findTop5MostRentedFilms();
    }

    public List<FilmDto_Ex8_1> findAllTitleRatingPG13And120sLength(){
        return filmRepository.findAllTitleRatingPG13And120sLength();
    }

    //Level2
    public List<FilmDto_Ex3_2> findFilmTitleWhichRentedButNeverReturned(){
        return filmRepository.findFilmTitleWhichRentedButNeverReturned();
    }
}
