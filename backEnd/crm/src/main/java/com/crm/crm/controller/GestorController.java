package com.crm.crm.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.dto.MedicoDTO;
import com.crm.crm.dto.OrcamentoDTO;
import com.crm.crm.dto.ProcedimentoDTO;
import com.crm.crm.dto.UsuarioDTO;
import com.crm.crm.entity.Medico;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.entity.Procedimento;
import com.crm.crm.entity.Usuario;
import com.crm.crm.service.GestorService;
import com.crm.crm.service.OrcamentoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;


@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/gestor")
public class GestorController {
        ModelMapper modelMapper;
        GestorService gestorService;
        OrcamentoService orcamentoService;

    @GetMapping("/medicos")
    public List<MedicoDTO> findallMedicos(){
        return convertListMedicoDTO(gestorService.findAllMedicos());
    }

    @GetMapping("/medicos/{id}")
    public MedicoDTO findMedicoById(@PathVariable Long id){
        return convertMedicoDTO(gestorService.findMedicoById(id));
    }

    @PostMapping
    public MedicoDTO cadastrarMedico(@RequestBody MedicoDTO medicoDTO){
        Medico medico = convertMedicoEntity(medicoDTO);
        Medico salvo = gestorService.cadastrarMedico(medico);
        return convertMedicoDTO(salvo);
    }

    @GetMapping("/procedimentos")
    public List<ProcedimentoDTO> findallProcedimentos(){
        return convertListProcedimentoDTO(gestorService.findAllProcedimento());
    }

    @GetMapping("/procedimentos/{id}")
    public ProcedimentoDTO findProcedimentoById(@PathVariable Long id){
        return convertProcedimentoDTO(gestorService.findProcedimentoById(id));
    }

    @PostMapping("/procedimentos")
    public ProcedimentoDTO cadastrarProcedimento (@RequestBody ProcedimentoDTO procedimentoDTO){
        Procedimento procedimento = convertProcedimentoEntity(procedimentoDTO);
        Procedimento salvo = gestorService.cadastrarProcedimento(procedimento);
        return convertProcedimentoDTO(salvo); 
    }

    @GetMapping("/orcamentos/{id}/procedimentos")
    public List<OrcamentoDTO> listarOrcamentosDoProcedimento(@PathVariable Long id){
        return convertListOrcamentoDTO(gestorService.listarOrcamentosDeProcedimentos(id));
    }

    
    @GetMapping("/orcamentos")
    public List<OrcamentoDTO> findAllOrcamentos(){
        return convertListOrcamentoDTO(orcamentoService.findAllOrcamento());
    }

    @GetMapping("/orcamentos/{id}")
    public OrcamentoDTO findOrcamentoById(@PathVariable Long id){
        return convertOrcamentoDTO(orcamentoService.findOrcamentoById(id));
    }

    @GetMapping("/orcamentos/{id_Orcamento}/procedimento/{id_Procedimento}/adicionar")
    public OrcamentoDTO adicionarProcedimento(@PathVariable Long id_Orcamento, @PathVariable Long id_Procedimento){
        return convertOrcamentoDTO(orcamentoService.adicionarProcedimento(id_Procedimento, id_Orcamento));
    }


    @GetMapping("/orcamentos/{id_Orcamento}/procedimento/{id_Procedimento}/remover")
    public OrcamentoDTO removerProcedimento(@PathVariable Long id_Orcamento, @PathVariable Long id_Procedimento){
        return convertOrcamentoDTO(orcamentoService.retirarProcedimento(id_Procedimento, id_Orcamento));
    }


    @GetMapping("/orcamentos/medicos/{id}")
    public List<OrcamentoDTO> listarOrcamentosPorMedico(@PathVariable Long id){
        return convertListOrcamentoDTO(orcamentoService.encontrarOrcamentosPorMedico(id));
    }

    @GetMapping("/datasCriadas/inicio/{diaInicial}/{mesInicial}/{anoInicial}/fim/{diaFinal}/{mesFinal}/{anoFinal}")
    public List<OrcamentoDTO> buscarOrcamentosPorDataCriadas(@PathVariable int diaInicial,@PathVariable int mesInicial, @PathVariable int anoInicial
    ,@PathVariable int diaFinal, @PathVariable int mesFinal, @PathVariable int anoFinal){
        LocalDate inicial = LocalDate.of(anoInicial, mesInicial, diaInicial);
        LocalDate fim = LocalDate.of(anoFinal, mesFinal, diaFinal);
        return convertListOrcamentoDTO(orcamentoService.ListarOrcamentosDatasCriadas(inicial, fim));
    }

    @PostMapping("/orcamentos")
    public OrcamentoDTO cadastrarOrcamento(@RequestBody OrcamentoDTO orcamentoDTO){
        Orcamento orcamento = convertOrcamentoEntity(orcamentoDTO);
        orcamento.setDataCriado(LocalDate.now());
        Orcamento salvo = orcamentoService.cadastrarOcarmento(orcamento);
        return convertOrcamentoDTO(salvo);
    }


    public UsuarioDTO convertDTO(Usuario usuario){
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public List<UsuarioDTO> convertListDTO(List<Usuario> usuarios){
        List<UsuarioDTO> save = new ArrayList<>();
        usuarios.forEach(usuario ->{
            save.add(convertDTO(usuario));
        });

        return save;
    }

    public List<ProcedimentoDTO> convertListProcedimentoDTO(List<Procedimento> procedimentos){
        List<ProcedimentoDTO> save = new ArrayList<>();
        procedimentos.forEach(procedimento ->{
            save.add(convertProcedimentoDTO(procedimento));
        });
        return save;
    }

    public ProcedimentoDTO convertProcedimentoDTO(Procedimento procedimento){
        return modelMapper.map(procedimento, ProcedimentoDTO.class);
    }

    public Procedimento convertProcedimentoEntity(ProcedimentoDTO procedimentoDTO){    
        return modelMapper.map(procedimentoDTO, Procedimento.class);
    }

    public List<MedicoDTO> convertListMedicoDTO(List<Medico> medicos){
        List<MedicoDTO> save = new ArrayList<>();
        medicos.forEach(medico ->{
            save.add(convertMedicoDTO(medico));
        });
        return save;
    }

    public MedicoDTO convertMedicoDTO(Medico medico){
        return modelMapper.map(medico, MedicoDTO.class);
    }

    public Medico convertMedicoEntity(MedicoDTO medicoDTO){    
        return modelMapper.map(medicoDTO, Medico.class);
    }


    public List<OrcamentoDTO> convertListOrcamentoDTO(List<Orcamento> orcamentos){
        List<OrcamentoDTO> save = new ArrayList<>();
        orcamentos.forEach(orcamento ->{
            save.add(convertOrcamentoDTO(orcamento));
        });
        return save;
    }

    public OrcamentoDTO convertOrcamentoDTO(Orcamento orcamento){
        return modelMapper.map(orcamento, OrcamentoDTO.class);
    }

    public Orcamento convertOrcamentoEntity(OrcamentoDTO orcamentoDTO){    
        return modelMapper.map(orcamentoDTO, Orcamento.class);
    }


    


}
