package com.hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hms.entities.Candidates;

/*
 * 
 */
@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceContext
	private EntityManager em;

	/*
	 * 
	 */
	@Override
	public Candidates getCandidateById(int id) {
		Candidates candidates = em.find(Candidates.class, id);
		return candidates;
	}
	
	/*
	 * 
	 */
	@Override
	public List<Candidates> getAllCandidates() {
		  return em.createQuery("SELECT c FROM Candidates c", Candidates.class).getResultList();   
	}

}
