package com.question.questionservice.Services;

import com.question.questionservice.Entities.Question;
import java.util.List;
public interface QuestionService {
    
    Question create(Question question);

    List<Question>get();

    Question getOne(Long Id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
