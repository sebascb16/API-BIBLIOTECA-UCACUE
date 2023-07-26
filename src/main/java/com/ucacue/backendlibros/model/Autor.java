package com.ucacue.backendlibros.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String telefono;
    private String celular;


    @JsonBackReference
    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;


}
