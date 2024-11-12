package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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
    private String rating;
    @Column(name = "special_features")
    private String specialFeature;

    @Transient
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language languageId;

    @Transient
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language originalLanguageId;

    @OneToMany(mappedBy = "film")
    private Set<FilmActor> filmActors;
}
