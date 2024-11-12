package com.example.javaspring1.model.dto.sql;

import com.example.javaspring1.model.entity.FilmRating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilmDto {
//    private Integer id;
    private String title;
//    private String description;
//    private Integer releaseYear;
//    private Integer languageId;
//    private Integer originalLanguageId;
//    private Integer rentalDuration;
    private Double rentalRate;
//    private Integer length;
    private Double replacementCost;
    private String rating;
//    private String specialFeature;
    public FilmDto(String title, Double rentalRate, Double replacementCost, String rating){
        this.title = title;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
    }
}
