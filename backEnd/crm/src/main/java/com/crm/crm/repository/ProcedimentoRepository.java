package com.crm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento,Long> {
    public Procedimento findByNome(String nome);
    
}
