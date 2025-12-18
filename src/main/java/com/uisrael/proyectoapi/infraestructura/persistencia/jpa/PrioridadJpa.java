package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.Prioridad;

public interface PrioridadJpa extends JpaRepository<Prioridad, Integer> {
}
