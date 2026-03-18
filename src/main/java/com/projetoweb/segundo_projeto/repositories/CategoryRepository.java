package com.projetoweb.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.segundo_projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
