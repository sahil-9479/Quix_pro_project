package com.quiz.Python_Quiz_API.Repo;

import com.quiz.Python_Quiz_API.Entity.PythonQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepo extends JpaRepository<PythonQuestion, Long> {
}
