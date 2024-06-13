package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.Ingredience;
import com.example.JavaRecepty.repository.IngredienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IngredienceService {

    @Autowired
    private IngredienceRepository ingredienceRepository;

    public List<Ingredience> getAllIngredience() {
        return ingredienceRepository.findAll();
    }

    public Ingredience getIngredienceById(Long id) {
        return ingredienceRepository.findById(id).orElse(null);
    }

    public Ingredience createIngredience(Ingredience ingredience) {
        return ingredienceRepository.save(ingredience);
    }

    public void deleteIngredience(Long id) {
        ingredienceRepository.deleteById(id);
    }


}
