package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.InterviewersDAO;
import com.hms.entities.Interviewer;
import com.hms.entities.InterviewerIdentity;

@Service
@Transactional(readOnly = true)
public class InterviewersServiceImpl implements InterviewersService {
	
		@Autowired
		private InterviewersDAO dao;

		@Override
		public InterviewerIdentity findInterviewerById(int id) {
			InterviewerIdentity interviewerIdentity = dao.findInterviewerById(id);
			return interviewerIdentity;
		}

		@Override
		public List<Interviewer> findAllInterviewers() {
			return dao.findAllInterviewers();
		}

		@Override
		@Transactional
		public void addInterviewer(Interviewer interviewer) {
			dao.addInterviewer(interviewer);
		}

}