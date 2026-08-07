package com.spring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
