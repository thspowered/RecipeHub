package com.example.JavaRecepty.repository;

import com.example.JavaRecepty.entity.KategorieIngredienci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorieIngredienciRepository extends JpaRepository<KategorieIngredienci, Long> {
}
