package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto;
import com.example.demo.services.productosDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class productosDaoImp implements productosDao{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Producto> getAllProductos() {
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();
    }

}
