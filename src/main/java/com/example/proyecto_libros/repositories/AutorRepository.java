package com.example.proyecto_libros.repositories;

import com.example.proyecto_libros.models.AutorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AutorRepository extends CrudRepository<AutorModel, Integer> {

    public abstract ArrayList<AutorModel> findByNombre(String nombre);
    public abstract ArrayList<AutorModel> findByNombre();
}
