package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Almacen;
import com.example.demo.services.almacenesDao;

@Controller
public class AlmacenController {

    @Autowired
    private almacenesDao almacenesDao;

    @GetMapping("/almacenes")
    public String mostrarALmacenes(Model model) {
        // Obtener los almacenes de la base de datos
        List<Almacen> almacenes = almacenesDao.getAllAlmacenes();

        // Pasar los productos al modelo para que Thymeleaf los use
        model.addAttribute("almacenes", almacenes);

        // Devuelve la plantilla Thymeleaf "productos.html"
        return "almacenes";
    }


}
