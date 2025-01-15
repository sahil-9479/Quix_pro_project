package com.quiz.Java_Quiz_API.Controller;


import com.quiz.Java_Quiz_API.Entity.JavaQuestions;
import com.quiz.Java_Quiz_API.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/java_Api")
public class QuestionController {

    @Autowired
    QuestionService questionService;

//    for transfer to the client side
    @GetMapping("/JavaQuestions")
    public List<JavaQuestions> getAllQuestions(){
        List<JavaQuestions> allQuestions = questionService.getAllQuestions();
        return allQuestions;
    }

    @PostMapping(value = "/saveAllQuestions" , consumes = "application/json" , produces = "application/json")
    public List<JavaQuestions> saveAllQuestions(@RequestBody List<JavaQuestions> questionsList){
        List<JavaQuestions> javaQuestions = questionService.saveAllQuestions(questionsList);
        return javaQuestions;
    }

    @DeleteMapping("/delete")
    public String deletedata(){
        questionService.deletedata();
        return "success";
    }
}
