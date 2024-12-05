package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Producto;
import com.example.demo.services.productosDao;

@Controller
public class ProductoController {

    @Autowired
    private productosDao productosDao;

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        // Obtener los productos de la base de datos
        List<Producto> productos = productosDao.getAllProductos();

        // Pasar los productos al modelo para que Thymeleaf los use
        model.addAttribute("productos", productos);

        // Devuelve la plantilla Thymeleaf "productos.html"
        return "productos";
    }
}
