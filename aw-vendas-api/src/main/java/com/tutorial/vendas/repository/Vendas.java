package com.tutorial.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
