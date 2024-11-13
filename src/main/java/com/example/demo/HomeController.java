package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    // Ruta para la página de inicio
    @GetMapping("/")
    public String home() {
        return "index";  // Devuelve la plantilla "index.html"
    }


    // Ruta para la página de "Acerca de"
    @GetMapping("/categorias")
    public String mostrarLaCategoria() {
        return "categorias";  // Devuelve la plantilla "categorias.html"
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
    
    @GetMapping("/home")
    public String mostrarElHome() {
        return "home";
    } 
}

