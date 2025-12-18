package com.uisrael.proyectoapi.aplicacion.casosuso.impl;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

import com.uisrael.proyectoapi.aplicacion.casosuso.entrada.ICrearOrdenUseCase;
import com.uisrael.proyectoapi.dominio.entidades.Orden;
import com.uisrael.proyectoapi.infraestructura.persistencia.jpa.OrdenJpa;

@Service
public class CrearOrdenUseCaseImpl implements ICrearOrdenUseCase {

    private final OrdenJpa ordenJpa;

    public CrearOrdenUseCaseImpl(OrdenJpa ordenJpa) {
        this.ordenJpa = ordenJpa;
    }

    @Override
    public Orden crearOrden(Orden orden) {
        orden.setCreadoEn(LocalDateTime.now());
        orden.setPagado(false);
        return ordenJpa.save(orden);
    }
}
