package com.crm.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProcedimentoDTO {
    public Long id;
    public String nome;
    public String tipo;
    public String descricao;
    public Long valor;
}
