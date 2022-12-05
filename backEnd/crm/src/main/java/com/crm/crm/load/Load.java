package com.crm.crm.load;

import org.springframework.stereotype.Service;

import com.crm.crm.entity.Consulta;
import com.crm.crm.entity.Medico;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.entity.Procedimento;
import com.crm.crm.entity.Usuario;
import com.crm.crm.repository.ConsultaRepository;
import com.crm.crm.repository.MedicoRepository;
import com.crm.crm.repository.OrcamentoRepository;
import com.crm.crm.repository.ProcedimentoRepository;
import com.crm.crm.repository.UsuarioRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class Load {
    UsuarioRepository usuarioRepository;
    MedicoRepository medicoRepository;
    ConsultaRepository consultaRepository;
    OrcamentoRepository orcamentoRepository;
    ProcedimentoRepository procedimentoRepository;

    public void carregarUsuarios(){
        Usuario usuario = new Usuario();

        usuario.setCPF("123.123.123-12");
        usuario.setCargo("Cliente");
        usuario.setEmail("usuario@gmail.com");
        usuario.setName("Nome");
        usuario.setSenha("123");
        usuario.setTelefone("(83) 9 1234-1234");

        usuarioRepository.save(usuario);
        
    }

    public void carregarMedico(){
        Medico medico = new Medico();

        medico.setCargo("teste");
        medico.setCrm("123.123.123.123");
        medico.setName("Carlos");

        medicoRepository.save(medico);
    }

    public void carregarConsulta(){
        Consulta consulta = new Consulta();

        consulta.setObservacao("teste");
        consulta.setStatus("Realizado");

        consultaRepository.save(consulta);
    }

    public void carregarProcedimento(){
        Procedimento procedimento = new Procedimento();

        procedimento.setDescricao("teste");
        procedimento.setNome("teste");
        procedimento.setValor((long) 150);
        procedimento.setTipo("Exame");
        
        procedimentoRepository.save(procedimento);

    }

    public void carregarOrcamento(){
        Orcamento orcamento = new Orcamento();

        orcamento.setObservacao("teste");
        orcamento.setPagamento("Cartao");
        orcamento.setValotTotal((long) 200);
        orcamento.setMedico("teste");
        
        orcamentoRepository.save(orcamento);
    }


    public void carregar(){
        carregarConsulta();
        carregarMedico();
        carregarOrcamento();
        carregarProcedimento();
        carregarUsuarios();
    }
}
