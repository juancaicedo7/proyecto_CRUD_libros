package com.example.proyecto_libros.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "libros")
public class LibroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "Nombre",length = 60, nullable = false)
    private String nombreLibro;

    @Column(name = "Paginas", nullable = false)
    private int numeroPaginas;

    @Column(name = "Edición", nullable = false)
    private int edicion;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_autor", nullable = false)
    private AutorModel autorModel;
}
