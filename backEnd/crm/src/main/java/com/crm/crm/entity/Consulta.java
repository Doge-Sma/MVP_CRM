package com.crm.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Consulta")
    private Long id;

    @Column
    private String procedimento;

    @Column
    private Long orcamento;
    
    @Column
    private String observacao;
    
    @Column
    private Long idMedico;
    
    @Column
    private Long idUsuario;

    @Column
    private String data;

    @Column
    private String status;
}
