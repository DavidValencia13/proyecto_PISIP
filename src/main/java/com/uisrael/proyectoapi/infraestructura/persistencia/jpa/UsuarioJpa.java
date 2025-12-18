package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.Usuario;

public interface UsuarioJpa extends JpaRepository<Usuario, Long> {
}
