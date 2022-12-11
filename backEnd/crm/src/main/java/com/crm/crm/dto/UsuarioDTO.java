package com.crm.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String name;
    private String email;
    private String senha;
    private String CPF;
    private String Telefone;
    private String cargo;
    private String dataCriada;
}
