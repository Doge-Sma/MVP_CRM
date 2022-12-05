package com.crm.crm.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.crm.crm.entity.Usuario;
import com.crm.crm.repository.UsuarioRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAllUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario findUsuarioById(Long id){
        return usuarioRepository.findById(id).orElseThrow(() -> 
        new ResponseStatusException(HttpStatus.BAD_REQUEST,"Este usuario não existe"));
    }

    


}
