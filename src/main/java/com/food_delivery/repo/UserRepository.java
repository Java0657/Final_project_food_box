package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food_delivery.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
