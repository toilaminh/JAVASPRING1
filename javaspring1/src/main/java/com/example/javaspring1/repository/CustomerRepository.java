package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.level1.CustomerDto_Ex5_1;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex1_2;
import com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex2_2;
import com.example.javaspring1.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //Level1
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.CustomerDto_Ex5_1( c.firstName, c.lastName, a.address)\n" +
            "FROM customer c\n" +
            "JOIN c.address a ON a.id = c.address.id\n" +
            "JOIN c.rentals r ON r.customer.id = c.id\n" +
            "WHERE r.rentalDate >= :startDate AND r.rentalDate <= :endDate\n" +
            "GROUP BY c.id")
    List<CustomerDto_Ex5_1> findAllCustomerWhoRentedFilmIn2022(@Param("startDate") LocalDate start, @Param("endDate") LocalDate end);

    //Level2
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex1_2(c.firstName, c.lastName, SUM(p.amount))\n" +
            "FROM customer c\n" +
            "JOIN c.payments p ON c.id = p.customer.id\n" +
            "GROUP BY c.id\n" +
            "ORDER BY SUM(p.amount) DESC\n" +
            "LIMIT 10")
    List<CustomerDto_Ex1_2> find10CustomerWhoSpentMostMoney();

    @Query("SELECT new com.example.javaspring1.model.dto.sql.level2.CustomerDto_Ex2_2(c.firstName, c.lastName, c.email)\n" +
            "FROM customer c\n" +
            "JOIN c.rentals r ON r.customer.id = c.id\n" +
            "JOIN r.inventory i ON i.id = r.inventory.id\n" +
            "JOIN film_category fc ON fc.film.id = i.film.id\n" +
            "GROUP BY c.id\n" +
            "HAVING COUNT(distinct fc.category.id) = 16\n" +
            "ORDER BY c.id ASC")
    List<CustomerDto_Ex2_2> findCustomerRentedAllCategories();


}
