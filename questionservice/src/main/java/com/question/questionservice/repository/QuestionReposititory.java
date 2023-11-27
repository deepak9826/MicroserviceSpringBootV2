package com.question.questionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.questionservice.Entities.Question;
import java.util.List;


public interface QuestionReposititory extends JpaRepository<Question,Long>{
    List<Question> findByQuizId(Long quizId);
}
