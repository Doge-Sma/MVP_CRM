package com.crm.crm.entity;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @Column
    private String status;

    @ManyToMany
    @JoinTable(name = "Medicos_Consultas",
    joinColumns = @JoinColumn(name = "id_Consulta"),
    inverseJoinColumns = @JoinColumn(name = "id_Medico"))
    private Collection<Medico> medicoConsulta;

    @ManyToOne()
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "id_Orcamento")
    private Orcamento orcamento;


}
