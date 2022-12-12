package com.crm.crm.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
public class OrcamentoService {
    ProcedimentoRepository procedimentoRepository;
    OrcamentoRepository orcamentoRepository;
    MedicoRepository medicoRepository;

    public Orcamento cadastrarOcarmento(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public List<Orcamento> findAllOrcamento() {
        return orcamentoRepository.findAll();
    }

    public Orcamento findOrcamentoById(Long id) {
        return orcamentoRepository.findById(id).orElseThrow();
    }

    public Orcamento adicionarProcedimento(Long idProcedimento, Long idOrcamento) {
        Optional<Procedimento> procedimentoTemp = procedimentoRepository.findById(idOrcamento);
        Optional<Orcamento> orcamentoTemp = orcamentoRepository.findById(idOrcamento);

        if (procedimentoTemp.isPresent() && orcamentoTemp.isPresent()) {
            Orcamento orcamento = orcamentoTemp.get();
            orcamento.getOrcamento_procedimentos().add(procedimentoTemp.get());
            orcamento.setValotTotal(orcamento.getValotTotal() + procedimentoTemp.get().getValor());
            return orcamentoRepository.save(orcamento);
        }
        return null;
    }

    public Orcamento retirarProcedimento(Long idProcedimento, Long idOrcamento) {
        Optional<Procedimento> procedimentoTemp = procedimentoRepository.findById(idProcedimento);
        Optional<Orcamento> orcamentoTemp = orcamentoRepository.findById(idOrcamento);
        if (procedimentoTemp.isPresent() && orcamentoTemp.isPresent()) {
            Orcamento orcamento = orcamentoTemp.get();
            Procedimento procedimento = procedimentoTemp.get();
            orcamento.getOrcamento_procedimentos().remove(procedimento);
            orcamento.setValotTotal(orcamento.getValotTotal() - procedimento.getValor());
            return orcamentoRepository.save(orcamento);
        }
        return null;
    }

    public List<Orcamento> encontrarOrcamentosPorMedico(Long id) {
        Medico medico = medicoRepository.findById(id).get();
        return orcamentoRepository.findByMedico(medico);
    }

    public List<Orcamento> ListarOrcamentosDatasCriadas(LocalDate inicial, LocalDate fim) {
        List<Orcamento> todas = orcamentoRepository.findAll();
        List<Orcamento> encontradas = new ArrayList<>();
        todas.forEach(orcamento -> {
            if (orcamento.getDataCriado().isAfter(inicial) && orcamento.getDataCriado().isBefore(fim)) {
                encontradas.add(orcamento);
            }
        });

        return encontradas;
    }

}