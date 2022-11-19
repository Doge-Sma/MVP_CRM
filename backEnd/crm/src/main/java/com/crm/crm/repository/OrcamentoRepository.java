package com.crm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {
    
}
