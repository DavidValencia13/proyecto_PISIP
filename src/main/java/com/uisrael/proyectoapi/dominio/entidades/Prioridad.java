package com.uisrael.proyectoapi.dominio.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "prioridades")
@Data
public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prioridad_id")
    private Integer prioridadId;

    private String nombre;
}
