package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.ContasAPagar;


public class ContasAPagarDao implements ContasAPagarDaoInterface {
	
	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;

	@Override
	public ContasAPagar salvarContasAPagar(ContasAPagar contasAPagar) {
		entityManager.persist(contasAPagar);
		return contasAPagar;
	}

	@Override
	public void alterarContasAPagar(ContasAPagar contasAPagar) {
		ContasAPagar contasAPagarMerge = entityManager.merge(contasAPagar);
		entityManager.persist(contasAPagarMerge);
		
	}

	@Override
	public void excluirContasAPagar(ContasAPagar contasAPagar) {
		ContasAPagar contasAPagarMerge = entityManager.merge(contasAPagar);
		entityManager.remove(contasAPagarMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ContasAPagar> getContasAPagar() {
		Query query = entityManager.createQuery("from ContasAPagar");
		return query.getResultList();
	}

}
