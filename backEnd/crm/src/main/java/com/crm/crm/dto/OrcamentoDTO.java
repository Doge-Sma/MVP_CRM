package com.crm.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrcamentoDTO {
    private Long id;
    private Long valotTotal;
    private String data;
    private String pagamento;
    private String status;
    private Long idUsuario;
    private Long idMedico;

    public OrcamentoDTO(){
        this.valotTotal = (long) 0;
    }

}
