package com.crm.crm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.load.Load;
import com.crm.crm.service.OrcamentoService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/load")
@AllArgsConstructor
public class LoadController {
    Load load;
    OrcamentoService orcamentoService;

    @GetMapping("/dados")
    public void carregar(){
        load.carregarDados();
    }

    @GetMapping("/orcamento/debito")
    public void carregarOrcamentoDebito(){
        load.carregarOrcamentoDebito();
    }

    
    @GetMapping("/orcamento/credito")
    public void carregarOrcamentoCredito(){
        load.carregarOrcamentoCredito();
    }

    
    @GetMapping("/orcamento/dinheiro")
    public void carregarOrcamentoDinheiro(){
        load.carregarOrcamentoDinheiro();
    }

    @GetMapping("/consultas")
    public void carregarOrcamentoConsultaSemOrcamento(){
        load.carregarConsultasSemOrcamento();
    }

    
    @GetMapping("/consultas/orcamento")
    public void carregarOrcamentoConsultaComOrcamento(){
        load.carregarConsultaComOrcamento();
    }

    @GetMapping("/{id_Procedimento}/{id_Consulta}")
    public void adicionarProcedimento(@PathVariable Long id_Procedimento, @PathVariable Long id_Consulta ){
        orcamentoService.adicionarProcedimento(id_Procedimento, id_Consulta);
    }
    
}
