package com.quiz.Dot_Net_Quiz_API.Repo;

import com.quiz.Dot_Net_Quiz_API.Entity.Dot_NetQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepo extends JpaRepository<Dot_NetQuestions, Long> {
}
