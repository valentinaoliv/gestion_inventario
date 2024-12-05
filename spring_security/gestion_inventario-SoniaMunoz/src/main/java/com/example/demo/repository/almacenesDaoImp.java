package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Almacen;
import com.example.demo.services.almacenesDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class almacenesDaoImp implements almacenesDao{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Almacen> getAllAlmacenes() {
        String query = "FROM Almacen";
        return entityManager.createQuery(query).getResultList();
    }

}
