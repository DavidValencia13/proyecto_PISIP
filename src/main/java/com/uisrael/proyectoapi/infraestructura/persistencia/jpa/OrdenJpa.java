package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.Orden;

public interface OrdenJpa extends JpaRepository<Orden, Long> {
}
