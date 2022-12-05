package com.crm.crm.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Medico")
    private Long id;

    @Column
    private String name;

    @Column
    private String Cargo;
    
    @Column
    private String crm;

    @ManyToMany(mappedBy = "medicoConsulta")
    private Collection<Consulta> consultaMedico;
}
