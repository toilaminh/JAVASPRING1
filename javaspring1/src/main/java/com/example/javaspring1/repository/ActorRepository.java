package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.ActorDto;
import com.example.javaspring1.model.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer>, JpaRepository<Actor,Integer> {
    @Query(value = "SELECT * FROM actor a ORDER BY a.actor_id", nativeQuery = true)
//    @Query("SELECT new com.example.javaspring1.model.dto.sql.ActorDto(a.firstName, a.lastName) FROM actor a")
    List<Actor> findAll();
}
