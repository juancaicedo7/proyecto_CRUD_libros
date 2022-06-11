package com.example.proyecto_libros.repositories;

import com.example.proyecto_libros.models.LibroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;


@Repository
public interface LibroRepository extends CrudRepository<LibroModel, Integer> {


}
