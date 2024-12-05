package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Categoria;
import com.example.demo.services.categoriasDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class categoriasDaoImp implements categoriasDao{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Categoria> getAllCategorias() {
        String query = "FROM Categoria";
        return entityManager.createQuery(query).getResultList();
    }

}
