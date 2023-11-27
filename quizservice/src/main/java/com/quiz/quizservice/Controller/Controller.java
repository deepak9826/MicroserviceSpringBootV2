package com.quiz.quizservice.Controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quizservice.Entities.Quiz;
import com.quiz.quizservice.Service.QuizService;

@RestController
@RequestMapping("/quiz")
public class Controller {
    // @Autowired
   private  QuizService quizService;

public Controller(QuizService quizService) {
    this.quizService = quizService;
}
@PostMapping
 public Quiz create(@RequestBody Quiz quiz){
  return quizService.add(quiz);  
 }
 @GetMapping
 public List<Quiz> get(){
    return quizService.get();
 }
 @GetMapping("/{id}")
 public Quiz getOne(@PathVariable Long id){
    return quizService.get(id);
 }
}
