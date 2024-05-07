package com.psbm.fazbearentertainment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.psbm.fazbearentertainment.models.Cliente;
import com.psbm.fazbearentertainment.models.Login;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByEmailAndSenha(String email, String senha);
}