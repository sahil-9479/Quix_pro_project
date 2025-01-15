package com.quiz.Dot_Net_Quiz_API.Services;


import com.quiz.Dot_Net_Quiz_API.Entity.Dot_NetQuestions;
import com.quiz.Dot_Net_Quiz_API.Repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionsRepo questionsRepo;


    public List<Dot_NetQuestions> getAllQuestions(){
        List<Dot_NetQuestions> allQuestions = questionsRepo.findAll();
        return allQuestions;
    }

    public List<Dot_NetQuestions> saveAllQuestions(List<Dot_NetQuestions> questions){
        List<Dot_NetQuestions> pythonQuestions = questionsRepo.saveAll(questions);
        return pythonQuestions;
    }

    public void deletedata(){
        questionsRepo.deleteAll();
    }
}
