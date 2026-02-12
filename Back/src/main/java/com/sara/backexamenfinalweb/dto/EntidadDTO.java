package com.sara.backexamenfinalweb.dto;

import lombok.Data;

import java.util.List;

@Data
public class EntidadDTO {
    private Long id;
    private String nit;
    private String nombre;
    private List<ContratoDTO> contratos;
}
