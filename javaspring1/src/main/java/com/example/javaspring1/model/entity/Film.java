package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "film")
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer id;
    private String title;
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Column(name = "rental_duration")
    private Integer rentalDuration;
    @Column(name = "rental_rate")
    private Double rentalRate;
    private Integer length;
    @Column(name = "replacement_cost")
    private Double replacementCost;
    private FilmRating rating;
    @Column(name = "special_features")
    private String specialFeature;
    @Column(name = "last_update")
    private LocalDate lastUpadte;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language languageId;

    @Column(name = "original_language_id")
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language originalLanguageId;
}
