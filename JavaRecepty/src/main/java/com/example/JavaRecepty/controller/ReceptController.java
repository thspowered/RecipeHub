package com.example.JavaRecepty.controller;

import com.example.JavaRecepty.entity.Recept;
import com.example.JavaRecepty.services.ReceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/recepty")
public class ReceptController {

    @Autowired
    private ReceptService receptService;

    @GetMapping
    public ResponseEntity<List<Recept>> getAllRecepty() {
        List<Recept> recepty = receptService.getAllRecepty();
        return new ResponseEntity<>(recepty, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recept> getReceptById(@PathVariable Long id) {
        Recept recept = receptService.getReceptById(id);
        if (recept != null) {
            return new ResponseEntity<>(recept, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/vytvorRecept")
    public String showIngrediencePage() {
        return "vytvorRecept";
    }

    @PostMapping
    public ResponseEntity<Recept> createRecept(@RequestBody Recept recept) {
        Recept createdRecept = receptService.createRecept(recept);
        return new ResponseEntity<>(createdRecept, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recept> updateRecept(@PathVariable Long id, @RequestBody Recept recept) {
        Recept updatedRecept = receptService.updateRecept(id, recept);
        if (updatedRecept != null) {
            return new ResponseEntity<>(updatedRecept, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecept(@PathVariable Long id) {
        receptService.deleteRecept(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailPage(@PathVariable Long id) {
        Recept recept = receptService.getReceptById(id);
        if (recept != null) {
            ModelAndView modelAndView = new ModelAndView("Detail");
            modelAndView.addObject("recept", recept);
            modelAndView.addObject("ingredience", recept.getReceptIngredience()); // Přidáváme data o ingrediencích
            return modelAndView;
        } else {
            return new ModelAndView("redirect:/recepty"); // Přesměrování na seznam receptů
        }
    }



}
