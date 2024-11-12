package com.example.javaspring1.services.sql;

import com.example.javaspring1.model.dto.sql.ActorDto;
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

    public List<ActorDto> findAllFirstNameAndLastName(){
        List<ActorDto> actorDtos = new ArrayList<>();
        for(Actor a : actorRepository.findAll()){
            ActorDto t = new ActorDto(a.getFirstName(), a.getLastName());
            actorDtos.add(t);
        }
        return actorDtos;
//        return actorRepository.findAllFirstnameAndLastname();
    }
}
