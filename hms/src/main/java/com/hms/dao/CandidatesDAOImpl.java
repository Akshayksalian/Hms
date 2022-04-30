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
public class CandidatesDAOImpl implements CandidatesDAO {

	@PersistenceContext
	private EntityManager em;

	/*
	 * Get the candidates By Id.
	 */
	@Override
	public Candidates findCandidateById(int id) {
		Candidates candidates = em.find(Candidates.class, id);
		return candidates;
	}

	/*
	 * Get all the candidates present in the table.
	 */
	@Override
	public List<Candidates> findAllCandidates() {
		return em.createQuery("SELECT c FROM Candidates c", Candidates.class).getResultList();
	}

	/*
	 * Add Candidates Details into database.
	 */
	@Override
	public void addCandidates(Candidates candidates) {
		em.persist(candidates);
	}

	@Override
	public Candidates updateCandidatesQuestionnaires(Candidates candidates) {
		return em.merge(candidates);
	}

	@Override
	public void deleteCandidates(Candidates candidates) {
		em.remove(candidates);
	}

	@Override
	public List<Candidates> findByDomainId(int id) {
		List<Candidates> candidates = em.createNamedQuery("byDomainId", Candidates.class).setParameter(1, id)
				.getResultList();
		return candidates;
	}

}
