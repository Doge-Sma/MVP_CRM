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

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
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
    private LocalDate dataCriado;
    
    
    @Column
    private String pagamento;

    @Column String status;

    @ManyToOne()
    @JoinColumn(name = "id_Usuario")
    private Usuario usuarioOrcamento;

    @OneToOne
    @JoinColumn(name = "id_Medico")
    private Medico medico;
    

    @ManyToMany
    @JoinTable(name = "orcamento_Procedimento",
    joinColumns = @JoinColumn(name = "id_Orcamento"),
    inverseJoinColumns = @JoinColumn(name = "id_Procedimento"))
    private Collection<Procedimento> orcamento_procedimentos;


    public Orcamento(){
        this.valotTotal = (long) 0;
    }


    
}
