package com.crm.crm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
    private String observacao;
    
    @Column
    private LocalDate dataMarcada;

    @Column
    private LocalDate dataCriada;

    @Column
    private String status;


    @ManyToOne()
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "id_Orcamento")
    private Orcamento orcamento;


}
