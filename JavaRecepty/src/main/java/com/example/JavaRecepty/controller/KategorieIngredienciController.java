package com.example.JavaRecepty.controller;

import com.example.JavaRecepty.entity.KategorieIngredienci;
import com.example.JavaRecepty.services.KategorieIngredienciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/kategorie-ingredienci")
public class KategorieIngredienciController {

    @Autowired
    private KategorieIngredienciService kategorieIngredienciService;

    @GetMapping
    public ResponseEntity<List<KategorieIngredienci>> getAllKategorieIngredienci() {
        List<KategorieIngredienci> kategorieIngredienci = kategorieIngredienciService.getAllKategorieIngredienci();
        return new ResponseEntity<>(kategorieIngredienci, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KategorieIngredienci> getKategorieIngredienciById(@PathVariable Long id) {
        KategorieIngredienci kategorieIngredienci = kategorieIngredienciService.getKategorieIngredienciById(id);
        if (kategorieIngredienci != null) {
            return new ResponseEntity<>(kategorieIngredienci, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<KategorieIngredienci> createKategorieIngredienci(@RequestBody KategorieIngredienci kategorieIngredienci) {
        KategorieIngredienci createdKategorieIngredienci = kategorieIngredienciService.createKategorieIngredienci(kategorieIngredienci);
        return new ResponseEntity<>(createdKategorieIngredienci, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKategorieIngredienci(@PathVariable Long id) {
        kategorieIngredienciService.deleteKategorieIngredienci(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
