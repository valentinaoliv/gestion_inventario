package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Categoria;
import com.example.demo.services.categoriasDao;

@Controller
public class CategoriaController {
    @Autowired
    private categoriasDao categoriasDao;

    @GetMapping("/categorias")
    public String mostrarCategorias(Model model) {
        // Obtener las categorias de la base de datos
        List<Categoria> categorias = categoriasDao.getAllCategorias();

        // Pasar los productos al modelo para que Thymeleaf los use
        model.addAttribute("categorias", categorias);

        // Devuelve la plantilla Thymeleaf "productos.html"
        return "categorias";

}
}