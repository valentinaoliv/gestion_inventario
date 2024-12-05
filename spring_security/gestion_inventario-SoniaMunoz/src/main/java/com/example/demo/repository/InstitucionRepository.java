package com.example.demo.repository;

import com.example.demo.model.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitucionRepository extends JpaRepository<Institucion, Long> {
}
