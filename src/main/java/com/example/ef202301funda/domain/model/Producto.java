package com.example.ef202301funda.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private String caracteristicas;
    private String precio;
    private String claves;
    private String url;
    private String categoria;
    private String subcategoria;
}
