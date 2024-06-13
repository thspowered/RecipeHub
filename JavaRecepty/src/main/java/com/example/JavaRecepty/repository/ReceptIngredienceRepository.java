package com.example.JavaRecepty.repository;

import com.example.JavaRecepty.entity.ReceptIngredience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptIngredienceRepository extends JpaRepository<ReceptIngredience, Long> {
}
