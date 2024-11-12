package com.example.javaspring1.model.dto.sql;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDto {
//    private Integer id;
    private String firstName;
    private String lastName;
    public ActorDto(String fn, String ln){
//        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
    }
}
