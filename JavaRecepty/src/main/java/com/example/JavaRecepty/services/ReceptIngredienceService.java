package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.ReceptIngredience;

import java.util.List;

public interface ReceptIngredienceService {

    List<ReceptIngredience> getAllReceptIngredience();

    ReceptIngredience createReceptIngredience(ReceptIngredience receptIngredience);
}
