package com.alter.streaming.repository;

import com.alter.streaming.model.Contenido;
import com.alter.streaming.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface generoRepository extends JpaRepository<Genero,Integer> {
}
