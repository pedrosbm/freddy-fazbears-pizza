package com.psbm.fazbearentertainment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.psbm.fazbearentertainment.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query("select m from endereco where clienteId = ?1")
    public Endereco findByCliente(Long clienteId);
}
