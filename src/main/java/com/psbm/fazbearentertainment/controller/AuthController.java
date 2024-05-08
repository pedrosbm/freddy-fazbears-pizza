package com.psbm.fazbearentertainment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psbm.fazbearentertainment.models.Cliente;
import com.psbm.fazbearentertainment.models.Login;
import com.psbm.fazbearentertainment.repository.ClienteRepository;

@RestController
@RequestMapping(path = "/login")
public class AuthController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    private ResponseEntity<Cliente> authenticate(@RequestBody Login login) {
        try {
            Cliente cliente = repository.findByEmailAndSenha(login.getEmail(), login.getSenha());

            return ResponseEntity.ok(cliente);
        } catch (Exception e) {
            e.printStackTrace();

            return ResponseEntity.notFound().build();
        }

    }
}