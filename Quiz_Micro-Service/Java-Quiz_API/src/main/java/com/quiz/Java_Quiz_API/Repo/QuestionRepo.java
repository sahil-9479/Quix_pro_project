package com.quiz.Java_Quiz_API.Repo;

import com.quiz.Java_Quiz_API.Entity.JavaQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<JavaQuestions, Long> {
}
