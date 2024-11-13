package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.level1.ActorDto_Ex7_1;
import com.example.javaspring1.model.dto.sql.level2.ActorDto_Ex4_2;
import com.example.javaspring1.model.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer>, JpaRepository<Actor,Integer> {
    //Level1
    @Query(value = "SELECT * FROM actor a ORDER BY a.actor_id", nativeQuery = true)
//    @Query("SELECT new com.example.javaspring1.model.dto.sql.ActorDto(a.firstName, a.lastName) FROM actor a")
    List<Actor> findAll();

    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.ActorDto_Ex7_1(a.firstName, a.lastName)\n" +
            "FROM actor a\n" +
            "JOIN a.filmActors fa ON a.id = fa.actor.id\n" +
            "GROUP BY a.id\n" +
            "HAVING COUNT(fa.actor.id) >= 20")
    List<ActorDto_Ex7_1> findAllActorsWhoAppearedMoreThan20Films();

    //Level2
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level2.ActorDto_Ex4_2(a.firstName, a.lastName)\n" +
            "FROM actor a\n" +
            "JOIN a.filmActors fa ON fa.actor.id = a.id\n" +
            "JOIN fa.film f ON f.id = fa.film.id\n" +
            "JOIN f.filmCategories fc ON fc.film.id = f.id\n" +
            "GROUP BY a.id\n" +
            "HAVING COUNT(distinct fc.category.id) = (select count(*) from category)\n" +
            "ORDER BY a.id ASC")
    List<ActorDto_Ex4_2> findAllActorsWhoAppearedAtLeastOnceInEachCategory();
}
