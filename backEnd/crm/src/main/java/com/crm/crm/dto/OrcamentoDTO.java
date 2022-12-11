package com.crm.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrcamentoDTO {
    private Long id;
    private Long valorTotal;
    private String data;
    private String pagamento;
    private Long idUsuario;
    private Long idMedico;

}
