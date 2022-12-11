package com.crm.crm.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Medico;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.entity.Procedimento;
import com.crm.crm.entity.Usuario;
import com.crm.crm.repository.MedicoRepository;
import com.crm.crm.repository.ProcedimentoRepository;
import com.crm.crm.repository.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GestorService {
    
    MedicoRepository medicoRepository;
    ProcedimentoRepository procedimentoRepository;
    UsuarioRepository usuarioRepository;

    public Medico cadastrarMedico (Medico medico){
        return medicoRepository.save(medico);
    }

    public Procedimento cadastrarProcedimento(Procedimento procedimento){
        return procedimentoRepository.save(procedimento);
    }

    public List<Medico> findAllMedicos(){
        return medicoRepository.findAll();
    }

    public List<Procedimento> findAllProcedimento(){
        return procedimentoRepository.findAll();
    }

    public Medico findMedicoById (Long id){
        return medicoRepository.findById(id).orElseThrow();
    }


    public Procedimento findProcedimentoById(Long id){
        return procedimentoRepository.findById(id).orElseThrow();
    }

    public List<Orcamento> listarOrcamentosDeProcedimentos(Long id){
        return (List<Orcamento>) procedimentoRepository.findById(id).get().getOrcamentos();
    }


    public List<Usuario> ListarUsuariosDatasCriadas(LocalDate inicial, LocalDate fim){
        List<Usuario> todas = usuarioRepository.findAll();
        List<Usuario> encontradas = new ArrayList<>();
        todas.forEach(usuario ->{
            if(usuario.getDataCriada().isAfter(inicial) && usuario.getDataCriada().isBefore(fim)){
                encontradas.add(usuario);
            }
        });

        return encontradas;
    }
}