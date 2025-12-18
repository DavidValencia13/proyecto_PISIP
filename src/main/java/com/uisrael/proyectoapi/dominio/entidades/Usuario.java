package com.uisrael.proyectoapi.dominio.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;

    private String usuario;
    private String nombre;
    private String rol;
    private String correo;
    private String telefono;
    private Boolean activo;
}
