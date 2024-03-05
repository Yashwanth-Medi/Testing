package com.infinite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.Pojo.Question;
import com.infinite.Repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	
	public Question create(Question question) {
		return questionRepository.save(question);
		
	}
	
	public List<Question> get(){
		return questionRepository.findAll();
		
	}
	public Question getOne(Long id) {
		return questionRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		
	}
	
	public List<Question> listQuestion(Long quizId) {
		
		return questionRepository.findAllByquizId(quizId);
		}

}
