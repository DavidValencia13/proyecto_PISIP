package com.uisrael.proyectoapi.dominio.entidades;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenes")
@Data
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_id")
    private Long ordenId;

    @Column(name = "codigo_orden")
    private String codigoOrden;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "prioridad_id")
    private Prioridad prioridad;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private EstadoOrden estado;

    @ManyToOne
    @JoinColumn(name = "tecnico_asignado")
    private Usuario tecnico;

    private String detalleProblema;
    private String observaciones;
    private Double totalCobro;
    private Boolean pagado;
    
    @Column(name = "creado_en")
    private LocalDateTime creadoEn;
}
