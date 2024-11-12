package com.example.javaspring1.model.dto.sql;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDto {
    private String firstName;
    private String lastName;
    public ActorDto(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
}
