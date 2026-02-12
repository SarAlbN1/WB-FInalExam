package com.sara.backexamenfinalweb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "contrato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "identificador", length = 255, nullable = false)
    private String identificador;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "nombre_contratante", length = 255)
    private String nombre_contratante;

    @Column(name = "documento_contratante", length = 255)
    private String documento_contratante;

    @Column(name = "nombre_contratantista", length = 255)
    private String nombre_contratantista;

    @Column(name = "documento_contratantista", length = 255)
    private String documento_contratantista;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicial")
    private Date fecha_inicial;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_final")
    private Date fecha_final;

    @ManyToOne
    @JoinColumn(name = "entidad_id", nullable = false)
    private Entidad entidad;
}
