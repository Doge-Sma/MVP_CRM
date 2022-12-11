package com.crm.crm.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.dto.ConsultaDTO;
import com.crm.crm.dto.OrcamentoDTO;
import com.crm.crm.dto.UsuarioDTO;
import com.crm.crm.entity.Consulta;
import com.crm.crm.entity.Orcamento;
import com.crm.crm.entity.Usuario;
import com.crm.crm.service.UsuarioService;

import lombok.AllArgsConstructor;

@RequestMapping("/usuarios")
@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class UsuarioController {

    UsuarioService usuarioService;
    ModelMapper modelMapper;


    @GetMapping
    public List<UsuarioDTO> listarUsuarios(){
        return convertListDTO(usuarioService.findAllUsuario());
    }
    
    @GetMapping("/{id}")
    public UsuarioDTO BuscarUsuarioPorId(@PathVariable Long id){
        return convertDTO(usuarioService.findUsuarioById(id));
    }

    @GetMapping("/{id}/consultas")
    public List<ConsultaDTO> listarConsultasPorUsuario(@PathVariable Long id){
        return convertListConsultasDTO(usuarioService.listarConsultaPorUSuario(id));
    }

    @GetMapping("/{id}/orcamentos")
    public List<OrcamentoDTO> listarOcarmentosPorUsuario(@PathVariable Long id){
        return convertListOrcamentoDTO(usuarioService.listarOrcamentoPorUsuario(id));
    }

    @PostMapping
    public UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuario = convertEntity(usuarioDTO);
        usuario.setDataCriada(LocalDate.now());
        Usuario salvo = usuarioService.salvar(usuario);
        return convertDTO(salvo);
    }
    
    public List<UsuarioDTO> convertListDTO(List<Usuario> usuarios){
        List<UsuarioDTO> save = new ArrayList<>();
        usuarios.forEach(usuario ->{
            save.add(convertDTO(usuario));
        });

        return save;
    }

    public UsuarioDTO convertDTO(Usuario usuario){
        return modelMapper.map(usuario, UsuarioDTO.class);
    }

    public Usuario convertEntity(UsuarioDTO usuarioDTO){
        return modelMapper.map(usuarioDTO, Usuario.class);
    }

    public List<ConsultaDTO> convertListConsultasDTO(List<Consulta> consultas){
        List<ConsultaDTO> save = new ArrayList<>();
        consultas.forEach(consulta ->{
            save.add(convertConsultaDTO(consulta));
        });

        return save;
    }

    public ConsultaDTO convertConsultaDTO(Consulta consulta){
        return modelMapper.map(consulta, ConsultaDTO.class);
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
    
}
