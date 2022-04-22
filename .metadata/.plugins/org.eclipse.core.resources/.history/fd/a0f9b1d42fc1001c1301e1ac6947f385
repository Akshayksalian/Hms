package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.dao.AdminDAO;
import com.hms.entities.Candidates;

/*
 * 
 */
@Service
//@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;

	@Override
	public Candidates getCandidateById(int id) {
		Candidates candidates = dao.getCandidateById(id);
		return candidates;
	}
	
	@Override
	public List<Candidates> getAllCandidates() {
		return dao.getAllCandidates();
	}

}
