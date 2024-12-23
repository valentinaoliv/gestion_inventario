package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    // Ruta para la página de inicio
    @GetMapping("/")
    public String home() {
        return "index";  // Devuelve la plantilla "index.html"
    }

    
    @GetMapping("/provedores")
    public String mostrarElProvedor() {
        return "provedores"; // Devuelve la plantilla "provedores.html"
    }
    
    @GetMapping("/login")
    public String mostrarElLogin() {
        return "login";
    }

    @GetMapping("/reportes")
    public String mostrarElReporte() {
        return "reportes";
    }
    
   // Redirigir a la página de inicio después de hacer login
    @PostMapping("/home")
    public String login() {
        return "home"; // Nombre de tu archivo home.html
    } 
    

}

