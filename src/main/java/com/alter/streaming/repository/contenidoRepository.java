package com.alter.streaming.repository;

import com.alter.streaming.model.Contenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface contenidoRepository extends JpaRepository <Contenido,Integer> {

    @Query(value = "SELECT * FROM contenido ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Contenido findRandomMovie();
    List<Contenido> findAllByOrderByNombre();
    List<Contenido> findAllByOrderByTipo();
    List<Contenido> findByGeneroId(int idGenero);

    List<Contenido> findAll();

    Contenido findById(int id);




}
