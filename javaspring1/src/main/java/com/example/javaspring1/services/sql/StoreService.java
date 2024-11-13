package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.level1.StoreDto_Ex6_1;
import com.example.javaspring1.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    StoreRepository storeRepository;

    public List<StoreDto_Ex6_1> findRevenueGeneratedByEachStore(Integer year){
        return storeRepository.findRevenueGeneratedByEachStore(year);
    }
}
