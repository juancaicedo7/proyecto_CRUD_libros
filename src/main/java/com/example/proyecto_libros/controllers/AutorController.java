package com.example.proyecto_libros.controllers;


import com.example.proyecto_libros.models.AutorModel;
import com.example.proyecto_libros.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping()
    public ArrayList<AutorModel> obtenerTodosLosAutores(){
        return autorService.obtenerAutores();
    }

    @PostMapping()
    public AutorModel guardarAutores(@RequestBody AutorModel autor){
        return this.autorService.guardarAutor(autor);
    }

    @GetMapping(path = "/{id}")
    public Optional<AutorModel> obtenerPorId(@PathVariable ("id") Integer id){
        return this.autorService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<AutorModel> obtenerAutorPorNombre(@RequestParam ("nombre") String nombre){
        return this.autorService.obtenerPorNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable ("id") Integer id){
        boolean ok = this.autorService.eliminarAutor(id);

        if(ok){
            return "Se elimino el autor con id " + id;
        }else {
            return "No se elimino el autor con id " + id;
        }
    }

}
