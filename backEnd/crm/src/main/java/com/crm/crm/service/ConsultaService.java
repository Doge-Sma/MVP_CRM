package com.crm.crm.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.crm.crm.entity.Consulta;
import com.crm.crm.entity.Usuario;
import com.crm.crm.repository.ConsultaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConsultaService {
    ConsultaRepository consultaRepository;
    UsuarioService usuarioService;

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

    public Long consultasTotal(){
        return (long) consultaRepository.findAll().size();
    }

    public Consulta alterarStatusConsulta(Long id, String status){
        Consulta consulta = consultaRepository.findById(id).get();
        consulta.setStatus(status);
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultasPorStatus(String status){
        return consultaRepository.findByStatus(status);
    }

    public List<Consulta> listarConsultasPorUsuario(Long id){
        Usuario usuario = usuarioService.findUsuarioById(id);
        return consultaRepository.findByUsuario(usuario);
    }


    public List<Consulta> ListarDatasMarcadas(LocalDate inicial, LocalDate fim){
        List<Consulta> todas = findallConsultas();
        List<Consulta> encontradas = new ArrayList<>();
        todas.forEach(consulta ->{
            if(consulta.getDataMarcada().isAfter(inicial) && consulta.getDataMarcada().isBefore(fim)){
                encontradas.add(consulta);
            }
        });

        return encontradas;
    }

    public List<Consulta> ListarDatasCriadas(LocalDate inicial, LocalDate fim){
        List<Consulta> todas = findallConsultas();
        List<Consulta> encontradas = new ArrayList<>();
        todas.forEach(consulta ->{
            if(consulta.getDataCriada().isAfter(inicial) && consulta.getDataCriada().isBefore(fim)){
                encontradas.add(consulta);
            }
        });
        return encontradas;
    }


}
