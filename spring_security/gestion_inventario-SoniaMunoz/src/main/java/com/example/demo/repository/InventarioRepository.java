package com.example.demo.repository;

import com.example.demo.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    List<Inventario> findByInstitucionId(Long institucionId);
}
