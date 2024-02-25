package com.alter.streaming.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "tipo",nullable = false)
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "id_genero", nullable = false)
    private Genero genero ;

    @Column(name= "puntuaciones", nullable = false)
    private int puntuaciones;

    @Column(name="visualizaciones", nullable = false)
    private int visualizaciones;

}
