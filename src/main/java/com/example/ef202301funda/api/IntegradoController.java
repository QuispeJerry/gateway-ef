package com.example.ef202301funda.api;

import com.example.ef202301funda.domain.model.IntegradoRequest;
import com.example.ef202301funda.domain.model.IntegradoResponse;  // Asumiendo que esta clase existe
import com.example.ef202301funda.domain.model.Producto;
import com.example.ef202301funda.domain.model.Usuario;
import com.example.ef202301funda.service.ProductoService;
import com.example.ef202301funda.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class IntegradoController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ProductoService productoService;

    @PostMapping("/integrado")
    public ResponseEntity<IntegradoResponse> integrarDatos(@RequestBody IntegradoRequest request) {
        Usuario usuario = usuarioService.getUsuario(request.getCodigo());
        Producto producto = productoService.getProductoPorSubcategoria(request.getSubcategoria());

        IntegradoResponse response = new IntegradoResponse();

        response.setIdUsuario(usuario.getId());
        response.setNombreUsuario(usuario.getNombre());
        response.setCategoriaProducto(producto.getCategoria());
        response.setClavesProducto(producto.getClaves());
        response.setDescripcionProducto(producto.getDescripcion());
        response.setIdProducto(producto.getId());
        response.setNombreProducto(producto.getNombre());
        response.setPrecioProducto(producto.getPrecio());
        response.setSubcategoriaProducto(producto.getSubcategoria());
        response.setUrlProducto(producto.getUrl());

        return ResponseEntity.ok(response);
    }
}