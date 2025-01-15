package com.quiz.JS_Quiz_API.Controller;


import com.quiz.JS_Quiz_API.Entity.JSQuestions;
import com.quiz.JS_Quiz_API.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/JS_Api")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/Get_JS_Questions")
    public List<JSQuestions> getAllQuestions(){
        List<JSQuestions> allQuestions = questionService.getAllQuestions();
        return allQuestions;
    }

    @PostMapping(value = "/save_JS_Questions" , consumes = "application/json" , produces = "application/json")
    public List<JSQuestions> saveAllQuestions(@RequestBody List<JSQuestions> Questions)
    {
        List<JSQuestions> pythonQuestions = questionService.saveAllQuestions(Questions);
        return pythonQuestions;
    }

    @DeleteMapping("/delete")
    public String deletedata(){
        questionService.deletedata();
        return "success";
    }
}
