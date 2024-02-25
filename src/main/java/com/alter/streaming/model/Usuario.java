package com.alter.streaming.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contenido")
public class Usuario {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private int id;

        @Column(name = "username",nullable = false)
        private String username;

        @Column(name = "clave",nullable = false)
        private String clave;

        @Column(name = "activo",nullable = false)
        private Boolean  activo;

        @Column(name = "rol",nullable = false)
        private String rol;


}
