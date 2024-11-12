package com.example.javaspring1.repository;

import com.example.javaspring1.model.entity.Actor;
import com.example.javaspring1.model.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer>, JpaRepository<Film, Integer> {
    @Query(value = "SELECT * FROM film f ORDER BY f.film_id", nativeQuery = true)
    List<Film> findAll();
}
