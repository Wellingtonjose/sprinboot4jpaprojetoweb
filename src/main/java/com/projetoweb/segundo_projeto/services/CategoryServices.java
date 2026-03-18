package com.projetoweb.segundo_projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.segundo_projeto.entities.Category;
import com.projetoweb.segundo_projeto.repositories.CategoryRepository;
@Service
public class CategoryServices {
	@Autowired 	
	private CategoryRepository respository;
	public List<Category> findAll(){
		return respository.findAll();	
	} 

	public Category findyById(Long id) {
		Optional<Category> op = respository.findById(id);
		return op.get();
	}
}
