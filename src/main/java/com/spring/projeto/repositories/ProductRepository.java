package com.spring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
