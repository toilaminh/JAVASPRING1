package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity(name = "country")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer id;
    private String country;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private Set<City> city;
}
