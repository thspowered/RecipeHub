package com.example.JavaRecepty.entity;

import jakarta.persistence.*;
@Entity
public class KategorieIngredienci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazev;
    private String popis;

    // Konstruktory, Gettery a Settery

    public KategorieIngredienci() {}

    public KategorieIngredienci(String nazev, String popis) {
        this.nazev = nazev;
        this.popis = popis;
    }

    // Gettery a Settery
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

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
}
