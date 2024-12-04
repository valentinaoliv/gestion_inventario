package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Institucion;
import com.example.demo.services.institucionesDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class institucionesDaoImp implements institucionesDao{

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Institucion> getAllInstituciones() {
        String query = "FROM Institucion";
        return entityManager.createQuery(query).getResultList();
    }


}
