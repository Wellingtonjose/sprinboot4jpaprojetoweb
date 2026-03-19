package com.projetoweb.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.segundo_projeto.entities.OrderItem;
import com.projetoweb.segundo_projeto.entities.pk.OrderItempk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItempk> {

}
