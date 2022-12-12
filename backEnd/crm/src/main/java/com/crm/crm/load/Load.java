package com.crm.crm.load;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class Load {
    
    LoadMedico loadMedico;
    LoadProcedimentos loadProcedimentos;
    LoadUsuario loadUsuario;
    LoadConsulta loadConsulta;

    public void carregarConsultasSemOrcamento(){
        loadConsulta.carregarConsultaSemOrcamento();
    }

    public void carregarOrcamentoCredito(){
        loadConsulta.carregarOrcamentoCredito();
    }
    public void carregarOrcamentoDebito(){
        loadConsulta.carregarOrcamentoDebito();
    }

    public void carregarOrcamentoDinheiro(){
        loadConsulta.carregarOrcamentoDinheiro();
    }

    public void carregarConsultaComOrcamento(){
        loadConsulta.carregarConsultaComOrcamento();
    }


    public void carregarDados(){
      loadMedico.carregarMedicos();
      loadProcedimentos.carregarProcedimento();
      loadUsuario.carregarUsuarios();
    }
}
