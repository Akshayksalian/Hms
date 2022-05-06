package com.hms.service;

import java.util.List;

import com.hms.entities.Candidates;
import com.hms.entities.Interviewer;

public interface InterviewersService {
	
	public abstract Interviewer findInterviewerById(int id,String availability);

	public abstract List<Interviewer> findAllInterviewers();

	public abstract void addInterviewer(Interviewer interviewer);
	
	public abstract Interviewer UpdateInterviewer(Interviewer interviewer,int candId);
	
	public List<Interviewer> preferredInterviewers(int id);

}