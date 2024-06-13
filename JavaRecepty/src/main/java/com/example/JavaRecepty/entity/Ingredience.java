package com.example.JavaRecepty.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Ingredience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazev;
    private String jednotkaMerania;

    @ManyToOne
    @JoinColumn(name = "kategorie_id")
    private KategorieIngredienci kategorie;

    @OneToMany(mappedBy = "ingredience")
    private List<ReceptIngredience> receptIngredience;

    // Konstruktory
    public Ingredience() {}

    public Ingredience(String nazev, String jednotkaMerania, KategorieIngredienci kategorie) {
        this.nazev = nazev;
        this.jednotkaMerania = jednotkaMerania;
        this.kategorie = kategorie;
    }

    // Gettery a settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getJednotkaMerania() {
        return jednotkaMerania;
    }

    public void setJednotkaMerania(String jednotkaMerania) {
        this.jednotkaMerania = jednotkaMerania;
    }

    public KategorieIngredienci getKategorie() {
        return kategorie;
    }

    public void setKategorie(KategorieIngredienci kategorie) {
        this.kategorie = kategorie;
    }

    public List<ReceptIngredience> getReceptIngredience() {
        return receptIngredience;
    }

    public void setReceptIngredience(List<ReceptIngredience> receptIngredience) {
        this.receptIngredience = receptIngredience;
    }
}
