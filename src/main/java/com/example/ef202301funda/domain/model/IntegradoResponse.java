package com.example.ef202301funda.domain.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IntegradoResponse {
    private String idUsuario;
    private String nombreUsuario;
    private String idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private String caracteristicasProducto;
    private String precioProducto;
    private String clavesProducto;
    private String urlProducto;
    private String categoriaProducto;
    private String subcategoriaProducto;
}