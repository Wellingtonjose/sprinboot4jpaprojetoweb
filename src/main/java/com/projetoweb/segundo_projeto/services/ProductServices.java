package com.projetoweb.segundo_projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.segundo_projeto.entities.Product;
import com.projetoweb.segundo_projeto.repositories.ProductRepository;
@Service
public class ProductServices {
	@Autowired 	
	private ProductRepository respository;
	public List<Product> findAll(){
		return respository.findAll();	
	} 

	public Product findyById(Long id) {
		Optional<Product> op = respository.findById(id);
		return op.get();
	}
}
