package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.level1.ActorDto_Ex1_1;
import com.example.javaspring1.model.dto.sql.level1.ActorDto_Ex7_1;
import com.example.javaspring1.model.dto.sql.level2.ActorDto_Ex4_2;
import com.example.javaspring1.model.entity.Actor;
import com.example.javaspring1.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    //Level1
    public List<ActorDto_Ex1_1> findAllFirstNameAndLastName(){
        List<ActorDto_Ex1_1> actorDtoLevel1Ex1s = new ArrayList<>();
        for(Actor a : actorRepository.findAll()){
            ActorDto_Ex1_1 t = new ActorDto_Ex1_1(a.getFirstName(), a.getLastName());
            actorDtoLevel1Ex1s.add(t);
        }
        return actorDtoLevel1Ex1s;
//        return actorRepository.findAllFirstnameAndLastname();
    }

    public List<ActorDto_Ex7_1> findAllActorsWhoAppearedMoreThan20Films(){
        return actorRepository.findAllActorsWhoAppearedMoreThan20Films();
    }

    //Level2
    public List<ActorDto_Ex4_2> findAllActorsWhoAppearedAtLeastOnceInEachCategory(){
        return actorRepository.findAllActorsWhoAppearedAtLeastOnceInEachCategory();
    }
}
