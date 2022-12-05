package com.crm.crm.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
@Entity
public class Procedimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long id;

    @Column
    public String nome;

    @Column
    public String tipo;

    @Column
    public String descricao;

    @Column
    public Long valor;

    @ManyToMany(mappedBy = "orcamento_procedimentos")
    private Collection<Orcamento> orcamentos;
}
