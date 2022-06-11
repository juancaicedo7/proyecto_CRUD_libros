package com.example.proyecto_libros.services;

import com.example.proyecto_libros.models.AutorModel;
import com.example.proyecto_libros.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public ArrayList<AutorModel> obtenerAutores(){
        return (ArrayList<AutorModel>) autorRepository.findAll();
    }

    public AutorModel guardarAutor(AutorModel autor){
        return autorRepository.save(autor);
    }

    public Optional<AutorModel> obtenerPorId(Integer id){
        return autorRepository.findById(id);
    }

    public ArrayList<AutorModel> obtenerPorNombre(String nombre){
        return autorRepository.findByNombre(nombre);
    }

    public boolean eliminarAutor(Integer id){
        try{
            autorRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
