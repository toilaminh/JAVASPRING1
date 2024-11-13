package com.example.javaspring1.model.dto.sql.level2;

import com.example.javaspring1.model.entity.Actor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDto_Ex4_2 {
    private String firstName;
    private String lastName;
    public ActorDto_Ex4_2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
