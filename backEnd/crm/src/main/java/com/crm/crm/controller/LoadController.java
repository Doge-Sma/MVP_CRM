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

    @GetMapping
    public void carregar(){
        load.carregar();
    }

    @GetMapping("/{id_Procedimento}/{id_Consulta}")
    public void adicionarProcedimento(@PathVariable Long id_Procedimento, @PathVariable Long id_Consulta ){
        orcamentoService.adicionarProcedimento(id_Procedimento, id_Consulta);
    }
    
}
