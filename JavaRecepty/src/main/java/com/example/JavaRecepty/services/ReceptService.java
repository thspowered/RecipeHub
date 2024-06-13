package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.Recept;
import com.example.JavaRecepty.repository.ReceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceptService {

    @Autowired
    private ReceptRepository receptRepository;

    public List<Recept> getAllRecepty() {
        return receptRepository.findAll();
    }

    public Recept getReceptById(Long id) {
        return receptRepository.findById(id).orElse(null);
    }

    public Recept createRecept(Recept recept) {
        return receptRepository.save(recept);
    }

    public void deleteRecept(Long id) {
        receptRepository.deleteById(id);
    }

    public Recept updateRecept(Long id, Recept updatedRecept) {
        Recept existingRecept = receptRepository.findById(id).orElse(null);
        if (existingRecept != null) {
            existingRecept.setNazev(updatedRecept.getNazev());
            existingRecept.setPostupPripravy(updatedRecept.getPostupPripravy());
            existingRecept.setNarocnost(updatedRecept.getNarocnost());
            existingRecept.setKategorie(updatedRecept.getKategorie());
            existingRecept.setReceptIngredience(updatedRecept.getReceptIngredience());
            return receptRepository.save(existingRecept);
        }
        return null;
    }
}
