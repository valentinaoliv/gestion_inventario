package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Esto es para autoincrementar la ID
    private Long id;
    private Long cantidad;
    private Long cantidadMin;
    private Long cantidadMax;
    private Long nombre;
    private Long idTipoProduct;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNombre() {
        return nombre;
    }

    public Long getCantidad() {
        return cantidad;
    }
    
    public Long getCantidadMin() {
        return cantidadMin;
    }

    public Long getCantidadMax() {
        return cantidadMax;
    }

    public Long getIdTipoProducto() {
        return idTipoProduct;
    }
}
