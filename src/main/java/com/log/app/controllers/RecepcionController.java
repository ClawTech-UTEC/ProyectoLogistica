package com.log.app.controllers;

import java.util.ArrayList;
import java.util.List;

import com.log.app.constants.Constants;
import com.log.app.entidades.Categoria;
import com.log.app.entidades.Producto;
import com.log.app.entidades.Recepcion;
import com.log.app.entidades.TipoProducto;
import com.log.app.services.Impl.RecepcionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecepcionController {

    @Autowired
    private RecepcionService recepcionService;

    @GetMapping(value = "/crearRecepcion")
    public String crearRecepcion(Model model) {

        // TOOD : traer tipo productos de la base de datos

        model.addAttribute("recepcion", new Recepcion());
        return "crearRecepcion";
    }

    @PostMapping(value = "/agregarProducto")
    public String agregarProducto(Model model, @ModelAttribute Producto producto) {
        model.addAttribute("recepcion", new Recepcion());
        return "crearRecepcion";
    }

    @PostMapping(value = "/crearRecepcion")
    public String confirmarCreacionRecepcion(
            Model model) {
        model.addAttribute("recepcion", new Recepcion());
        return "crearRecepcion";
    }
}
