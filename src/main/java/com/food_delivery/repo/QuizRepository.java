package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.food_delivery.model.exam.Category;
import com.food_delivery.model.exam.Quiz;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    public List<Quiz> findBycategory(Category category);

    public List<Quiz> findByActive(Boolean b);

    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
