package com.food_delivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food_delivery.model.exam.Question;
import com.food_delivery.model.exam.Quiz;

import java.util.Set;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
