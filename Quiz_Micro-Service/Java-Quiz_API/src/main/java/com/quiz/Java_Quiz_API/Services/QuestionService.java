package com.quiz.Java_Quiz_API.Services;

import com.quiz.Java_Quiz_API.Entity.JavaQuestions;
import com.quiz.Java_Quiz_API.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

//    for getting all the data From the Database
    public List<JavaQuestions> getAllQuestions(){
        List<JavaQuestions> allQuestions = questionRepo.findAll();
        return allQuestions;
    }

    public List<JavaQuestions> saveAllQuestions(List<JavaQuestions> questions){
        List<JavaQuestions> javaQuestions = questionRepo.saveAll(questions);
        return javaQuestions;
    }

    public void deletedata(){
        questionRepo.deleteAll();
    }
}
