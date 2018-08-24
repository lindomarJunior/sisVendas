package com.tutorial.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
