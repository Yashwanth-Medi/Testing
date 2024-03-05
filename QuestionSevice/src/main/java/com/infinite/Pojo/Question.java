package com.infinite.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionId;
	private String question;
	private Long quizId;
	
	
	
	public Long getQuizId() {
		return quizId;
	}



	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}



	public Long getQuestionId() {
		return questionId;
	}



	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}







	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
