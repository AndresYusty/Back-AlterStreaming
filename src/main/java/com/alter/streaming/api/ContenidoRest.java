package com.alter.streaming.api;

import com.alter.streaming.model.Contenido;
import com.alter.streaming.repository.contenidoRepository;
import com.alter.streaming.service.impl.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contenido")
public class ContenidoRest {
    private final ContenidoService contenidoService;
    @Autowired
    private contenidoRepository contenidorepository;
    public ContenidoRest(ContenidoService contenidoService) {
        this.contenidoService = contenidoService;
    }


    @GetMapping("/random-movie")
    public Contenido getRandomMovie() {
        return contenidoService.getRandomMovie();
    }
    @GetMapping("/nameDes")
    public List<Contenido> getMoviesSortedByName() {
        return contenidoService.getContenidoByName();
    }
    @GetMapping("/type")
    public List<Contenido> getMoviesSortedByType() {
        return contenidoService.getMoviesByType();
    }

    @GetMapping("/contenido-genero")
    public List<Contenido> getPeliculasPorGenero(@RequestParam int idGenero) {
        return contenidorepository.findByGeneroId(idGenero);
    }

    @GetMapping("")
    public List<Contenido> listarTodoContenido() {
        return contenidoService.listarTodoContenido();
    }


}
