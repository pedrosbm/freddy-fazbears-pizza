package com.psbm.fazbearentertainment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.psbm.fazbearentertainment.models.Cliente;
import com.psbm.fazbearentertainment.repository.ClienteRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/user")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Cliente> getUser(@PathVariable long id) {
        try {
            Cliente user = repository.findById(id).get();

            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).build();
        }
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> newUser(@RequestBody @Valid Cliente cliente) {
        try {
            repository.save(cliente);

            return ResponseEntity.ok("Usuário cadastrado");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<String> editUser(@RequestBody @Valid Cliente cliente) {
        try {
            repository.saveAndFlush(cliente);

            return ResponseEntity.status(200).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        try {
            repository.deleteById(id);

            return ResponseEntity.ok("Usuário apagado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(404).build();

        }
    }
}