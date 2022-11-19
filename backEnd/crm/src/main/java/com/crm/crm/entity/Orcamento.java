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
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Orcamento")
    private Long id;

    @Column
    private String procedimento;
    
    @Column
    private Long valotTotal;
    
    @Column
    private String data;
    
    @Column
    private String medico;
    
    @Column
    private String pagamento;
    
    @Column
    private String observacao;

    
}
