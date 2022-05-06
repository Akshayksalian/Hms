package com.hms.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.hms.entities.Candidates;
import com.hms.entities.Interviewer;

public interface InterviewersDAO {

	public abstract Interviewer findInterviewerById(int id, LocalDateTime availability);

	public abstract List<Interviewer> findAllInterviewers();

	public abstract void addInterviewer(Interviewer interviewer);

	public abstract Interviewer updateInterviewer(Interviewer interviewer, Candidates ca);

	public abstract List<Interviewer> preferredInterviewers(int id);
}