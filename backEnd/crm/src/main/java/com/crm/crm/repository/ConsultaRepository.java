package com.crm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
    
}
