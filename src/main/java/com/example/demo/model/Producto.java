package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Uso 'int' en lugar de Long

    private String nombre;
    private int cantidad;

    // idTipoProduct también debe ser int, si la base de datos usa 'int'
    private int idTipoProduct;  // Asegúrate de que esto sea 'int'

    // Constructor vacío (por JPA)
    public Producto() {}

    // Constructor con parámetros
    public Producto(String nombre, int cantidad, int idTipoProduct) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idTipoProduct = idTipoProduct;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdTipoProduct() {
        return idTipoProduct;
    }

    public void setIdTipoProduct(int idTipoProduct) {
        this.idTipoProduct = idTipoProduct;
    }
}