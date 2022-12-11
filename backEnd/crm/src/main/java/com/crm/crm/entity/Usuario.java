package com.crm.crm.entity;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Usuario")
    private Long id;
    
    @Column
    private String name;
    
    @Column
    private String email;
    
    @Column
    private String senha;
    
    @Column
    private String CPF;

    @Column
    private String Telefone;
    
    @Column
    private String cargo;

    @Column
    private LocalDate dataCriada;

    @OneToMany(mappedBy = "usuarioOrcamento")
    private Collection<Orcamento> orcamentos; 

    @OneToMany(mappedBy = "usuario")
    private Collection<Consulta> consultas;
    
}
