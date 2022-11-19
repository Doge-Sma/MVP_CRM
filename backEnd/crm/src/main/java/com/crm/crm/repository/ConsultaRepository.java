package com.crm.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {

    public List<Consulta> findByIdUsuario(Long idUsuario);
    public List<Consulta> findByIdMedico(Long idMedico);
    
}
