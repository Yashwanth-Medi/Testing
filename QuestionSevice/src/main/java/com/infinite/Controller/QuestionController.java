package com.infinite.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.Pojo.Question;
import com.infinite.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping("/save")
	public Question create(@RequestBody Question question) {
		return questionService.create(question);

	}

	@GetMapping
	public List<Question> getAll() {
		return questionService.get();
	}
	
	@GetMapping("/{questionid}")
	public Question getOne(@PathVariable Long questionid ) {
		return questionService.getOne(questionid);
		
	}
	
	@GetMapping("/list/{quizId}")
	public List<Question> listQuestion(@PathVariable Long quizId) {
		System.out.println("L-1");
		return questionService.listQuestion(quizId);
	}
}
