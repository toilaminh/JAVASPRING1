package com.example.javaspring1.model.dto.sql.level2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDto_Ex7_2 {
    private String firstName;
    private String lastName;
    public ActorDto_Ex7_2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
