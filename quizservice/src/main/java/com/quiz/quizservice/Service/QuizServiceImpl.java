package com.quiz.quizservice.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.quizservice.Entities.Quiz;
import com.quiz.quizservice.Reposititories.Reposititories;
@Service
public class QuizServiceImpl implements QuizService{
    
    private Reposititories quizrepo;

    private QuestionClient questionClient;


    
    

    public QuizServiceImpl(Reposititories quizrepo, QuestionClient questionClient) {
        this.quizrepo = quizrepo;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
       return quizrepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        
        // return quizrepo.findAll();
        List<Quiz> quizzes=quizrepo.findAll();

        List<Quiz> newQuizList=quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        
        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'get'");
    Quiz quiz=quizrepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found.."));
    quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
    return quiz;
    }
    
}
