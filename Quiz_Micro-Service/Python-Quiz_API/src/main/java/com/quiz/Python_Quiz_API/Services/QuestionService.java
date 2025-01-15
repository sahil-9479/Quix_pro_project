package com.quiz.Python_Quiz_API.Services;

import com.quiz.Python_Quiz_API.Entity.PythonQuestion;
import com.quiz.Python_Quiz_API.Repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionsRepo questionsRepo;


    public List<PythonQuestion> getAllQuestions(){
        List<PythonQuestion> allQuestions = questionsRepo.findAll();
        return allQuestions;
    }

    public List<PythonQuestion> saveAllQuestions(List<PythonQuestion> questions){
        List<PythonQuestion> pythonQuestions = questionsRepo.saveAll(questions);
        return pythonQuestions;
    }

    public void deletedata(){
        questionsRepo.deleteAll();
    }
}
