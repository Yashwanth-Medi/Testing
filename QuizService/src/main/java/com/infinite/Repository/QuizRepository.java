package com.infinite.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.pojo.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
	Quiz findByquestionId(Long Id);

	Quiz findByQuizId(Long quizId);

	Quiz findAllByQuizId(Long quizId); 
}
