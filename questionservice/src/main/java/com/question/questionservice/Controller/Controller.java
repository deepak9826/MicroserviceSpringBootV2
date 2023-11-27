package com.question.questionservice.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.service.annotation.GetExchange;

import com.question.questionservice.Entities.Question;
import com.question.questionservice.Services.QuestionService;

// import lombok.experimental.PackagePrivate;

@RestController
@RequestMapping("/question")
public class Controller {

    private QuestionService questionService;

    public Controller(QuestionService questionService) {
        this.questionService = questionService;
    }
    @PostMapping
    private Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping
    private List<Question> get(){
        return questionService.get();
    }
    @GetMapping("/{questionId}")
    private Question getAll(@PathVariable Long questionId){
        return questionService.getOne(questionId);
    }
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionOfQuiz(quizId);
    }
}
