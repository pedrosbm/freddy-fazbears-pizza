package com.psbm.fazbearentertainment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_produto;

    private String nome_produto;

    
    private String tipo_produto;
    
    private Double preco_produto;
    
    private String slug;
}