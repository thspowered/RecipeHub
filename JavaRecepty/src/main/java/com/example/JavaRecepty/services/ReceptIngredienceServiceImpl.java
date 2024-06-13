package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.ReceptIngredience;
import com.example.JavaRecepty.repository.ReceptIngredienceRepository;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptIngredienceServiceImpl implements ReceptIngredienceService {

    private final ReceptIngredienceRepository receptIngredienceRepository;

    @Autowired
    public ReceptIngredienceServiceImpl(ReceptIngredienceRepository receptIngredienceRepository) {
        this.receptIngredienceRepository = receptIngredienceRepository;
    }

    @Override
    public List<ReceptIngredience> getAllReceptIngredience() {
        return receptIngredienceRepository.findAll();
    }

    @Override
    public ReceptIngredience createReceptIngredience(ReceptIngredience receptIngredience) {
        return receptIngredienceRepository.save(receptIngredience);
    }
}


