package com.infinite.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infinite.Repository.QuizRepository;
import com.infinite.helper.Question;
import com.infinite.helper.ResponseObjects;
import com.infinite.pojo.Quiz;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);

	}

	public List<Quiz> get() {
		return quizRepository.findAll();

	}

	public ResponseObjects getOne(Long quizId) {

		System.out.println("Q-2");
		ResponseObjects vo = new ResponseObjects();

		Quiz quiz = quizRepository.findAllByQuizId(quizId);
		
		System.out.println("Q-3");
		Question[] question = restTemplate.getForObject(
				"http://localhost:9001/question/list/" + quiz.getQuizId(), Question[].class);
		//questionList = Arrays.asList(question);
		System.out.println("Q-4");
		vo.setQuiz(quiz);
		vo.setQuestion(question);

		return vo;

	}
}
