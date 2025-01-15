package com.quiz.Python_Quiz_API.Controller;


import com.quiz.Python_Quiz_API.Entity.PythonQuestion;
import com.quiz.Python_Quiz_API.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/Python_Api")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/Get_Python_Questions")
    public List<PythonQuestion> getAllQuestions(){
        List<PythonQuestion> allQuestions = questionService.getAllQuestions();
        return allQuestions;
    }

    @PostMapping(value = "/save_Python_Questions" , consumes = "application/json" , produces = "application/json")
    public List<PythonQuestion> saveAllQuestions(@RequestBody List<PythonQuestion> Questions)
    {
        List<PythonQuestion> pythonQuestions = questionService.saveAllQuestions(Questions);
        return pythonQuestions;
    }

    @DeleteMapping("/delete")
    public String deletedata(){
        questionService.deletedata();
        return "success";
    }
}
