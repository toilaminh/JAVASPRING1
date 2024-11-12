package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "city")
@Getter
@Setter
public class City {
    @Id
    @Column(name = "city_id")
    private Integer id;
    private String city;
    @Column(name = "last_update")
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country countryId;


}
