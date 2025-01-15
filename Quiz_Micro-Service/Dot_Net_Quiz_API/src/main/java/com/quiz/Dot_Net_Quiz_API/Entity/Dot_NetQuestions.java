package com.quiz.Dot_Net_Quiz_API.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dot_NetQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String questionText;
    private String correctAnswer;

    @ElementCollection
    @CollectionTable(name = "Dot_Net_Question_options" , joinColumns = @JoinColumn(name = "Dot_Net_question_id"))
    @Column(name = "Dot_Net_option_text")
    private List<String> options;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
