package com.hms.dao;

import java.util.List;

import com.hms.entities.Candidates;

public interface CandidatesDAO {

	public abstract Candidates findCandidateById(int id);

	public abstract List<Candidates> findAllCandidates();

	public abstract void addCandidates(Candidates candidates);

	public abstract void deleteCandidates(Candidates candidates);

	public abstract Candidates updateCandidatesQuestionnaires(Candidates candidates);

	public abstract Candidates updateCandidatesFeedback(Candidates candidates);

	public abstract List<Candidates> findByDomainId(int id);

}
