package com.sesi.ava.service;

import com.sesi.ava.model.Usuario;
import com.sesi.ava.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
