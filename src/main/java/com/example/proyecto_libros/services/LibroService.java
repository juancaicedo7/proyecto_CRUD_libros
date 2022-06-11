package com.example.proyecto_libros.services;

import com.example.proyecto_libros.models.AutorModel;
import com.example.proyecto_libros.models.LibroModel;
import com.example.proyecto_libros.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public ArrayList<LibroModel> obtenerTodosLibros(){
        return (ArrayList<LibroModel>) libroRepository.findAll();
    }

    public LibroModel guardarLibro(LibroModel libro){
        return libroRepository.save(libro);
    }

    public Optional<LibroModel> obtenerPorId(Integer id){
        return libroRepository.findById(id);
    }

}
