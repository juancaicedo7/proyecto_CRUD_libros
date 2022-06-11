package com.example.proyecto_libros.controllers;


import com.example.proyecto_libros.models.AutorModel;
import com.example.proyecto_libros.models.LibroModel;
import com.example.proyecto_libros.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping
    public ArrayList<LibroModel> ObtenerTodosLosLibros(){
        return libroService.obtenerTodosLibros();
    }

    @PostMapping
    public LibroModel guardarLibro(@RequestBody LibroModel libro){
        return this.libroService.guardarLibro(libro);
    }

    @GetMapping(path = ("/{id}"))
    public Optional<LibroModel> obtenerPorId(@PathVariable ("id") Integer id){
        return libroService.obtenerPorId(id);
    }
}
