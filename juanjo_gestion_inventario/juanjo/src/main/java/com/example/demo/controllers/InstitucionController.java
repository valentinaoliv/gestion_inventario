package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Institucion;
import com.example.demo.services.institucionesDao;



@Controller
public class InstitucionController {

     @Autowired
    private institucionesDao institucionesDao;

    @GetMapping("/instituciones")
    public String mostrarInstituciones(Model model) {
        // Obtener las categorias de la base de datos
        List<Institucion> instituciones = institucionesDao.getAllInstituciones();

        // Pasar los productos al modelo para que Thymeleaf los use
        model.addAttribute("instituciones", instituciones);

        // Devuelve la plantilla Thymeleaf "productos.html"
        return "instituciones";

}
}