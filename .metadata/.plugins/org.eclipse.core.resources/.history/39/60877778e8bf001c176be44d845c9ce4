package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * 
 */
@Entity
public class Questionaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String answer;

	public Questionaire() {
		super();
	}

	public Questionaire(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questionaire [id=" + id + ", answer=" + answer + "]";
	}
}
