package com.example.JavaRecepty.services;

import com.example.JavaRecepty.entity.KategorieReceptu;
import com.example.JavaRecepty.repository.KategorieReceptuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KategorieReceptuService {

    @Autowired
    private KategorieReceptuRepository kategorieReceptuRepository;

    public List<KategorieReceptu> getAllKategorieReceptu() {
        return kategorieReceptuRepository.findAll();
    }

    public KategorieReceptu getKategorieReceptuById(Long id) {
        return kategorieReceptuRepository.findById(id).orElse(null);
    }

    public KategorieReceptu createKategorieReceptu(KategorieReceptu kategorieReceptu) {
        return kategorieReceptuRepository.save(kategorieReceptu);
    }

    public void deleteKategorieReceptu(Long id) {
        kategorieReceptuRepository.deleteById(id);
    }
}
