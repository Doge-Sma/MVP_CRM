package com.crm.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Medico;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.entity.Procedimento;
import com.crm.crm.repository.MedicoRepository;
import com.crm.crm.repository.OrcamentoRepository;
import com.crm.crm.repository.ProcedimentoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GestorService {
    
    MedicoRepository medicoRepository;
    OrcamentoRepository orcamentoRepository;
    ProcedimentoRepository procedimentoRepository;

    public Medico cadastrarMedico (Medico medico){
        return medicoRepository.save(medico);
    }

    public Orcamento cadastrarOcarmento (Orcamento orcamento){
        return orcamentoRepository.save(orcamento);
    }

    public Procedimento cadastrarProcedimento(Procedimento procedimento){
        return procedimentoRepository.save(procedimento);
    }

    public List<Medico> findAllMedicos(){
        return medicoRepository.findAll();
    }

    public List<Orcamento> findAllOrcamento(){
        return orcamentoRepository.findAll();
    }

    public List<Procedimento> findAllProcedimento(){
        return procedimentoRepository.findAll();
    }

    public Medico findMedicoById (Long id){
        return medicoRepository.findById(id).orElseThrow();
    }

    public Orcamento findOrcamentoById(Long id){
        return orcamentoRepository.findById(id).orElseThrow();
    }

    public Procedimento findProcedimentoById(Long id){
        return procedimentoRepository.findById(id).orElseThrow();
    }






}
