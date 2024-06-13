package com.example.JavaRecepty.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ReceptIngredience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recept_id")
    private Recept recept;

    @ManyToOne
    @JoinColumn(name = "ingredience_id")
    private Ingredience ingredience;

    private BigDecimal mnozstvi;

    // Gettery a settery

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recept getRecept() {
        return recept;
    }

    public void setRecept(Recept recept) {
        this.recept = recept;
    }

    public Ingredience getIngredience() {
        return ingredience;
    }

    public void setIngredience(Ingredience ingredience) {
        this.ingredience = ingredience;
    }

    public BigDecimal getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(BigDecimal mnozstvi) {
        this.mnozstvi = mnozstvi;
    }
}
