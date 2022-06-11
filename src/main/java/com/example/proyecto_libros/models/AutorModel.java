package com.example.proyecto_libros.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "Nombre", length = 15, nullable = false)
    private String nombre;

    @Column(name = "Apellido", length = 15, nullable = false)
    private String apellido;

    @Column(name = "Correo", length = 40, nullable = false)
    private String correo;

    @OneToMany(mappedBy = "autorModel", cascade = CascadeType.ALL)
    private List<LibroModel> libroModels;


}
