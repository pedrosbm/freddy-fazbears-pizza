package com.psbm.fazbearentertainment.controller;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psbm.fazbearentertainment.models.Endereco;
import com.psbm.fazbearentertainment.repository.EnderecoRepository;

@RestController
@RequestMapping(path = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<ArrayList<Endereco>> getEnderecoByUser(@endereco){

    }
}
