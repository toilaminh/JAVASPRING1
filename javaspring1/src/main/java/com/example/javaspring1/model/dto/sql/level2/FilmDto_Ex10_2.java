package com.example.javaspring1.model.dto.sql.level2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilmDto_Ex10_2 {
    private String title;
    public FilmDto_Ex10_2(String title){
        this.title = title;
    }
}