package com.crm.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Consulta;
import com.crm.crm.entity.Usuario;



public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
    public List<Consulta> findByStatus(String status);
    public List<Consulta> findByUsuario(Usuario usuario);
    
}
