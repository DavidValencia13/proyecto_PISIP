package com.uisrael.proyectoapi.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.proyectoapi.dominio.entidades.Pago;

public interface PagoJpa extends JpaRepository<Pago, Long> {
}
