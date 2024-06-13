package com.example.JavaRecepty.controller;

import com.example.JavaRecepty.entity.ReceptIngredience;
import com.example.JavaRecepty.services.ReceptIngredienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recept-ingredience")
public class ReceptIngredienceController {

    private final ReceptIngredienceService receptIngredienceService;

    @Autowired
    public ReceptIngredienceController(ReceptIngredienceService receptIngredienceService) {
        this.receptIngredienceService = receptIngredienceService;
    }

    @GetMapping
    public ResponseEntity<List<ReceptIngredience>> getAllReceptIngredience() {
        List<ReceptIngredience> receptIngredienceList = receptIngredienceService.getAllReceptIngredience();
        return new ResponseEntity<>(receptIngredienceList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReceptIngredience> createReceptIngredience(@RequestBody ReceptIngredience receptIngredience) {
        ReceptIngredience createdReceptIngredience = receptIngredienceService.createReceptIngredience(receptIngredience);
        return new ResponseEntity<>(createdReceptIngredience, HttpStatus.CREATED);
    }
}
