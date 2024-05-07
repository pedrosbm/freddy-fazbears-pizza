package com.psbm.fazbearentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psbm.fazbearentertainment.models.Cliente;
import com.psbm.fazbearentertainment.models.Login;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByEmailAndSenha(Login login);
}