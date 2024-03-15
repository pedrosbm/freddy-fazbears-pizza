package com.psbm.fazbearentertainment.models;

import java.util.Random;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cliente {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id_clie")
    private Long id;

    @JsonProperty("nm_clie")
    private String nome;

    @JsonProperty("email_clie")
    private String email;

    @JsonProperty("senha_clie")
    private String senha;
}