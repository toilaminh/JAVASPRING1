package com.example.javaspring1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity(name = "language")
@Getter
@Setter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Integer id;
    private String name;

    @Transient
    @OneToMany(mappedBy = "language")
    private Set<Film> film1;

    @Transient
    @OneToMany(mappedBy = "originalLanguage")
    private Set<Film> film2;
}
