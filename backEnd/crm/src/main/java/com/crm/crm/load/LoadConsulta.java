package com.crm.crm.load;

import java.time.LocalDate;
import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.crm.crm.dto.ConsultaDTO;
import com.crm.crm.dto.OrcamentoDTO;
import com.crm.crm.entity.Consulta;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.repository.ConsultaRepository;
import com.crm.crm.repository.OrcamentoRepository;
import com.crm.crm.service.OrcamentoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoadConsulta {

    ModelMapper modelMapper;
    ConsultaRepository consultaRepository;
    OrcamentoRepository orcamentoRepository;
    OrcamentoService orcamentoService;


    public void carregarOrcamentoCredito(){
        Random gerador = new Random();

        OrcamentoDTO orcamentoDTO1 = new OrcamentoDTO();
        orcamentoDTO1.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO1.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO1.setPagamento("Crédito");
        orcamentoDTO1.setStatus("Agendada");
        Orcamento orcamento1 = convertOrcamentoEntity(orcamentoDTO1);
        orcamento1.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento1 = orcamentoRepository.save(orcamento1);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());

        OrcamentoDTO orcamentoDTO2 = new OrcamentoDTO();
        orcamentoDTO2.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO2.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO2.setPagamento("Crédito");
        orcamentoDTO2.setStatus("Realizada");
        Orcamento orcamento2 = convertOrcamentoEntity(orcamentoDTO2);
        orcamento2.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento2 = orcamentoRepository.save(orcamento2);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());

        OrcamentoDTO orcamentoDTO3 = new OrcamentoDTO();
        orcamentoDTO3.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO3.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO3.setPagamento("Crédito");
        orcamentoDTO3.setStatus("Realizada");
        Orcamento orcamento3 = convertOrcamentoEntity(orcamentoDTO3);
        orcamento3.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento3 = orcamentoRepository.save(orcamento3);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());

        OrcamentoDTO orcamentoDTO4 = new OrcamentoDTO();
        orcamentoDTO4.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO4.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO4.setPagamento("Crédito");
        orcamentoDTO4.setStatus("Realizada");
        Orcamento orcamento4 = convertOrcamentoEntity(orcamentoDTO4);
        orcamento4.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento4 = orcamentoRepository.save(orcamento4);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());

        OrcamentoDTO orcamentoDTO5 = new OrcamentoDTO();
        orcamentoDTO5.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO5.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO5.setPagamento("Crédito");
        orcamentoDTO5.setStatus("Realizada");
        Orcamento orcamento5 = convertOrcamentoEntity(orcamentoDTO5);
        orcamento5.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento5 = orcamentoRepository.save(orcamento5);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());

        OrcamentoDTO orcamentoDTO6 = new OrcamentoDTO();
        orcamentoDTO6.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO6.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO6.setPagamento("Crédito");
        orcamentoDTO6.setStatus("Cancelada");
        Orcamento orcamento6 = convertOrcamentoEntity(orcamentoDTO6);
        orcamento6.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento6 = orcamentoRepository.save(orcamento6);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());

        OrcamentoDTO orcamentoDTO7 = new OrcamentoDTO();
        orcamentoDTO7.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO7.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO7.setPagamento("Crédito");
        orcamentoDTO7.setStatus("Cancelada");
        Orcamento orcamento7 = convertOrcamentoEntity(orcamentoDTO7);
        orcamento7.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento7 = orcamentoRepository.save(orcamento7);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());

        OrcamentoDTO orcamentoDTO8 = new OrcamentoDTO();
        orcamentoDTO8.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO8.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO8.setPagamento("Crédito");
        orcamentoDTO8.setStatus("Agendada");
        Orcamento orcamento8 = convertOrcamentoEntity(orcamentoDTO8);
        orcamento8.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento8 = orcamentoRepository.save(orcamento8);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());

    }

    public void carregarOrcamentoDebito(){
        Random gerador = new Random();

        OrcamentoDTO orcamentoDTO1 = new OrcamentoDTO();
        orcamentoDTO1.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO1.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO1.setPagamento("Debito");
        orcamentoDTO1.setStatus("Agendada");
        Orcamento orcamento1 = convertOrcamentoEntity(orcamentoDTO1);
        orcamento1.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento1 = orcamentoRepository.save(orcamento1);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());

        OrcamentoDTO orcamentoDTO2 = new OrcamentoDTO();
        orcamentoDTO2.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO2.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO2.setPagamento("Debito");
        orcamentoDTO2.setStatus("Realizada");
        Orcamento orcamento2 = convertOrcamentoEntity(orcamentoDTO2);
        orcamento2.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento2 = orcamentoRepository.save(orcamento2);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());

        OrcamentoDTO orcamentoDTO3 = new OrcamentoDTO();
        orcamentoDTO3.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO3.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO3.setPagamento("Debito");
        orcamentoDTO3.setStatus("Realizada");
        Orcamento orcamento3 = convertOrcamentoEntity(orcamentoDTO3);
        orcamento3.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento3 = orcamentoRepository.save(orcamento3);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());

        OrcamentoDTO orcamentoDTO4 = new OrcamentoDTO();
        orcamentoDTO4.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO4.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO4.setPagamento("Debito");
        orcamentoDTO4.setStatus("Realizada");
        Orcamento orcamento4 = convertOrcamentoEntity(orcamentoDTO4);
        orcamento4.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento4 = orcamentoRepository.save(orcamento4);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());

        OrcamentoDTO orcamentoDTO5 = new OrcamentoDTO();
        orcamentoDTO5.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO5.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO5.setPagamento("Debito");
        orcamentoDTO5.setStatus("Realizada");
        Orcamento orcamento5 = convertOrcamentoEntity(orcamentoDTO5);
        orcamento5.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento5 = orcamentoRepository.save(orcamento5);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());

        OrcamentoDTO orcamentoDTO6 = new OrcamentoDTO();
        orcamentoDTO6.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO6.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO6.setPagamento("Debito");
        orcamentoDTO6.setStatus("Cancelada");
        Orcamento orcamento6 = convertOrcamentoEntity(orcamentoDTO6);
        orcamento6.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento6 = orcamentoRepository.save(orcamento6);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());

        OrcamentoDTO orcamentoDTO7 = new OrcamentoDTO();
        orcamentoDTO7.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO7.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO7.setPagamento("Debito");
        orcamentoDTO7.setStatus("Cancelada");
        Orcamento orcamento7 = convertOrcamentoEntity(orcamentoDTO7);
        orcamento7.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento7 = orcamentoRepository.save(orcamento7);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());

        OrcamentoDTO orcamentoDTO8 = new OrcamentoDTO();
        orcamentoDTO8.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO8.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO8.setPagamento("Debito");
        orcamentoDTO8.setStatus("Agendada");
        Orcamento orcamento8 = convertOrcamentoEntity(orcamentoDTO8);
        orcamento8.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento8 = orcamentoRepository.save(orcamento8);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());

    }

    public void carregarOrcamentoDinheiro(){
        Random gerador = new Random();

        OrcamentoDTO orcamentoDTO1 = new OrcamentoDTO();
        orcamentoDTO1.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO1.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO1.setPagamento("Dinheiro");
        orcamentoDTO1.setStatus("Agendada");
        Orcamento orcamento1 = convertOrcamentoEntity(orcamentoDTO1);
        orcamento1.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento1 = orcamentoRepository.save(orcamento1);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento1.getId());

        OrcamentoDTO orcamentoDTO2 = new OrcamentoDTO();
        orcamentoDTO2.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO2.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO2.setPagamento("Dinheiro");
        orcamentoDTO2.setStatus("Realizada");
        Orcamento orcamento2 = convertOrcamentoEntity(orcamentoDTO2);
        orcamento2.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento2 = orcamentoRepository.save(orcamento2);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento2.getId());

        OrcamentoDTO orcamentoDTO3 = new OrcamentoDTO();
        orcamentoDTO3.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO3.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO3.setPagamento("Dinheiro");
        orcamentoDTO3.setStatus("Realizada");
        Orcamento orcamento3 = convertOrcamentoEntity(orcamentoDTO3);
        orcamento3.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento3 = orcamentoRepository.save(orcamento3);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento3.getId());

        OrcamentoDTO orcamentoDTO4 = new OrcamentoDTO();
        orcamentoDTO4.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO4.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO4.setPagamento("Dinheiro");
        orcamentoDTO4.setStatus("Realizada");
        Orcamento orcamento4 = convertOrcamentoEntity(orcamentoDTO4);
        orcamento4.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento4 = orcamentoRepository.save(orcamento4);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento4.getId());

        OrcamentoDTO orcamentoDTO5 = new OrcamentoDTO();
        orcamentoDTO5.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO5.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO5.setPagamento("Dinheiro");
        orcamentoDTO5.setStatus("Realizada");
        Orcamento orcamento5 = convertOrcamentoEntity(orcamentoDTO5);
        orcamento5.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento5 = orcamentoRepository.save(orcamento5);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento5.getId());

        OrcamentoDTO orcamentoDTO6 = new OrcamentoDTO();
        orcamentoDTO6.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO6.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO6.setPagamento("Dinheiro");
        orcamentoDTO6.setStatus("Cancelada");
        Orcamento orcamento6 = convertOrcamentoEntity(orcamentoDTO6);
        orcamento6.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento6 = orcamentoRepository.save(orcamento6);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento6.getId());

        OrcamentoDTO orcamentoDTO7 = new OrcamentoDTO();
        orcamentoDTO7.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO7.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO7.setPagamento("Dinheiro");
        orcamentoDTO7.setStatus("Cancelada");
        Orcamento orcamento7 = convertOrcamentoEntity(orcamentoDTO7);
        orcamento7.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento7 = orcamentoRepository.save(orcamento7);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento7.getId());

        OrcamentoDTO orcamentoDTO8 = new OrcamentoDTO();
        orcamentoDTO8.setIdMedico((long) gerador.nextInt(9)+1);
        orcamentoDTO8.setIdUsuario((long) gerador.nextInt(10)+1);
        orcamentoDTO8.setPagamento("Dinheiro");
        orcamentoDTO8.setStatus("Agendada");
        Orcamento orcamento8 = convertOrcamentoEntity(orcamentoDTO8);
        orcamento8.setDataCriado(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        orcamento8 = orcamentoRepository.save(orcamento8);
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());
        orcamentoService.adicionarProcedimento((long) gerador.nextInt(9)+1, orcamento8.getId());
    }

    public void carregarConsultaSemOrcamento(){
        Random gerador = new Random();

        ConsultaDTO consultaDTO1 = new ConsultaDTO();
        consultaDTO1.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO1.setObservacao("Nenhuma");
        consultaDTO1.setStatus("Agendada");
        Consulta consulta1 = convertEntity(consultaDTO1);
        consulta1.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta1.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta1);

        ConsultaDTO consultaDTO2 = new ConsultaDTO();
        consultaDTO2.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO2.setObservacao("Nenhuma");
        consultaDTO2.setStatus("Realizada");
        Consulta consulta2 = convertEntity(consultaDTO2);
        consulta2.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta2.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta2);
        
        ConsultaDTO consultaDTO3 = new ConsultaDTO();
        consultaDTO3.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO3.setObservacao("Nenhuma");
        consultaDTO3.setStatus("Cancelada");
        Consulta consulta3 = convertEntity(consultaDTO3);
        consulta3.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta3.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta3);

    }

    public void carregarConsultaComOrcamento(){
        Random gerador = new Random();

        ConsultaDTO consultaDTO1 = new ConsultaDTO();
        consultaDTO1.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO1.setObservacao("Nenhuma");
        consultaDTO1.setStatus("Agendada");
        consultaDTO1.setIdOrcamento((long) gerador.nextInt(20)+1);
        Consulta consulta1 = convertEntity(consultaDTO1);
        consulta1.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta1.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta1);

        ConsultaDTO consultaDTO2 = new ConsultaDTO();
        consultaDTO2.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO2.setObservacao("Nenhuma");
        consultaDTO2.setStatus("Realizada");
        consultaDTO2.setIdOrcamento((long) gerador.nextInt(20)+1);
        Consulta consulta2 = convertEntity(consultaDTO2);
        consulta2.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta2.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta2);
        
        ConsultaDTO consultaDTO3 = new ConsultaDTO();
        consultaDTO3.setIdUsuario((long) gerador.nextInt(10)+1);
        consultaDTO3.setObservacao("Nenhuma");
        consultaDTO3.setStatus("Cancelada");
        consultaDTO3.setIdOrcamento((long) gerador.nextInt(20)+1);
        Consulta consulta3 = convertEntity(consultaDTO3);
        consulta3.setDataCriada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consulta3.setDataMarcada(LocalDate.of(2021, gerador.nextInt(12)+1, gerador.nextInt(27)+1));
        consultaRepository.save(consulta3);

    }

    public Consulta convertEntity(ConsultaDTO consultaDTO){
        Consulta consulta = modelMapper.map(consultaDTO, Consulta.class);
        return consulta;
    }

    public Orcamento convertOrcamentoEntity(OrcamentoDTO orcamentoDTO){    
        return modelMapper.map(orcamentoDTO, Orcamento.class);
    }
}
