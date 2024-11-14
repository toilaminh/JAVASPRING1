package com.example.javaspring1.model.dto.sql.level2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto_Ex9_2 {
    private String firstName;
    private String lastName;
    public CustomerDto_Ex9_2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
