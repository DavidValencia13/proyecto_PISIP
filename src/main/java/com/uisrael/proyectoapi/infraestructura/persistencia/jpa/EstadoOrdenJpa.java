package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.EstadoOrden;

public interface EstadoOrdenJpa extends JpaRepository<EstadoOrden, Integer> {
}
