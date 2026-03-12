package com.projetoweb.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.segundo_projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
