package com.psbm.fazbearentertainment.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private Long id_clie;

    @JsonProperty("nm_clie")
    private String nm_clie;

    @JsonProperty("email_clie")
    private String email_clie;

    @JsonProperty("senha_clie")
    private String senha_clie;

    @JsonCreator
    public Cliente(@JsonProperty("id_clie") Long id_clie,@JsonProperty("nm_clie") String nm_clie,@JsonProperty("email_clie") String email_clie, @JsonProperty("senha_clie") String senha_clie) {
        this.id_clie = id_clie;
        this.nm_clie = nm_clie;
        this.email_clie = email_clie;
        this.senha_clie = senha_clie;
    }

}
