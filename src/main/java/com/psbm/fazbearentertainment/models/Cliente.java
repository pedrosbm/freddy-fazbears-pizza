package com.psbm.fazbearentertainment.models;

import java.util.Random;

public record Cliente(Long id_clie, String nm_clie, String email_clie, String senha_clie) {
    
    public Cliente(Long id_clie, String nm_clie, String email_clie, String senha_clie){
        var key = (id_clie != null) ? id_clie : Math.abs(new Random().nextLong());
        this.id_clie = key;
        this.nm_clie = nm_clie;
        this.email_clie = email_clie;
        this.senha_clie = senha_clie;
    }
}
