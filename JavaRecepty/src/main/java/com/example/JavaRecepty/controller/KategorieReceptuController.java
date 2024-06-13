package com.example.JavaRecepty.controller;

import com.example.JavaRecepty.entity.KategorieReceptu;
import com.example.JavaRecepty.services.KategorieReceptuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/kategorie-receptu")
public class KategorieReceptuController {

    @Autowired
    private KategorieReceptuService kategorieReceptuService;

    @GetMapping
    public ResponseEntity<List<KategorieReceptu>> getAllKategorieReceptu() {
        List<KategorieReceptu> kategorieReceptu = kategorieReceptuService.getAllKategorieReceptu();
        return new ResponseEntity<>(kategorieReceptu, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<KategorieReceptu> getKategorieReceptuById(@PathVariable Long id) {
        KategorieReceptu kategorieReceptu = kategorieReceptuService.getKategorieReceptuById(id);
        if (kategorieReceptu != null) {
            return new ResponseEntity<>(kategorieReceptu, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<KategorieReceptu> createKategorieReceptu(@RequestBody KategorieReceptu kategorieReceptu) {
        KategorieReceptu createdKategorieReceptu = kategorieReceptuService.createKategorieReceptu(kategorieReceptu);
        return new ResponseEntity<>(createdKategorieReceptu, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKategorieReceptu(@PathVariable Long id) {
        kategorieReceptuService.deleteKategorieReceptu(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
