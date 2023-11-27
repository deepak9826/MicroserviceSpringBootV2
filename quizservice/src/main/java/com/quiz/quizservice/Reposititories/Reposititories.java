package com.quiz.quizservice.Reposititories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizservice.Entities.Quiz;

public interface Reposititories extends JpaRepository<Quiz,Long>{

}
