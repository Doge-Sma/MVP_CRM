package com.crm.crm.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.dto.ConsultaDTO;
import com.crm.crm.entity.Consulta;
import com.crm.crm.service.ConsultaService;

import lombok.AllArgsConstructor;



@CrossOrigin("*")
@RestController
@RequestMapping("/consultas")
@AllArgsConstructor
public class ConsultaController {
    
    ConsultaService consultaService;
    ModelMapper modelMapper;

    @GetMapping
    public List<ConsultaDTO> findallConsultas(){
        return convertListDTO(consultaService.findallConsultas());
    }

    @GetMapping("/{id}")
    public ConsultaDTO findConsultaById(@PathVariable Long id){
        return convertDTO(consultaService.findConsultaById(id));
    }

    @GetMapping("/quantidade/total")
    public Long consultaTotal(){
        return consultaService.consultasTotal();
    }

    @PutMapping("/atualizar/{id}")
    public ConsultaDTO atualizarStatusConsulta(@PathVariable Long id, @RequestBody String status){
        return convertDTO(consultaService.alterarStatusConsulta(id, status));
    }

    @PostMapping
    public ConsultaDTO salvarConsulta(@RequestBody ConsultaDTO consultaDTO){
        Consulta consulta = convertEntity(consultaDTO);
        consulta.setDataCriada(LocalDate.now());
        Consulta salvar = consultaService.salvarConsulta(consulta);
        return convertDTO(salvar);
    }

    @GetMapping("/datasMarcadas/inicio/{diaInicial}/{mesInicial}/{anoInicial}/fim/{diaFinal}/{mesFinal}/{anoFinal}")
    public List<ConsultaDTO> buscarConsultasPorDataMarcadas(@PathVariable int diaInicial,@PathVariable int mesInicial, @PathVariable int anoInicial
    ,@PathVariable int diaFinal, @PathVariable int mesFinal, @PathVariable int anoFinal){
        LocalDate inicial = LocalDate.of(anoInicial, mesInicial, diaInicial);
        LocalDate fim = LocalDate.of(anoFinal, mesFinal, diaFinal);
        return convertListDTO(consultaService.ListarDatasMarcadas(inicial, fim));
    }

    @GetMapping("/datasCriadas/inicio/{diaInicial}/{mesInicial}/{anoInicial}/fim/{diaFinal}/{mesFinal}/{anoFinal}")
    public List<ConsultaDTO> buscarConsultasPorDataCriadas(@PathVariable int diaInicial,@PathVariable int mesInicial, @PathVariable int anoInicial
    ,@PathVariable int diaFinal, @PathVariable int mesFinal, @PathVariable int anoFinal){
        LocalDate inicial = LocalDate.of(anoInicial, mesInicial, diaInicial);
        LocalDate fim = LocalDate.of(anoFinal, mesFinal, diaFinal);
        return convertListDTO(consultaService.ListarDatasCriadas(inicial, fim));
    }

    public List<ConsultaDTO> convertListDTO(List<Consulta> consultas){
        List<ConsultaDTO> save = new ArrayList<>();
        consultas.forEach(consulta ->{
            save.add(convertDTO(consulta));
        });

        return save;
    }

    public ConsultaDTO convertDTO(Consulta consulta){
        return modelMapper.map(consulta, ConsultaDTO.class);
    }

    public Consulta convertEntity(ConsultaDTO consultaDTO){
        Consulta consulta = modelMapper.map(consultaDTO, Consulta.class);
        consulta.setDataMarcada(LocalDate.parse(consultaDTO.getDataMarcada()));
        return consulta;
    }

    
}
