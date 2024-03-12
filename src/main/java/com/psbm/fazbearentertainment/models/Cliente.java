package com.psbm.fazbearentertainment.models;

import java.util.Random;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cliente {
    
    @Id
    @JsonProperty("id_clie")
    private Long id;

    @JsonProperty("nm_clie")
    private String nome;

    @JsonProperty("email_clie")
    private String email;

    @JsonProperty("senha_clie")
    private String senha;

    @JsonCreator
    public Cliente(@JsonProperty("nm_clie") String nome,  @JsonProperty("email_clie") String email, @JsonProperty("senha_clie") String senha) {
        this.id = new Random().nextLong(0, 100000000000000l);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @JsonCreator
    public Cliente(@JsonProperty("id_clie")Long id,@JsonProperty("nm_clie") String nome,@JsonProperty("email_clie") String email,@JsonProperty("senha_clie") String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }   
}