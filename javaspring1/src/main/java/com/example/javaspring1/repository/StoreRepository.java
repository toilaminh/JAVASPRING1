package com.example.javaspring1.repository;

import com.example.javaspring1.model.dto.sql.level1.StoreDto_Ex6_1;
import com.example.javaspring1.model.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
    @Query("SELECT new com.example.javaspring1.model.dto.sql.level1.StoreDto_Ex6_1(s.id, SUM(p.amount))\n" +
            "FROM store s\n" +
            "JOIN s.staff st ON s.manager.id = st.id\n" +
            "JOIN st.payments p ON p.staff.id = st.id\n" +
            "where YEAR(p.paymentDate) = :year\n" +
            "GROUP BY s.id")
    List<StoreDto_Ex6_1> findRevenueGeneratedByEachStore(@Param("year") Integer year);
}
