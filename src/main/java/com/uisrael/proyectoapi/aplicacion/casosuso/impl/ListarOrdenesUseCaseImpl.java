package com.uisrael.proyectoapi.aplicacion.casosuso.impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.uisrael.proyectoapi.aplicacion.casosuso.entrada.IListarOrdenesUseCase;
import com.uisrael.proyectoapi.dominio.entidades.Orden;
import com.uisrael.proyectoapi.infraestructura.persistencia.jpa.OrdenJpa;

@Service
public class ListarOrdenesUseCaseImpl implements IListarOrdenesUseCase {

    private final OrdenJpa ordenJpa;

    public ListarOrdenesUseCaseImpl(OrdenJpa ordenJpa) {
        this.ordenJpa = ordenJpa;
    }

    @Override
    public List<Orden> listarOrdenes() {
        return ordenJpa.findAll();
    }
}
