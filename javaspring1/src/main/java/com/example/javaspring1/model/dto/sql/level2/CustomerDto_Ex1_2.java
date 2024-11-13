package com.example.javaspring1.model.dto.sql.level2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto_Ex1_2 {
    private String firstName;
    private String lastName;
    private Double sum;
    public CustomerDto_Ex1_2(String firstName, String lastName, Double sum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sum = sum;
    }
}
