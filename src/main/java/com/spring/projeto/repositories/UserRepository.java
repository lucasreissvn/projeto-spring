package com.spring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
