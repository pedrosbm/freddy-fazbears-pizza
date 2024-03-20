package com.psbm.fazbearentertainment.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @JsonProperty("id_clie")
    private Long id;

    @Size(min = 3, max = 50)
    @JsonProperty("nm_clie")
    private String nome;

    @Size(min = 3)
    @JsonProperty("email_clie")
    private String email;

    @NotBlank
    @JsonProperty("senha_clie")
    private String senha;
}