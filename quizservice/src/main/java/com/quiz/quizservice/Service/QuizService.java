package com.quiz.quizservice.Service;

import java.util.List;

import com.quiz.quizservice.Entities.Quiz;

public interface QuizService {
    
    Quiz add(Quiz quiz);
    
    List<Quiz>get();

    Quiz get(Long id);

}
