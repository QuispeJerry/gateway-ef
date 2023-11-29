package com.example.ef202301funda.service;

import com.example.ef202301funda.domain.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductoService {

    @Autowired
    private RestTemplate restTemplate;

    public Producto getProductoPorSubcategoria(String subcategoria) {
        String url = "http://192.168.18.15/api/v1/subcategoria/" + subcategoria;
        Producto[] productos = restTemplate.getForObject(url, Producto[].class);
        return productos != null && productos.length > 0 ? productos[0] : null;
    }
}
