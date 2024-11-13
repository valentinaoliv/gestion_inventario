package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Producto;
import com.example.demo.services.ProductoService;  // Añadir este import
@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/pp")  // Manejamos las solicitudes GET para "/productos"
    public String getAllProductos(Model model) {
        // Obtén los productos desde el servicio
        List<Producto> productos = productoService.obtenerTodosLosProductos();
    
        // Agrega la lista de productos al modelo
        model.addAttribute("productos", productos);
    
        
        return "productos";  
    }
}
