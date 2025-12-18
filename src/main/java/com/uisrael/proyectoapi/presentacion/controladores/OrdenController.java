package com.uisrael.proyectoapi.presentacion.controladores;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.uisrael.proyectoapi.dominio.entidades.Orden;
import com.uisrael.proyectoapi.infraestructura.persistencia.jpa.OrdenJpa;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenController {

    private final OrdenJpa ordenJpa;

    public OrdenController(OrdenJpa ordenJpa) {
        this.ordenJpa = ordenJpa;
    }

    @GetMapping
    public List<Orden> listar() {
        return ordenJpa.findAll();
    }

    @PostMapping
    public Orden crear(@RequestBody Orden orden) {
        return ordenJpa.save(orden);
    }
}
