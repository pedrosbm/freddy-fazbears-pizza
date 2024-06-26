package com.psbm.fazbearentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psbm.fazbearentertainment.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByEmailAndSenha(String email, String senha);
}