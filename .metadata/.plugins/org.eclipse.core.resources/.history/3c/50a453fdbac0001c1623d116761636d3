package com.hms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * 
 */
@Entity
public class Interviewers_skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int interviewers_skills_id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "technology_id")
	private Technology_stack technology_stack_fk_inter;

	public Interviewers_skills() {
		super();
	}

	public Interviewers_skills(int interviewers_skills_id, Technology_stack technology_stack_fk_inter) {
		super();
		this.interviewers_skills_id = interviewers_skills_id;
		this.technology_stack_fk_inter = technology_stack_fk_inter;
	}

	public int getInterviewers_skills_id() {
		return interviewers_skills_id;
	}

	public Technology_stack getTechnology_stack_fk_inter() {
		return technology_stack_fk_inter;
	}

	public void setTechnology_stack_fk_inter(Technology_stack technology_stack_fk_inter) {
		this.technology_stack_fk_inter = technology_stack_fk_inter;
	}

	@Override
	public String toString() {
		return "Interviewers_skills [interviewers_skills_id=" + interviewers_skills_id + ", technology_stack_fk_inter="
				+ technology_stack_fk_inter + "]";
	}

}