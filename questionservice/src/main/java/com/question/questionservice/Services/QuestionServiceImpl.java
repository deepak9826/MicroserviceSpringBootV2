package com.question.questionservice.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.questionservice.Entities.Question;
import com.question.questionservice.repository.QuestionReposititory;
@Service
public class QuestionServiceImpl implements QuestionService{

    private QuestionReposititory questionrepo;

    
    public QuestionServiceImpl(QuestionReposititory questionrepo) {
        this.questionrepo = questionrepo;
    }

    @Override
    public Question create(Question question) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'create'");
        return questionrepo.save(question);
    }

    @Override
    public List<Question> get() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'get'");\
        return questionrepo.findAll();
    }

    @Override
    public Question getOne(Long Id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getOne'");
        return questionrepo.findById(Id).orElseThrow(() -> new RuntimeException("question is not found.."));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getQuestionOfQuiz'");
        return questionrepo.findByQuizId(quizId);
    }
    
    
}
