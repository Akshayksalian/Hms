package com.hms.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.CandidatesDAOImpl;
import com.hms.entities.Candidates;
import com.hms.entities.Domain;

/*
 * 
 */
@Service
@Transactional(readOnly = false)
public class CandidatesServiceImpl implements CandidatesService {

	@Autowired
	private CandidatesDAOImpl dao;

	@Override
	public Candidates findCandidateById(int id) {
		Candidates candidates = dao.findCandidateById(id);
		return candidates;
	}

	@Override
	public List<Candidates> findAllCandidates() {
		return dao.findAllCandidates();
	}

	@Override
	@Transactional
	public void addCandidates(Candidates candidates) {
		dao.addCandidates(candidates);
	}

	@Override
	@Transactional
	public Candidates updateCandidatesQuestionnaires(Candidates candidates) {
		Candidates c = findCandidateById(candidates.getCandidates_id());
		if (c == null) {
			throw new IllegalArgumentException("Id not Found " + candidates.getCandidates_id());
		}
		c.setNotice_period(candidates.getNotice_period());
		c.setExpected_ctc(candidates.getExpected_ctc());
		c.setShifts(candidates.getShifts());
		c.setRelocation(candidates.getRelocation());
		return dao.updateCandidatesQuestionnaires(c);
	}

	@Override
	@Transactional
	public void deleteCandidates(int id) {
		Candidates u = findCandidateById(id);
		if (u == null) {
			throw new IllegalArgumentException("ID not found " + id);
		}
		dao.deleteCandidates(u);
	}

	@Override
	public List<Candidates> findByDomainId(int id) {
		return dao.findByDomainId(id);
	}

	@Override
	public void fetchCandidates() {

		String file = "D:\\CSVDemo.csv";
		Path pathToFile = Paths.get(file);
		List<Candidates> candList = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(pathToFile)) {

			String row = br.readLine();
			while (row != null) {
				String[] attributes = row.split(",");
				Candidates cand = getOneCandidate(attributes);
				candList.add(cand);
				row = br.readLine();
				dao.addCandidates(cand);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Candidates getOneCandidate(String[] attr) {

		Candidates can = new Candidates();
		can.setName(attr[0]);
		int exp = Integer.parseInt(attr[1]);
		can.setExp(exp);
		can.setCandidate_skills(attr[2]);
		can.setEmail(attr[3]);
		can.setContact_no(attr[4]);
		can.setCompany_name(attr[5]);
		can.setCandidates_location(attr[6]);

		Domain d = new Domain();
		d.setDomain_id(Integer.parseInt(attr[7]));

		can.setDomain(d);

		return can;
	}

}
