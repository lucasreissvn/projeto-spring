package com.spring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
