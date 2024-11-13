package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        System.out.println("Obteniendo todos los productos...");
        return productoRepository.findAll();  // Recupera todos los productos
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);  // Recupera un producto por su ID
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);  // Guarda un producto
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);  // Elimina un producto
    }
}
