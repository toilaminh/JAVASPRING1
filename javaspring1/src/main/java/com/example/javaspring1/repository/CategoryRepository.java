package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.level1.CategoryDto_Ex4_1;
import com.example.javaspring1.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>, JpaRepository<Category, Integer> {
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.CategoryDto_Ex4_1(ctg.name,AVG(f.rentalDuration))\n" +
           "FROM category ctg\n" +
            "INNER JOIN film_category fctg ON fctg.category.id = ctg.id\n" +
            "INNER JOIN film f ON f.id = fctg.film.id\n" +
            "GROUP BY ctg.id\n" +
            "ORDER BY AVG(f.rentalDuration) DESC")
    List<CategoryDto_Ex4_1> findAvgRentalDuration();
}