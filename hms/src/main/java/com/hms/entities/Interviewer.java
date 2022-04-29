package com.hms.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/*
 * 
 */
@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "byInterviwerId", query = "select * from interviewer where interviewers_id=? and availability = ?", resultClass = Interviewer.class) })
public class Interviewer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4155403946253518758L;

	@EmbeddedId
	private InterviewerIdentity interviewerIdentity;

	private String name;
	private int exp;
	private String status;
	private String interview_skills;

	public Interviewer() {
		super();
	}

	public Interviewer(InterviewerIdentity interviewerIdentity, String name, int exp, String status,
			String interview_skills) {
		super();
		this.interviewerIdentity = interviewerIdentity;
		this.name = name;
		this.exp = exp;
		this.status = status;
		this.interview_skills = interview_skills;
	}

	public InterviewerIdentity getInterviewerIdentity() {
		return interviewerIdentity;
	}

	public void setInterviewerIdentity(InterviewerIdentity interviewerIdentity) {
		this.interviewerIdentity = interviewerIdentity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInterview_skills() {
		return interview_skills;
	}

	public void setInterview_skills(String interview_skills) {
		this.interview_skills = interview_skills;
	}

	@Override
	public String toString() {
		return "Interviewer [interviewerIdentity=" + interviewerIdentity + ", name=" + name + ", exp=" + exp
				+ ", status=" + status + ", interview_skills=" + interview_skills + "]";
	}

}