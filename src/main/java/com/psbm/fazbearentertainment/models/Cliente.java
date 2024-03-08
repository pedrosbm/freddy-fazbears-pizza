package com.psbm.fazbearentertainment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cliente {
    
    @Id
    private Long id_clie;
    private String nm_clie;
    private String email_clie;
    private String senha_clie;


}
