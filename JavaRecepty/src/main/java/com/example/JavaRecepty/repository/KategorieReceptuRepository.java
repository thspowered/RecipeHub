package com.example.JavaRecepty.repository;

import com.example.JavaRecepty.entity.KategorieReceptu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorieReceptuRepository extends JpaRepository<KategorieReceptu, Long> {
}
