package com.example.demo.controllers;

import com.example.demo.model.Institucion;
import com.example.demo.repository.InstitucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InstitucionController {

    @Autowired
    private InstitucionRepository institucionRepository;

    // Ruta para ver todas las instituciones
    @GetMapping("/instituciones")
    public String listarInstituciones(Model model) {
        model.addAttribute("instituciones", institucionRepository.findAll());
        return "instituciones"; // Devuelve la plantilla "instituciones.html"
    }

    // Ruta para ver los detalles de una institución
    @GetMapping("/institucion/{id}")
    public String verInstitucion(@PathVariable Long id, Model model) {
        Institucion institucion = institucionRepository.findById(id).orElse(null);
        model.addAttribute("institucion", institucion);
        return "institucion-detalle"; // Devuelve la plantilla "institucion-detalle.html"
    }
}
