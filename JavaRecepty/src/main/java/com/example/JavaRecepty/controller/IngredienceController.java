package com.example.JavaRecepty.controller;

import com.example.JavaRecepty.entity.Ingredience;
import com.example.JavaRecepty.services.IngredienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredience")
public class IngredienceController {

    @Autowired
    private IngredienceService ingredienceService;

    // Získání všech ingrediencí
    @GetMapping
    public ResponseEntity<List<Ingredience>> getAllIngredience() {
        List<Ingredience> ingredience = ingredienceService.getAllIngredience();
        return new ResponseEntity<>(ingredience, HttpStatus.OK);
    }

    // Získání ingredience podle ID
    @GetMapping("/{id}")
    public ResponseEntity<Ingredience> getIngredienceById(@PathVariable Long id) {
        Ingredience ingredience = ingredienceService.getIngredienceById(id);
        if (ingredience != null) {
            return new ResponseEntity<>(ingredience, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Vytvoření nové ingredience
    @PostMapping
    public ResponseEntity<Ingredience> createIngredience(@RequestBody Ingredience ingredience) {
        Ingredience createdIngredience = ingredienceService.createIngredience(ingredience);
        return new ResponseEntity<>(createdIngredience, HttpStatus.CREATED);
    }

    // Smazání ingredience podle ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIngredience(@PathVariable Long id) {
        ingredienceService.deleteIngredience(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/ingredienceAll")
    public String showIngrediencePage() {
        return "receptyAll";
    }
}
