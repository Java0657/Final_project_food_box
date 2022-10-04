package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food_delivery.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
