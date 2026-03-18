package com.projetoweb.segundo_projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.segundo_projeto.entities.Order;
import com.projetoweb.segundo_projeto.repositories.OrderRepository;
@Service
public class OrderServices {
	@Autowired 	
	private OrderRepository respository;
	public List<Order> findAll(){
		return respository.findAll();	
	} 
	public Order findyById(Long id) {
		Optional<Order> op = respository.findById(id);
		return op.get();
	}
}
