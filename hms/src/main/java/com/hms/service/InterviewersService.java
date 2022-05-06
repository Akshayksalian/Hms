package com.hms.service;

import java.time.LocalDateTime;
import java.util.List;

import com.hms.entities.Interviewer;

public interface InterviewersService {

	public abstract Interviewer findInterviewerById(int id, LocalDateTime availability);

	public abstract List<Interviewer> findAllInterviewers();

	public abstract void addInterviewer(Interviewer interviewer);

	public abstract Interviewer UpdateInterviewer(Interviewer interviewer, int candId);

	public abstract List<Interviewer> preferredInterviewers(int id);
	
	public abstract void fetchInterviewers();

}