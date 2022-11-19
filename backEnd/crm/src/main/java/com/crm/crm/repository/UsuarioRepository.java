package com.crm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
