package com.hms.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * 
 */
@Entity
public class Interviewer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interviewers_id;

	private String name;
	private String exp;

	private LocalDate availability;

	@OneToOne(mappedBy = "interviewer")
	private Candidates candidates;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "interviewers_id", referencedColumnName = "interviewers_id")
	private List<Interviewers_skills> interviewers_skill = new ArrayList<>();

	public Interviewer() {
		super();
	}

	public Interviewer(int interviewers_id, String name, String exp, LocalDate availability, Candidates candidates,
			List<Interviewers_skills> interviewers_skill) {
		super();
		this.interviewers_id = interviewers_id;
		this.name = name;
		this.exp = exp;
		this.availability = availability;
		this.candidates = candidates;
		this.interviewers_skill = interviewers_skill;
	}

	public int getInterviewers_id() {
		return interviewers_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public LocalDate getAvailability() {
		return availability;
	}

	public void setAvailability(LocalDate availability) {
		this.availability = availability;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}

	public List<Interviewers_skills> getInterviewers_skill() {
		return interviewers_skill;
	}

	public void setInterviewers_skill(List<Interviewers_skills> interviewers_skill) {
		this.interviewers_skill = interviewers_skill;
	}

	@Override
	public String toString() {
		return "Interviewer [interviewers_id=" + interviewers_id + ", name=" + name + ", exp=" + exp + ", availability="
				+ availability + ", candidates=" + candidates + ", interviewers_skill=" + interviewers_skill + "]";
	}

}