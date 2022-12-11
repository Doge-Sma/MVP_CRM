package com.crm.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm.entity.Medico;
import com.crm.crm.entity.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento,Long> {
    public List<Orcamento> findByMedico(Medico medico);
}
