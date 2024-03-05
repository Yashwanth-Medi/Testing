package com.infinite.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.helper.ResponseObjects;
import com.infinite.pojo.Quiz;
import com.infinite.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@PostMapping("/save")
	public Quiz Create(@RequestBody Quiz quiz) {
		return quizService.addQuiz(quiz);

	}

	@GetMapping("/{id}")
	public ResponseObjects getOne(@PathVariable("id") Long quizId) {
		System.out.println("Q-1");
		return quizService.getOne(quizId);

	}

}
