package com.example.ef202301funda.service;

import com.example.ef202301funda.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UsuarioService {

    @Autowired
    private RestTemplate restTemplate;

    public Usuario getUsuario(String id) {
        String url = "http://192.168.18.15/api/v1/usuarios/" + id;
        Usuario[] usuarios = restTemplate.getForObject(url, Usuario[].class);
        return usuarios != null && usuarios.length > 0 ? usuarios[0] : null;
    }
}
