package com.crm.crm.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.crm.crm.entity.Consulta;
import com.crm.crm.repository.ConsultaRepository;

@Service
public class ConsultaService {
    ConsultaRepository consultaRepository;

    public List<Consulta> findallConsultas(){
        return consultaRepository.findAll();
    }

    public Consulta findConsultaById(Long id){
        return consultaRepository.findById(id).orElseThrow(() ->(
            new ResponseStatusException(HttpStatus.BAD_REQUEST, "Consulta não existe")
        ));
    }

    public Consulta salvarConsulta(Consulta consulta){
        return consultaRepository.save(consulta);
    }

    // public Long quantConsultasByUsuario(Long idUsuario){
    //     return (long) consultaRepository.findByIdUsuario(idUsuario).size();
    // }

    // public Long quantConsultasByMedico(Long idMedico){
    //     return (long) consultaRepository.findByIdMedico(idMedico).size();
    // }

    public Long consultasTotal(){
        return (long) consultaRepository.findAll().size();
    }

    public Consulta alterarStatusConsulta(Long id, String status){
        Consulta consulta = consultaRepository.findById(id).get();
        consulta.setStatus(status);
        return consultaRepository.save(consulta);
    }


}
