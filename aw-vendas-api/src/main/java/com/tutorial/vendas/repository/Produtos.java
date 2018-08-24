package com.tutorial.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
