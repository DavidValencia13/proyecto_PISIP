package com.uisrael.proyectoapi.aplicacion.casosuso.entrada;

import java.util.List;
import com.uisrael.proyectoapi.dominio.entidades.Orden;

public interface IListarOrdenesUseCase {
    List<Orden> listarOrdenes();
}
