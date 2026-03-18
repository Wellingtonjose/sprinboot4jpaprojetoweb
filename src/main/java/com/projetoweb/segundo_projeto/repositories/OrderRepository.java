package com.projetoweb.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.segundo_projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
