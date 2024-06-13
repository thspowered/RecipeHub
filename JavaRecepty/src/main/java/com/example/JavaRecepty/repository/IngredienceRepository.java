package com.example.JavaRecepty.repository;

import com.example.JavaRecepty.entity.Ingredience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienceRepository extends JpaRepository<Ingredience, Long> {
}
