package com.quiz.JS_Quiz_API.Repo;

import com.quiz.JS_Quiz_API.Entity.JSQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepo extends JpaRepository<JSQuestions , Long> {
}
