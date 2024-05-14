package com.psbm.fazbearentertainment.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

public class PizzasDataLoader implements CommandLineRunner {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PizzasDataLoader(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void run(String... args){
        jdbcTemplate.execute("insert into produto (id_produto, nome_produto, tipo_produto, preco_produto, slug) values(1, 'Pizza 4 queijos', 'Pizza', 42.99, 'P_quatroQueijos')");
    }
}
