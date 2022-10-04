package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food_delivery.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
