package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food_delivery.model.exam.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
