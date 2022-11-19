package com.CRM.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.crm.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
