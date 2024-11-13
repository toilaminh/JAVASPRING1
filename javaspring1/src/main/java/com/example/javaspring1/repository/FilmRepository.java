package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex3_1;
import com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex8_1;
import com.example.javaspring1.model.dto.sql.level2.FilmDto_Ex3_2;
import com.example.javaspring1.model.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer>, JpaRepository<Film, Integer> {
    //Level1
    @Query(value = "SELECT * FROM film f ORDER BY f.film_id", nativeQuery = true)
    List<Film> findAllTitle();

    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex3_1( f.id, f.title, COUNT(r.inventory.id))\n" +
            "FROM film f\n" +
            "JOIN f.inventories i ON f.id = i.film.id\n" +
            "JOIN i.rentals r ON r.inventory.id = i.id\n" +
            "GROUP BY f.id\n" +
            "ORDER BY COUNT(r.inventory.id) DESC")
    List<FilmDto_Ex3_1> findTop5MostRentedFilms();

    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.FilmDto_Ex8_1(f.title)\n" +
            "FROM film f\n" +
            "WHERE f.rating = 'PG-13' AND f.length >= 120\n" +
            "ORDER BY f.id ASC")
    List<FilmDto_Ex8_1> findAllTitleRatingPG13And120sLength();

    //Level2
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level2.FilmDto_Ex3_2( f.title)\n" +
            "FROM film f\n" +
            "JOIN f.inventories i ON i.film.id = f.id\n" +
            "JOIN i.rentals r ON r.inventory.id = i.id\n" +
            "WHERE r.returnDate IS NULL AND r.rentalDate IS NOT NULL\n" +
            "ORDER BY film.id ASC")
    List<FilmDto_Ex3_2> findFilmTitleWhichRentedButNeverReturned();
}
