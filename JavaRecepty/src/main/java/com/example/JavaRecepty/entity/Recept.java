package com.example.JavaRecepty.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Recept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazev;
    private String postupPripravy;
    private String narocnost;

    @ManyToOne
    @JoinColumn(name = "kategorie_id")
    private KategorieReceptu kategorie;

    @OneToMany(mappedBy = "recept")
    private List<ReceptIngredience> receptIngredience;

    // Konstruktory
    public Recept() {}

    public Recept(String nazev, String postupPripravy, String narocnost, KategorieReceptu kategorie) {
        this.nazev = nazev;
        this.postupPripravy = postupPripravy;
        this.narocnost = narocnost;
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

    public String getPostupPripravy() {
        return postupPripravy;
    }

    public void setPostupPripravy(String postupPripravy) {
        this.postupPripravy = postupPripravy;
    }

    public String getNarocnost() {
        return narocnost;
    }

    public void setNarocnost(String narocnost) {
        this.narocnost = narocnost;
    }

    public KategorieReceptu getKategorie() {
        return kategorie;
    }

    public void setKategorie(KategorieReceptu kategorie) {
        this.kategorie = kategorie;
    }

    public List<ReceptIngredience> getReceptIngredience() {
        return receptIngredience;
    }

    public void setReceptIngredience(List<ReceptIngredience> receptIngredience) {
        this.receptIngredience = receptIngredience;
    }
}