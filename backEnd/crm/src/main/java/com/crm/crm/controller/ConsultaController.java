package com.crm.crm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.entity.Consulta;
import com.crm.crm.service.ConsultaService;

import lombok.AllArgsConstructor;


@CrossOrigin("*")
@RestController
@RequestMapping("/consultas")
@AllArgsConstructor
public class ConsultaController {
    
    ConsultaService consultaService;

    @GetMapping
    public List<Consulta> findallConsultas(){
        return consultaService.findallConsultas();
    }

    @GetMapping("/{id}")
    public Consulta findConsultaById(@PathVariable Long id){
        return consultaService.findConsultaById(id);
    }

    // @GetMapping("/quantidade/cliente/{id}")
    // public Long quantdConsultaByCliente(@PathVariable Long id){
    //     return consultaService.quantConsultasByUsuario(id);
    // }

    // @GetMapping("/quantidade/medico/{id}")
    // public Long quantdConsultaBymedico(@PathVariable Long id){
    //     return consultaService.quantConsultasByMedico(id);
    // }

    @GetMapping("/quantidade/total")
    public Long consultaTotal(){
        return consultaService.consultasTotal();
    }

    @PutMapping("/atualizar/{id}")
    public Consulta atualizarStatusConsulta(@PathVariable Long id, @RequestBody String status){
        return consultaService.alterarStatusConsulta(id, status);
    }

    @PostMapping("/salvar")
    public Consulta salvarConsulta(@RequestBody Consulta consulta){
        return consultaService.salvarConsulta(consulta);
    }



    
}
