package com.projetoweb.segundo_projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.segundo_projeto.entities.User;
import com.projetoweb.segundo_projeto.repositories.UserRepository;
@Service
public class UserServices {
	@Autowired 	
	private UserRepository repository;
	public List<User> findAll(){
		return repository.findAll();	
	} 
	public User findyById(Long id) {
		Optional<User> op = repository.findById(id);
		return op.get();
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
