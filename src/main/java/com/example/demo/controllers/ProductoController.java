package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.productosDao;
import com.example.demo.model.Producto;


@RestController
public class ProductoController {

    @Autowired
    private productosDao productosDao;
    
    @RequestMapping(value = "/products")
    public List<Producto> getAllProductos() {
        return productosDao.getAllProductos();
    }

}
