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
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
    private Long valotTotal;
    
    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    
    @Column
    private String medico;
    
    @Column
    private String pagamento;
    
    @Column
    private String observacao;

    @ManyToMany
    @JoinTable(name = "orcamento_Procedimento",
    joinColumns = @JoinColumn(name = "id_Orcamento"),
    inverseJoinColumns = @JoinColumn(name = "id_Procedimento"))
    private Collection<Procedimento> orcamento_procedimentos;





    
}
