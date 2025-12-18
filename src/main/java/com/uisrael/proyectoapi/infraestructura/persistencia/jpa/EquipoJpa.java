package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.Equipo;

public interface EquipoJpa extends JpaRepository<Equipo, Long> {
}
