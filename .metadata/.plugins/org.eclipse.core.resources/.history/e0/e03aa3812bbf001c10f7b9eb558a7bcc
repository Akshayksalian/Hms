package com.hms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * 
 */
@Entity
public class Candidates_skills implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidates_skills_id;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "technology_id")
	private Technology_stack technology_stack_fk_cand;

	public Candidates_skills() {
		super();
	}

	public Candidates_skills(int candidates_skills_id, Technology_stack technology_stack_fk_cand) {
		super();
		this.candidates_skills_id = candidates_skills_id;
		this.technology_stack_fk_cand = technology_stack_fk_cand;
	}

	public int getCandidates_skills_id() {
		return candidates_skills_id;
	}

	public Technology_stack getTechnology_stack_fk_cand() {
		return technology_stack_fk_cand;
	}

	public void setTechnology_stack_fk_cand(Technology_stack technology_stack_fk_cand) {
		this.technology_stack_fk_cand = technology_stack_fk_cand;
	}

	@Override
	public String toString() {
		return "Candidates_skills [candidates_skills_id=" + candidates_skills_id + ", technology_stack_fk_cand="
				+ technology_stack_fk_cand + "]";
	}

}
