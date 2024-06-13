package com.example.JavaRecepty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.JavaRecepty.entity.Recept;

@Repository
public interface ReceptRepository extends JpaRepository<Recept, Long> {
}
