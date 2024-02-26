package com.alter.streaming.service.impl;

import com.alter.streaming.model.Contenido;
import com.alter.streaming.repository.contenidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenidoService {
    private final contenidoRepository contenidoRepository;

    public ContenidoService(com.alter.streaming.repository.contenidoRepository contenidoRepository) {
        this.contenidoRepository = contenidoRepository;
    }


    public Contenido getRandomMovie() {
        return contenidoRepository.findRandomMovie();
    }
    public List<Contenido> getContenidoByName() {
        return contenidoRepository.findAllByOrderByNombre();
    }

    public List<Contenido> getMoviesByType()  {
        return contenidoRepository.findAllByOrderByTipo();
    }

    public List<Contenido> listarTodoContenido() {
        return contenidoRepository.findAll();
    }

    public Contenido saveContenido(Contenido contenido) {
        return contenidoRepository.save(contenido);
    }

    public Contenido findById(int id) {
        return contenidoRepository.findById(id);
    }


}
