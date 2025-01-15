package com.quiz.Dot_Net_Quiz_API.Controller;


import com.quiz.Dot_Net_Quiz_API.Entity.Dot_NetQuestions;
import com.quiz.Dot_Net_Quiz_API.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/DotNet_Api")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/Get_DotNet_Questions")
    public List<Dot_NetQuestions> getAllQuestions(){
        List<Dot_NetQuestions> allQuestions = questionService.getAllQuestions();
        return allQuestions;
    }

    @PostMapping(value = "/save_DotNet_Questions" , consumes = "application/json" , produces = "application/json")
    public List<Dot_NetQuestions> saveAllQuestions(@RequestBody List<Dot_NetQuestions> Questions)
    {
        List<Dot_NetQuestions> pythonQuestions = questionService.saveAllQuestions(Questions);
        return pythonQuestions;
    }

    @DeleteMapping("/delete")
    public String deletedata(){
        questionService.deletedata();
        return "success";
    }
}
