package com.quiz.JS_Quiz_API.Services;

import com.quiz.JS_Quiz_API.Entity.JSQuestions;
import com.quiz.JS_Quiz_API.Repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionsRepo questionsRepo;


    public List<JSQuestions> getAllQuestions(){
        List<JSQuestions> allQuestions = questionsRepo.findAll();
        return allQuestions;
    }

    public List<JSQuestions> saveAllQuestions(List<JSQuestions> questions){
        List<JSQuestions> pythonQuestions = questionsRepo.saveAll(questions);
        return pythonQuestions;
    }

    public void deletedata(){
        questionsRepo.deleteAll();
    }
}
