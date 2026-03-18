package com.projetoweb.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.segundo_projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
