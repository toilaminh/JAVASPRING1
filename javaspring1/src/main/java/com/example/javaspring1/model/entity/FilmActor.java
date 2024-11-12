package com.example.javaspring1.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "film_actor")
@Getter
@Setter
public class FilmActor {

    @Column(name = "actor_id")
    @ManyToOne
    private Actor actor;
}
