package com.uisrael.proyectoapi.dominio.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pagos")
@Data
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pago_id")
    private Long pagoId;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;

    private Double monto;
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "registrado_por")
    private Usuario registradoPor;
}
