package com.uisrael.proyectoapi.dominio.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "equipos")
@Data
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipo_id")
    private Long equipoId;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;

    private String tipo;
    private String marca;
    private String modelo;
    private String serial;
    private String estadoEquipo;
    private String observaciones;
}
