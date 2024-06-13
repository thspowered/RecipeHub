package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.KategorieIngredienci;
import com.example.JavaRecepty.repository.KategorieIngredienciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KategorieIngredienciService {

    @Autowired
    private KategorieIngredienciRepository kategorieIngredienciRepository;

    public List<KategorieIngredienci> getAllKategorieIngredienci() {
        return kategorieIngredienciRepository.findAll();
    }

    public KategorieIngredienci getKategorieIngredienciById(Long id) {
        return kategorieIngredienciRepository.findById(id).orElse(null);
    }

    public KategorieIngredienci createKategorieIngredienci(KategorieIngredienci kategorieIngredienci) {
        return kategorieIngredienciRepository.save(kategorieIngredienci);
    }

    public void deleteKategorieIngredienci(Long id) {
        kategorieIngredienciRepository.deleteById(id);
    }
}
