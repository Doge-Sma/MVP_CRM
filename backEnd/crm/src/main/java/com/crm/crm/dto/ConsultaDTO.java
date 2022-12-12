package com.crm.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaDTO {
    private Long id;
    private String observacao;
    private String dataMarcada;
    private String dataCriada;
    private String status;
    private Long idUsuario;
    private Long idOrcamento;

    
}
